package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.tableperclass.Vehicle;
import com.ddlab.rnd.repository.TablePerClassRepository;
import com.ddlab.rnd.service.TablePerClassService;

@Service
public class TablePerClassServiceImpl implements TablePerClassService {
	
	@Autowired
	private TablePerClassRepository repo;

	@Override
	public void save(Vehicle vehicle) {
		repo.save(vehicle);
	}

}
