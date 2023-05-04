package com.example.seamcrud;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.intercept.PostConstruct;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
@Name("UserBean")
public class UserBean implements Serializable {

    private List<User> users;

    @In
    private UserDAO userDao;

    public UserBean(){
        users = userDao.findAll();
    }

    public void save(User user) {
        userDao.save(user);
        users = userDao.findAll();
    }

    public void update(User user) {
        userDao.update(user);
        users = userDao.findAll();
    }

    public void delete(User user) {
        userDao.delete(user);
        users = userDao.findAll();
    }

    public User findById(Long id) {
        return userDao.findById(id);
    }

    public List<User> getUsers() {
        if (users == null) {
            users = userDao.findAll();
        }
        return users;
    }
}