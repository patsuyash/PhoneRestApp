package com.myphoneapp.rest.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.myphoneapp.dao.PhoneDao;
import com.myphoneapp.entity.PhoneEntity;
import com.myphoneapp.rest.dto.PhoneDto;

@Service
public class PhoneServiceImpl implements PhoneService{

	@Autowired
	PhoneDao phoneDao;
	
	@Override
	public Response getPhones(Integer id) {
		if (id == null) {
            return Response.status(HttpStatus.BAD_REQUEST.value()).build();
        }
        PhoneEntity entity = phoneDao.findPhoneById(id);
        if (entity == null) {
            return Response.status(HttpStatus.NO_CONTENT.value()).build();
        }
        PhoneDto dto = new PhoneDto.Builder()
            .getPhoneId(entity.getPhoneId())
            .getPhoneName(entity.getPhoneName())
            .getPhoneSnippet(entity.getPhoneSnippet())
            .getPhoneAge(entity.getPhoneAge())
            .getPhoneAvailability(entity.getPhoneAvailability())
            .getConnectivties(entity.getConnectivties())
            .getImgEntities(entity.getImgEntities())
            .build();
        return Response.status(HttpStatus.OK.value()).entity(dto).build();
	}

	@Override
	public Response createPhone(PhoneDto sampleDto) {
		if(sampleDto ==  null)
			return Response.status(HttpStatus.BAD_REQUEST.value()).build();
		
		PhoneEntity entity = new PhoneEntity.Builder()
					.getPhoneId(sampleDto.getPhoneId())
					.getPhoneName(sampleDto.getPhoneName())
					.getPhoneSnippet(sampleDto.getPhoneSnippet())
					.getPhoneAge(sampleDto.getPhoneAge())
					.build();
		entity = phoneDao.createPhone(entity);
		return Response.status(HttpStatus.OK.value()).entity(entity).build();
	}

	@Override
	public Response updatePhone(PhoneDto sampleDto) {
		if(sampleDto ==  null)
			return Response.status(HttpStatus.BAD_REQUEST.value()).build();
		
		PhoneEntity entity = new PhoneEntity.Builder()
					.getPhoneId(sampleDto.getPhoneId())
					.getPhoneName(sampleDto.getPhoneName())
					.getPhoneSnippet(sampleDto.getPhoneSnippet())
					.getPhoneAge(sampleDto.getPhoneAge())
					.build();
		entity = phoneDao.updatePhone(entity);
		return Response.status(HttpStatus.OK.value()).entity(entity).build();
	}

	@Override
	public Response deleteResponse(PhoneDto sampleDto) {
		if(sampleDto ==  null)
			return Response.status(HttpStatus.BAD_REQUEST.value()).build();
		
		PhoneEntity entity = new PhoneEntity.Builder()
					.getPhoneId(sampleDto.getPhoneId())
					.getPhoneName(sampleDto.getPhoneName())
					.getPhoneSnippet(sampleDto.getPhoneSnippet())
					.getPhoneAge(sampleDto.getPhoneAge())
					.build();
		phoneDao.deletePhone(entity);
		return Response.status(HttpStatus.OK.value()).entity(entity).build();
	}

	@Override
	public Response getPhones() {
		List<PhoneEntity> entities = phoneDao.getPhoneList();
		return Response.status(HttpStatus.OK.value()).entity(entities).build();
	}

}
