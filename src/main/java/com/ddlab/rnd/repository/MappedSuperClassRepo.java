package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.mappedsuperclass.BaseCard;

@Repository
public interface MappedSuperClassRepo extends CrudRepository<BaseCard, Long> {

}
