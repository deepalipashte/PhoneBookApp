package com.Deepali.service;

import java.util.List;
import java.util.Optional;

import com.Deepali.model.Contact;

public interface Servicel {
	
	public boolean saveContact(Contact contact);
	
	 public List<Contact>getAllContact();
	 
	public  Contact getByContactId(Integer contactId);
	Optional<Contact> getContactById(Integer contactId);
	
	public boolean updateContact(Contact contact);
	
	 boolean deleteById(Integer cid);

}
