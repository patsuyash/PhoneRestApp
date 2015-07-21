/*package com.myphoneapp.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class PhoneDetailsEntity {
	
	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(strategy = "foreign", name = "gen", parameters = @Parameter(name="property", value="phoneEntity"))
	@Column(name = "phone_id")
	private Integer phoneId;
	
	@Column(name = "phone_availability")
	private String phoneAvailability;
	
	@Column(name = "phone_connectivity_id")
	private Integer phoneConnectivityId;
	
	@Column(name = "phone_img_id")
	private Integer phoneImgId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private PhoneEntity phoneEntity;
	
	@OneToMany(mappedBy = "detailsEntity", fetch = FetchType.EAGER)
	private Set<PhoneConnectivityEntity> connectivties = new HashSet<PhoneConnectivityEntity>();
	
	@OneToMany(mappedBy = "dEntity", fetch = FetchType.EAGER)
	private Set<PhoneImageEntity> imgEntities = new HashSet<PhoneImageEntity>();
	
	public PhoneDetailsEntity(){
		
	}
	
	public Integer getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneAvailability() {
		return phoneAvailability;
	}
	public void setPhoneAvailability(String phoneAvailability) {
		this.phoneAvailability = phoneAvailability;
	}
	public Integer getPhoneConnectivityId() {
		return phoneConnectivityId;
	}
	public void setPhoneConnectivityId(Integer phoneConnectivityId) {
		this.phoneConnectivityId = phoneConnectivityId;
	}
	public Integer getPhoneImgId() {
		return phoneImgId;
	}
	public void setPhoneImgId(Integer phoneImgId) {
		this.phoneImgId = phoneImgId;
	}

	public PhoneEntity getPhoneEntity() {
		return phoneEntity;
	}

	public void setPhoneEntity(PhoneEntity phoneEntity) {
		this.phoneEntity = phoneEntity;
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

}
*/