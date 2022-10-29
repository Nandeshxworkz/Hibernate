package com.xworkz.db.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.db.entity.DataEntity;
import com.xworkz.db.factory.Factory;

public class DataDAOImpl implements DataDAO{

	   EntityManagerFactory factory = Factory.getFactory();
	
	
	@Override
	public Boolean save(DataEntity dataEntity) {

		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dataEntity);
			System.out.println(dataEntity);
			transaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	

}
