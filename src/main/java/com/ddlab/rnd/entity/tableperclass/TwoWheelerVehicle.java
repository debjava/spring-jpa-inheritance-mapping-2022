package com.ddlab.rnd.entity.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="twowheeler") 
@Data
public class TwoWheelerVehicle extends Vehicle {

}
