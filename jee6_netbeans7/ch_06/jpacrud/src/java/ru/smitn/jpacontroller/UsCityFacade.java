/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.smitn.jpacontroller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ru.smitn.entity.UsCity;

/**
 *
 * @author ito
 */
@Stateless
public class UsCityFacade extends AbstractFacade<UsCity> {

    @PersistenceContext(unitName = "jpacrudPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsCityFacade() {
        super(UsCity.class);
    }
    
}
