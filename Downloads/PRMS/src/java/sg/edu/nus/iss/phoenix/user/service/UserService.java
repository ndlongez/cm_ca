/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.edu.nus.iss.phoenix.user.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sg.edu.nus.iss.phoenix.authenticate.dao.UserDao;
import sg.edu.nus.iss.phoenix.authenticate.entity.User;
import sg.edu.nus.iss.phoenix.core.dao.DAOFactoryImpl;

/**
 *
 * @author longnguyen
 */
public class UserService {
    DAOFactoryImpl factory;
    UserDao urdao;

    public UserService() {
        super();
        factory = new DAOFactoryImpl();
        urdao = factory.getUserDAO();
    }
    
    public List<User> findAllUser() {
        List<User> result = new ArrayList<>();
        try {
            result = urdao.loadAll();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

}
