package com.ddlab.rnd.entity.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "debit")
@Data
public class DebitCard extends BaseCard {

	@Column
	private String type;
}
