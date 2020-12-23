package com.vaadin.tutorial.crm.ui;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.tutorial.crm.backend.entity.Contact;
import com.vaadin.tutorial.crm.backend.service.ContactService;

@Route("")
public class MainView extends VerticalLayout {
    private ContactService contactService;
    private Grid<Contact> grid = new Grid<>(Contact.class);
    public MainView(ContactService contactService) {
        this.contactService = contactService;
        //from com.vaadin.flow.component.HasStyle
        addClassName("list-view");//gives the component a CSS name
        setSizeFull();//full browser, from HasSize.java
        configureGrid();//the most important component for now

        add(grid);
        updateList();//from contactService
    }

    private void configureGrid(){
        grid.addClassName("contact-grid");
        grid.setSizeFull();
        grid.setColumns("firstName","lastName","email","status");
    }

    public void updateList(){
        //from HasDataProvider
        grid.setItems(contactService.findAll());
    }
}
