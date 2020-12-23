package com.vaadin.tutorial.crm.backend.repository;

import com.vaadin.tutorial.crm.backend.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * entity defines datamodel, while repository
 * defines the access to database
 */

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
