package DZ;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class VKLListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servce) {
        System.out.println("Start of the application");
    }
}
