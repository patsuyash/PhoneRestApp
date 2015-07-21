package com.myphoneapp.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
/*@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class)*/
public class PhoneEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "phone_id")
	private Integer phoneId;
	
	@Column(name = "phone_name")
	private String phoneName;
	
	@Column(name = "phone_snippet")
	private String phoneSnippet;
	
	@Column(name = "phone_age")
	private String phoneAge;
	
	@Column(name = "phone_availability")
	private String phoneAvailability;

	/*@OneToOne(mappedBy = "phoneEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private PhoneDetailsEntity detailEntity;*/
	
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

	@OneToMany(mappedBy = "phoneEntity", fetch = FetchType.EAGER)
	private Set<PhoneConnectivityEntity> connectivties = new HashSet<PhoneConnectivityEntity>();
	
	@OneToMany(mappedBy = "dEntity", fetch = FetchType.EAGER)
	private Set<PhoneImageEntity> imgEntities = new HashSet<PhoneImageEntity>();
	
	public PhoneEntity(){
		
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
	
	/*public PhoneDetailsEntity getDetailEntity() {
		return detailEntity;
	}

	public void setDetailEntity(PhoneDetailsEntity detailEntity) {
		this.detailEntity = detailEntity;
	}*/

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
		public PhoneEntity build(){
			return new PhoneEntity(this);
		}
		
		
	}
	
	private PhoneEntity(Builder builder){
		this.phoneId = builder.phoneId;
		this.phoneName = builder.phoneName;
		this.phoneSnippet = builder.phoneSnippet;
		this.phoneAge = builder.phoneAge;
		this.phoneAvailability = builder.phoneAvailability;
		this.connectivties = builder.connectivties;
		this.imgEntities = builder.imgEntities;
	}
}
