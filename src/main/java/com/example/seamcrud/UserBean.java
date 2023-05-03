package com.example.seamcrud;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.intercept.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@Name("UserBean")
@Scope(ScopeType.CONVERSATION)
public class UserBean {
    @In
    private UserService userService;

    private User user = new User();
    private List<User> users;

    public UserBean(){
        users = getUserList();
    }
    public List<User> getUserList() {
        return users;
    }
    public void loadUsers() {
        users.add(new User(1L,"2","3"));
        users.add(new User(2L,"3","4"));
    }

    public void saveUser() {
        userService.addUser(user);
        user = new User();
        loadUsers();
    }

    public void updateUser(User user) {
        userService.updateUser(user);
        loadUsers();
    }

    public void deleteUser(Long id) {
        userService.deleteUser(id);
        loadUsers();
    }

    ///////////////////////////////////getter setter
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
