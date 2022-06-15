package com.ddlab.rnd.entity.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Entity @Table(name = "car")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Car {

	@Id @GeneratedValue
	private long id;

	@Column
	private String name;
}
