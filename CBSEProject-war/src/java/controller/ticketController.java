/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Events;
import entities.Ticket;
import entities.Users;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.EventsFacade;
import model.TicketFacade;

/**
 *
 * @author Yi Min
 */
@Named(value = "ticketController")
@SessionScoped
public class ticketController implements Serializable {

    @EJB
    private TicketFacade ticketFacade;
    
    
    private Events e = new Events();
    Users user;
    
    public Events getE() {
        return e;
    }
    
    public void setE(Events e) {
        this.e = e;
    }
    
     public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    public List<Ticket> findall(){
        return this.ticketFacade.findAll();
    }
    
    
    

    /**
     * Creates a new instance of joinEventController
     */
    public ticketController() {
    }
    
}
