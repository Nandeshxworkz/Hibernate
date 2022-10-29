package com.xworkz.db.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {
	
	private static EntityManagerFactory factory;
	
	 
	  
	  static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
	  }

	public static EntityManagerFactory getFactory() {
		return factory;
	}

}