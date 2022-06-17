package com.ddlab.rnd.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ddlab.rnd.entity.mappedsuperclass.BaseCard;

@NoRepositoryBean
public interface MappedSuperClassNoRepo<T extends BaseCard, E extends Serializable> extends CrudRepository<T, E> {
	
	List<T> findByName(String name);
}
