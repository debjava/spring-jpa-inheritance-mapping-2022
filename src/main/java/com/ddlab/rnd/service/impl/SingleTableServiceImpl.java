package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.hierarchy.Employee;
import com.ddlab.rnd.repository.SingleTableRepository;
import com.ddlab.rnd.service.SingleTableService;

@Service
public class SingleTableServiceImpl implements SingleTableService {
	
	@Autowired
	private SingleTableRepository repo;

	@Override
	public void saveEmployee(Employee emp) {
		repo.save(emp);
	}
}
