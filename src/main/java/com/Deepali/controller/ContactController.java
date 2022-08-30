package com.Deepali.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Deepali.model.Contact;
import com.Deepali.service.Servicel;
import com.Deepali.utill.AppConstrants;
import com.Deepali.utill.AppProps;

@RestController
public class ContactController {
	
	@Autowired
	private Servicel servicel;
	
	@Autowired
	private AppProps appProps;
	
	@PostMapping(value="/saveContact",consumes="application/json")
  public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		
		boolean saveContact = servicel.saveContact(contact);
		Map<String,String> message=appProps.getMessage();
		
		 if(saveContact==true) {
			 String msg=message.get(AppConstrants.SAVE_SUCCESS);
			// String msg=message.get("saveSuccess");
		//	String msg="contact save successfully";
			
			 return new ResponseEntity<String>(msg,HttpStatus.OK);
		     }else {
		    	 String msg=message.get(AppConstrants.SAVE_FAIL);
		    	// String msg=message.get("saveFail");
			// String msg="Contact not save successfully";
			
		     return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
	            }
		 
	 }
	      @GetMapping(value="/getallcontact",produces="application/json")
	      public ResponseEntity<List<Contact>> getallcontact(){
			
	     	     List<Contact> allContact = servicel.getAllContact();
			
	     	    if(allContact!=null) {
	 			
	 			return new ResponseEntity<List<Contact>>(allContact,HttpStatus.OK);
	 		        }else {
	 			 String msg="Data not found";
                 return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);
	 	            }
	}
	      @GetMapping(value="/getbyid/{contactId}",produces="application/json")
	      public ResponseEntity<Contact> getbyid(@PathVariable Integer contactId){
			
	     	   Contact byContactId = servicel.getByContactId(contactId);
	            return new ResponseEntity<Contact>(byContactId,HttpStatus.OK);
	 }
	      
	     @PutMapping(value="/updateContact",consumes="application/json")
	      public ResponseEntity<String> updateContact(@RequestBody Contact contact){
	    		
	           boolean updateContact = servicel.updateContact(contact);
	          Map<String,String> message=appProps.getMessage();
	           
			 if(updateContact==true) {
				 String msg=message.get(AppConstrants.UPDATE_SUCCESS);
				// String msg=message.get("updateSuccess");
				//String msg="contact Updated successfully";
				
				 return new ResponseEntity<String>(msg,HttpStatus.OK);
			     }else {
			    	 String msg=message.get(AppConstrants.UPDATE_FAIL);
			    	// String msg=message.get("updateFail");
				// String msg="Contact not updated successfully";
				
			     return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		            }
   }
	        @DeleteMapping(value="/deleteContactById/{cid}")
	    	public ResponseEntity<String> deleteContactById(@PathVariable Integer cid){
	    		
	    		boolean deleteById = servicel.deleteById(cid);
	    		Map<String,String> message=appProps.getMessage();
	    		
	    		if(deleteById) {
	    			 String msg=message.get(AppConstrants.DELETE_SUCCESS);
	    			// String msg=message.get("deleteSuccess");
	    			return new ResponseEntity<String>(msg,HttpStatus.OK);
	    		}else {
	    			String msg=message.get(AppConstrants.DELETE_FAIL);
	    			 //String msg=message.get("deletefail");
	    	 return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
	    		
	    	}
	    	
	    	}

}
