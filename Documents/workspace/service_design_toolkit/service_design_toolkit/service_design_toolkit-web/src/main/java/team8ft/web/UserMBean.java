/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8ft.web;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import team8ft.entities.Users;

/**
 *
 * @author longnguyen
 */
@Named(value = "user")
@SessionScoped
public class UserMBean implements Serializable {

    @EJB
    private team8ft.ejb.UserSessionBean userSessionBean;

    private List<Users> users;

    /**
     * Get the value of users
     *
     * @return the value of users
     */
    public List<Users> getUsers() {
        return userSessionBean.retrieve();
    }

    /**
     * Set the value of users
     *
     * @param users new value of users
     */
    public void setUsers(List<Users> users) {
        this.users = users;
    }

    /**
     * Creates a new instance of UserMBean
     */
    public UserMBean() {
    }

}
