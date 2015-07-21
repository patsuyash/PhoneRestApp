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
public class PhoneImageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "phone_img_id")
	private Integer phoneImgId;
	
	@Column(name = "phone_img_src")
	private String phoneImgSrc;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phone_id")
	@JsonIgnore
	private PhoneEntity dEntity;
	
	public PhoneImageEntity(){
		
	}
	
	public Integer getPhoneImgId() {
		return phoneImgId;
	}
	public void setPhoneImgId(Integer phoneImgId) {
		this.phoneImgId = phoneImgId;
	}
	public String getPhoneImgSrc() {
		return phoneImgSrc;
	}
	public void setPhoneImgSrc(String phoneImgSrc) {
		this.phoneImgSrc = phoneImgSrc;
	}

	public PhoneEntity getdEntity() {
		return dEntity;
	}

	public void setdEntity(PhoneEntity dEntity) {
		this.dEntity = dEntity;
	}
}
