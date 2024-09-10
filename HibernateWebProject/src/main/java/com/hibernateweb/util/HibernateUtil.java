package com.hibernateweb.util;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the StandardServiceRegistry
            ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();

            // Create MetadataSources
            MetadataSources sources = new MetadataSources(standardRegistry);

            // Create Metadata
            sources.addAnnotatedClass(com.hibernateweb.entity.User.class);
            // If you have multiple annotated classes, add them similarly.

            // Create SessionFactory
            return sources.buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            throw new RuntimeException("Error initializing Hibernate SessionFactory: " + ex.getMessage(), ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
