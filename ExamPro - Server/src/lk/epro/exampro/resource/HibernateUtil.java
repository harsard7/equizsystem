/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.resource;

import java.io.File;
import lk.ijse.exampro.entity.Admin;
import lk.ijse.exampro.entity.Examination;
import lk.ijse.exampro.entity.Question;
import lk.ijse.exampro.entity.Registration;
import lk.ijse.exampro.entity.Result;
import lk.ijse.exampro.entity.Subjects;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Hafees
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static StandardServiceRegistry registry;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            
            registry = new StandardServiceRegistryBuilder().loadProperties(new File("settings/hibernate.properties")).build();
            sessionFactory = new MetadataSources(registry)
                     .addAnnotatedClass(Subjects.class)
                    .addAnnotatedClass(Admin.class)
                    .addAnnotatedClass(Registration.class)
                    
                   
                   .addAnnotatedClass(Question.class)
                  
                   
                    .addAnnotatedClass(Result.class)
                   
                    .addAnnotatedClass(Question.class)
                    .addAnnotatedClass(Result.class)
                    .addAnnotatedClass(Examination.class)
                    .buildMetadata().buildSessionFactory();
            
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            
            StandardServiceRegistryBuilder.destroy(registry);
            
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
