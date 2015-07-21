package com.myphoneapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
/*@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class)*/
public class PhoneConnectivityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "phone_connectivity_id")
	private Integer phoneConnectivityId;
	
	@Column(name = "connect_property")
	private String connectProperty;
	
	@Column(name = "connect_value")
	private String connectValue;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phone_id")
	@JsonIgnore
	private PhoneEntity phoneEntity;
	
	public PhoneConnectivityEntity(){
		
	}
	
	public Integer getPhoneConnectivityId() {
		return phoneConnectivityId;
	}
	public void setPhoneConnectivityId(Integer phoneConnectivityId) {
		this.phoneConnectivityId = phoneConnectivityId;
	}
	public String getConnectProperty() {
		return connectProperty;
	}
	public void setConnectProperty(String connectProperty) {
		this.connectProperty = connectProperty;
	}
	public String getConnectValue() {
		return connectValue;
	}
	public void setConnectValue(String connectValue) {
		this.connectValue = connectValue;
	}

	public PhoneEntity getPhoneEntity() {
		return phoneEntity;
	}

	public void setPhoneEntity(PhoneEntity phoneEntity) {
		this.phoneEntity = phoneEntity;
	}

	
}
