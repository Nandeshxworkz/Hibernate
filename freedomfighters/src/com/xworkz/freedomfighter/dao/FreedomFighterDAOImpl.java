package com.xworkz.freedomfighter.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.freedomfighter.entity.FreedomFighterEntity;
import com.xworkz.freedomfighter.util.Factory;

import static com.xworkz.freedomfighter.util.Factory.*;

public class FreedomFighterDAOImpl implements FreedomFighterDAO{

	
	  EntityManagerFactory factory = Factory.getFactory();
	@Override
	public boolean save(FreedomFighterEntity entity) {
		EntityManager manager = null;
		try {
			manager= factory.createEntityManager();
		EntityTransaction tx =	manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
			
		}catch(PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return false;
	}
	
	@Override
	public Boolean insert(List<FreedomFighterEntity> entities) {
		EntityManager manager = null;
		try {
			manager= factory.createEntityManager();
		EntityTransaction tx =	manager.getTransaction();
		tx.begin();
		for(FreedomFighterEntity freedomFighterEntity : entities ) {
			manager.persist(freedomFighterEntity);
		}
           tx.commit();
			
		}catch(PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return FreedomFighterDAO.super.insert(entities);
	}
	

}
