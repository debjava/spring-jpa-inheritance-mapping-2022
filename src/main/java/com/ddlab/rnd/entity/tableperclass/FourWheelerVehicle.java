package com.ddlab.rnd.entity.tableperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="fourwheeler")
@Data
public class FourWheelerVehicle extends Vehicle {

}
