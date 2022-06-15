package com.ddlab.rnd.entity.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Entity @Table(name = "vehicle")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public class Vehicle {

	@Id @GeneratedValue
	private long id;

	@Column
	private String name;
}
