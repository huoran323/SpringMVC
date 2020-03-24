package com.hr.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Lifecycle Listener implementation class SpringListener
 *
 */
public class SpringListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public SpringListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         
    	//加载spring配置文件
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	
    	ServletContext servletContext = sce.getServletContext();
    	servletContext.setAttribute("ac", ac);
    }
	
}
