package com.asule.event;

<<<<<<< HEAD
import com.asule.app.model.entity.Member;
import com.asule.app.model.entity.User;
import com.asule.database.Database;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppInit implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("*************** Initializing database *************");

        Database database = Database.getDbInstance();
        database.getUsers().add(new User(0L, "asule@test.com", "123"));
        database.getUsers().add(new User(0L, "john.doe@test.com", "54321"));
        database.getUsers().add(new User(0L, "jane.doe@test.com", "00000"));

        database.getMembers().add(new Member("1", "David", null));
        database.getMembers().add(new Member("2", "Sofia", null));
        database.getMembers().add(new Member("3", "Wesley", null));
        database.getMembers().add(new Member("4", "Marcus", null));
        database.getMembers().add(new Member("5", "Julia", null));

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Application is undeployed or destroyed");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

=======
public class AppInit {
    
>>>>>>> b5ad14254e74ba71eeee429b12c13fad17f02132
}
