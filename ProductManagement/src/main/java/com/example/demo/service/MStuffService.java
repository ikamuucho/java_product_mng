package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MStaffModel;
import com.example.demo.repository.MStuffRepository;

@Service
public class MStuffService {

	@Autowired
	MStuffRepository mStuffRepository;
	
	public List<MStaffModel> findMStuff(){
		return mStuffRepository.findAll();
		
	};
}
