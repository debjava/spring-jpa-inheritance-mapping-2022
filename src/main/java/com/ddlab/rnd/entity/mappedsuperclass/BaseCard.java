package com.ddlab.rnd.entity.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class BaseCard {

	@Id @GeneratedValue
	private long id;

	@Column
	private String name;
}
