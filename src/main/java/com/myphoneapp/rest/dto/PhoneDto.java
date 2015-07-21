package com.myphoneapp.rest.dto;

import java.io.Serializable;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.myphoneapp.entity.PhoneConnectivityEntity;
import com.myphoneapp.entity.PhoneImageEntity;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PhoneDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2191683887015014822L;

	private Integer phoneId;
	
	private String phoneName;
	
	private String phoneSnippet;
	
	private String phoneAge;
	
	private String phoneAvailability;
	
	private Set<PhoneConnectivityEntity> connectivties;
	
	private Set<PhoneImageEntity> imgEntities;
	
	public PhoneDto() {
	
	}
	
	public Integer getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneSnippet() {
		return phoneSnippet;
	}

	public void setPhoneSnippet(String phoneSnippet) {
		this.phoneSnippet = phoneSnippet;
	}

	public String getPhoneAge() {
		return phoneAge;
	}

	public void setPhoneAge(String phoneAge) {
		this.phoneAge = phoneAge;
	}
	
	
	public String getPhoneAvailability() {
		return phoneAvailability;
	}

	public void setPhoneAvailability(String phoneAvailability) {
		this.phoneAvailability = phoneAvailability;
	}

	public Set<PhoneConnectivityEntity> getConnectivties() {
		return connectivties;
	}

	public void setConnectivties(Set<PhoneConnectivityEntity> connectivties) {
		this.connectivties = connectivties;
	}

	public Set<PhoneImageEntity> getImgEntities() {
		return imgEntities;
	}

	public void setImgEntities(Set<PhoneImageEntity> imgEntities) {
		this.imgEntities = imgEntities;
	}


	public static class Builder{
		
		private Integer phoneId;
		private String phoneName;
		private String phoneSnippet;
		private String phoneAge;
		private String phoneAvailability;
		private Set<PhoneConnectivityEntity> connectivties;
		private Set<PhoneImageEntity> imgEntities;
		
		public Builder getPhoneId(Integer phoneId) {
			this.phoneId = phoneId;
			return this;
		}
		public Builder getPhoneName(String phoneName) {
			this.phoneName = phoneName;
			return this;
		}
		public Builder getPhoneSnippet(String phoneSnippet) {
			this.phoneSnippet = phoneSnippet;
			return this;
		}
		public Builder getPhoneAge(String phoneAge) {
			this.phoneAge = phoneAge;
			return this;
		}
		public Builder getPhoneAvailability(String phoneAvailability){
			this.phoneAvailability = phoneAvailability;
			return this;
		}
		public Builder getConnectivties(Set<PhoneConnectivityEntity> connectivties){
			this.connectivties = connectivties;
			return this;
		}
		public Builder getImgEntities(Set<PhoneImageEntity> imgEntities){
			this.imgEntities = imgEntities;
			return this;
		}
		public PhoneDto build(){
			return new PhoneDto(this);
		}
		
		
	}
	
	private PhoneDto(Builder builder){
		this.phoneId = builder.phoneId;
		this.phoneName = builder.phoneName;
		this.phoneSnippet = builder.phoneSnippet;
		this.phoneAge = builder.phoneAge;
		this.phoneAvailability = builder.phoneAvailability;
		this.connectivties = builder.connectivties;
		this.imgEntities = builder.imgEntities;
	}
}
