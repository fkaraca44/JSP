package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;



public class ServletContextListenerExample implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("context Destroy!");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("context initialized!");

	}

}
