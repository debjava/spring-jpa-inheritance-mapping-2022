package com.ddlab.rnd.service;

import com.ddlab.rnd.entity.mappedsuperclass.BaseCard;

public interface MappedSuperClassService {

	void saveCard(BaseCard card);
	
	void showCard(String name);
}
