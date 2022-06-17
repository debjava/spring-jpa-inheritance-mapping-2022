package com.ddlab.rnd.repository;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.mappedsuperclass.DebitCard;

@Repository
public interface XTendedRepo extends MappedSuperClassNoRepo<DebitCard, Serializable> {

}
