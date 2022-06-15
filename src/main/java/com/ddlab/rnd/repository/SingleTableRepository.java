package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.hierarchy.Employee;

@Repository
public interface SingleTableRepository extends CrudRepository<Employee, Long> {

}
