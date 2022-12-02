package com.xworkz.freedomfighter.dao;

import java.util.List;

import com.xworkz.freedomfighter.entity.FreedomFighterEntity;

public interface FreedomFighterDAO {
	
	boolean save(FreedomFighterEntity entity);
	
	default Boolean insert(List<FreedomFighterEntity> entities) {
		return true;
		
	}
		
	

}
