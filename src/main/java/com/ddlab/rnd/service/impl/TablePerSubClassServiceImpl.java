package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.tablepersubclass.Car;
import com.ddlab.rnd.repository.TablePerSubClassRepository;
import com.ddlab.rnd.service.TablePerSubClassService;

@Service
public class TablePerSubClassServiceImpl implements TablePerSubClassService {

	@Autowired
	private TablePerSubClassRepository repo;

	@Override
	public void save(Car car) {
		repo.save(car);
	}

}
