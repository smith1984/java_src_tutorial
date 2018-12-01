/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.smith.sessionbeans;

import ru.smith.entity.Telephone;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author heffel
 */
@Stateless
public class TelephoneFacade extends AbstractFacade<Telephone> {
    @PersistenceContext(unitName = "EjbDaoPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public TelephoneFacade() {
        super(Telephone.class);
    }

}
