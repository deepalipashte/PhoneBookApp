package com.Deepali.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Deepali.Repository.ContactRepository;
import com.Deepali.model.Contact;
@Service
public class Servicelmpl  implements Servicel{
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {
		
		Contact save = contactRepository.save(contact);
		if(save!=null) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> findAll = contactRepository.findAll();
		Stream<Contact> stream = findAll.stream();
        Stream<Contact> filter = stream.filter(contact -> contact.getActiveSwitch() =='Y');
        		List<Contact> collect = filter.collect(Collectors.toList());

return collect;
		
	}

	@Override
	public Contact getByContactId(Integer contactId) {
		Contact findById = contactRepository.findById(contactId).get();
		return findById;
		}
          public Optional<Contact> getContactById(Integer contactId) {
		  Optional<Contact> findById = contactRepository.findById(contactId);
		  if(findById.isPresent()) {
			return findById;
		  }else {
			  return null;
		  }

	}
	@Override
	public boolean updateContact(Contact contact) {
		Contact update = contactRepository.save(contact);
		if(update!=null) {
			return true;
		}else {
		return false;
		}
		
	}
	
	@Override
	public boolean deleteById(Integer cid) {
		boolean existsById = contactRepository.existsById(cid);
		if (existsById) {
			contactRepository.deleteById(cid);
			return true;
		} else {

			return false;
		}
		 }


}
