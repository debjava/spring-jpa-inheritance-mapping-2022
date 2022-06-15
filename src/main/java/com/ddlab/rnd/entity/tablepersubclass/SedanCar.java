package com.ddlab.rnd.entity.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity @Table(name = "sedan")
@PrimaryKeyJoinColumn(name="id")  
@Data
public class SedanCar extends Car {

}
