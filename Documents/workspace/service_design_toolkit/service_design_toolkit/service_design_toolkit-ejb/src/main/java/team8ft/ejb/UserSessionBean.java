/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8ft.ejb;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import team8ft.entities.Users;

/**
 *
 * @author longnguyen
 */
@Stateless
@LocalBean
public class UserSessionBean {

    @PersistenceContext(unitName = "team8ft_service_design_toolkit-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;    

    public void persist(Object object) {
        try {     
            em.persist(object);           
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }    

    public List<Users> retrieve() {
        Query query = em.createNamedQuery("Users.findAll");        
        return query.getResultList(); 
    }
}
