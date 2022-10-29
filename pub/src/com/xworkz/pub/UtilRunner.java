package com.xworkz.pub;

import com.xworkz.pub.Entity.PubEntity;
import com.xworkz.pub.dao.PubDAO;
import com.xworkz.pub.dao.PubDAOImpl;

public class UtilRunner {

	public static void main(String[] args) {

      PubDAO dao = new PubDAOImpl();
     PubEntity entity1= dao.findbyName("samarth");
     System.out.println(entity1);
	}

}
