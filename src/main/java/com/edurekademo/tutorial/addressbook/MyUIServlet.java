package com.edurekademo.tutorial.addressbook;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = AddressbookUI.class, productionMode = false)
public class MyUIServlet extends VaadinServlet {
}
