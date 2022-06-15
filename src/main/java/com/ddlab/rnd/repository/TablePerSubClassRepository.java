package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.tablepersubclass.Car;

@Repository
public interface TablePerSubClassRepository extends CrudRepository<Car, Long> {

}
