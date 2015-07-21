package com.myphoneapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.myphoneapp.entity.PhoneEntity;
import com.myphoneapp.repository.PhoneRepository;

@Component
@Cacheable("phones")
public class PhoneDao {

	@Autowired
	private PhoneRepository phoneRepository;
	
	public List<PhoneEntity> getPhoneList(){
		return (List<PhoneEntity>) phoneRepository.findAll();
	}
	
	public PhoneEntity findPhoneById(Integer id){
		simulateSlowService();
		return phoneRepository.findOne(id);
	}
	private void simulateSlowService() {
        try {
            long time = 2000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
	public PhoneEntity createPhone(PhoneEntity entity){
		return phoneRepository.save(entity);
	}
	
	public PhoneEntity updatePhone(PhoneEntity entity){
		return phoneRepository.save(entity);
	}
	
	public void deletePhone(PhoneEntity entity){
		phoneRepository.delete(entity);
	}
}
