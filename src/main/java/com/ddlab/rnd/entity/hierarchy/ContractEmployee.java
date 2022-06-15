package com.ddlab.rnd.entity.hierarchy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("contract") 
public class ContractEmployee extends Employee {

}
