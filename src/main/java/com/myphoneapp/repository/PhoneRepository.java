package com.myphoneapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myphoneapp.entity.PhoneEntity;

@Repository
public interface PhoneRepository extends CrudRepository<PhoneEntity, Integer>{

}
