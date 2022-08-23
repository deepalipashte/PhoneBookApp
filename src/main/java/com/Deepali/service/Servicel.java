package com.Deepali.service;

import java.util.List;

import com.Deepali.model.Contact;

public interface Servicel {
	
	public boolean saveContact(Contact contact);
	
	 public List<Contact>getAllContact();
	 
	public  Contact getByContactId(Integer contactId);
	
	public boolean updateContact(Contact contact);

}
