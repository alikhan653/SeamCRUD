package com.example.seamcrud;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.intercept.PostConstruct;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class UserBean implements Serializable {

    @EJB
    private UserDao userDao;

    private List<User> users;
    private User user = new User();

    @PostConstruct
    public void init() {
        users = userDao.getAll();
    }

    public void save() {
        userDao.save(user);
        user = new User();
        users = userDao.getAll();
    }

    public void update() {
        userDao.update(user);
        user = new User();
        users = userDao.getAll();
    }

    public void delete(User user) {
        userDao.delete(user);
        users = userDao.getAll();
    }

    // getters and setters
}