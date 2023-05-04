//package com.example.seamcrud;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.jboss.seam.annotations.Create;
//import org.jboss.seam.annotations.Name;
//import org.jboss.seam.annotations.Scope;
//
//
//import static org.jboss.seam.ScopeType.APPLICATION;
//
//@Name("hibernateSessionFactory")
//@Scope(APPLICATION)
//public class HibernateSessionFactory {
//
//    @Create
//    public SessionFactory createSessionFactory() {
//        Configuration config = new Configuration();
//        config.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//        config.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
//        config.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/testDB");
//        config.setProperty("hibernate.connection.username", "postgres");
//        config.setProperty("hibernate.connection.password", "postgres123!");
//        config.setProperty("hibernate.current_session_context_class", "jta");
//        config.addAnnotatedClass(User.class); // replace User with your entity class
//        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                .applySettings(config.getProperties())
//                .build();
//        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
//        return sessionFactory;
//    }
//
//}