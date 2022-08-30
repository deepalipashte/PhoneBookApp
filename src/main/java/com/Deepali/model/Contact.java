package com.Deepali.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Entity
@Table(name="CONTACT_DTLS")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_NUMBER",nullable=false)
	
	private String contactNumber;
	
	@Column(name="CONTACT_EMAIL",nullable=false)
	
	 private String contactEmail;
	
	@Column(name="ACTIVE_SWITCH",nullable=false)
	
    private	Character activeSwitch;
	
	@Column(name="CREATED_DATE")
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name="UPDATED_DATE")
	 @UpdateTimestamp
	private LocalDate  updateDate;

//	public Integer getContactId() {
//		return contactId;
//	}
//
//	public void setContactId(Integer contactId) {
//		this.contactId = contactId;
//	}
//
//	public String getContactName() {
//		return contactName;
//	}
//
//	public void setContactName(String contactName) {
//		this.contactName = contactName;
//	}
//
//	public String getContactNumber() {
//		return contactNumber;
//	}
//
//	public void setContactNumber(String contactNumber) {
//		this.contactNumber = contactNumber;
//	}
//
//	public String getContactEmail() {
//		return contactEmail;
//	}
//
//	public void setContactEmail(String contactEmail) {
//		this.contactEmail = contactEmail;
//	}
//
//	public Character getActiveSwitch() {
//		return activeSwitch;
//	}
//
//	public void setActiveSwitch(Character activeSwitch) {
//		this.activeSwitch = activeSwitch;
//	}
//
//	public LocalDate getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(LocalDate createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public LocalDate getUpdateDate() {
//		return updateDate;
//	}
//
//	public void setUpdateDate(LocalDate updateDate) {
//		this.updateDate = updateDate;
//	}
//
//	public Contact() {
//		super();
//		
//	}
//
//	@Override
//	public String toString() {
//		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
//				+ ", contactEmail=" + contactEmail + ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate
//				+ ", updateDate=" + updateDate + "]";
//	}
//	
//	

}
