/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.edu.nus.iss.phoenix.user.delegate;

import java.util.List;
import sg.edu.nus.iss.phoenix.authenticate.entity.User;
import sg.edu.nus.iss.phoenix.user.service.UserService;

/**
 *
 * @author longnguyen
 */
public class UserDelegate {
    private UserService service;
    
    public List<User> findAllUser() {
        service = new UserService();
        return service.findAllUser();
    }
}
