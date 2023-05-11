package com.example.listener;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContextEvent;


@WebListener
public class ContextListener implements ServletContextListener {
  @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().setAttribute("servletTimeInit",LocalDateTime.now());
    }
}
