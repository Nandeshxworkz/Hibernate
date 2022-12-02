package com.xworkz.freedomfighter.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfighter.dao.FreedomFighterDAO;
import com.xworkz.freedomfighter.dao.FreedomFighterDAOImpl;
import com.xworkz.freedomfighter.entity.FreedomFighterEntity;

public class FreedomFighterRunner {
	public static void main(String[] args) {

		FreedomFighterEntity entity = new FreedomFighterEntity(1, "BhagatSingh", "mumbai", "male", LocalDate.now(),
				LocalDate.now(), LocalDateTime.now(), LocalDateTime.now(), "Atal ji", "Modi");
		FreedomFighterEntity entity1 = new FreedomFighterEntity(2, "Bose", "Bihar", "male", LocalDate.now(),
				LocalDate.now(), LocalDateTime.now(), LocalDateTime.now(), "Atal", "Modi");
		FreedomFighterEntity entity2 = new FreedomFighterEntity(3, "Rani chennamma", "Kittur", "Female", LocalDate.now(),
				LocalDate.now(), LocalDateTime.now(), LocalDateTime.now(), "Atal ji", "Modi");
		
		FreedomFighterDAO dao = new FreedomFighterDAOImpl();
		
		List<FreedomFighterEntity> list = new ArrayList<FreedomFighterEntity>();
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		
		Boolean save = dao.insert(list);
		System.out.println(save);
	}

}
