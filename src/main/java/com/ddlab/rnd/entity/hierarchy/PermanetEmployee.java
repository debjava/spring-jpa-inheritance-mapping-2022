package com.ddlab.rnd.entity.hierarchy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("permanent") 
public class PermanetEmployee extends Employee {

}
