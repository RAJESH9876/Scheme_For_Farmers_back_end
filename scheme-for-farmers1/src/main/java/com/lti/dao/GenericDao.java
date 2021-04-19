package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {  
    
    public void save(Object obj) {
        
        EntityManagerFactory emf = null;
        EntityManager em = null;
        
        try {
            emf = Persistence.createEntityManagerFactory("oracleTest");
            em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            et.begin();
            em.merge(obj);   //can be used for insert and update both
            et.commit();
        }
        catch(Exception e) {
            e.printStackTrace();  //we should rather throw some defined exception
        }
        finally {
        	em.close();
        	emf.close();
        }
    }
    
    public Object fetch(Class clazzz, Object pk ) {
       
    	EntityManagerFactory emf = null; 
        EntityManager em = null;
        
        try {
            emf = Persistence.createEntityManagerFactory("oracleTest");
            em = emf.createEntityManager();
            Object obj = em.find(clazzz, pk);
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
        finally {
            em.close();
            emf.close();
            
        }
    }

}
 

