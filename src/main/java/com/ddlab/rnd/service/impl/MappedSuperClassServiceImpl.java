package com.ddlab.rnd.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.mappedsuperclass.BaseCard;
import com.ddlab.rnd.entity.mappedsuperclass.DebitCard;
import com.ddlab.rnd.repository.MappedSuperClassRepo;
import com.ddlab.rnd.repository.XTendedRepo;
import com.ddlab.rnd.service.MappedSuperClassService;

@Service
public class MappedSuperClassServiceImpl implements MappedSuperClassService {
	
	@Autowired
	private MappedSuperClassRepo repo;
	
	@Autowired
	private XTendedRepo noRepo;

	@Override
	public void saveCard(BaseCard card) {
		repo.save(card);
	}
	
	public void showCard(String name) {
		List<DebitCard> cards = noRepo.findByName(name);
		System.out.println("Cards: "+cards);
	}

}
