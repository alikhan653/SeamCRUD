package com.example.seamcrud;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Named
@SessionScoped
public class UserList implements Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    private List<User> users;
    private User newUser = new User();

    public List<User> getUsers() {
        if (users == null) {
            reload();
        }
        return users;
    }

    @Transactional
    public void reload() {
        users = entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Transactional
    public void createUser(User newUser) {
        entityManager.persist(newUser);
        newUser = new User();
        reload();
    }

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }
}