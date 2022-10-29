package com.xworkz.pub.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
	
	 private static	EntityManagerFactory factory;
	 
	  public static EntityManagerFactory getFactory() {
		  factory = Persistence.createEntityManagerFactory("com.xworkz");
		return factory;
}
}