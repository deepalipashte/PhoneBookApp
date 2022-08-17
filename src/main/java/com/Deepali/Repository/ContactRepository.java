package com.Deepali.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Deepali.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
