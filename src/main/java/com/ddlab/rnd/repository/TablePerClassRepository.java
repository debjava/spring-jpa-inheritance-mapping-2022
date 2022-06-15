package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.tableperclass.Vehicle;

@Repository
public interface TablePerClassRepository extends CrudRepository<Vehicle, Long> {

}
