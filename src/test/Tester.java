/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.DiscountFixed;
import entity.DiscountQuantity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kaspe
 */
public class Tester
{

    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercise-JPA-Entity-Mappings-3PU");
        EntityManager em = emf.createEntityManager();
        
        Persistence.generateSchema("Exercise-JPA-Entity-Mappings-3PU", null);
        
        DiscountQuantity dq = new DiscountQuantity();
        DiscountFixed df = new DiscountFixed();
        
        em.getTransaction().begin();
        em.persist(dq);
        em.persist(df);
        em.getTransaction().commit();
    }
}
