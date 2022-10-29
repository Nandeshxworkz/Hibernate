package com.xworkz.db.runner;

import com.xworkz.db.dao.DataDAO;
import com.xworkz.db.dao.DataDAOImpl;
import com.xworkz.db.entity.DataEntity;

public class DataRunner {

	public static void main(String[] args) {

		DataEntity entity = new DataEntity("DataSaved");
	
		DataDAO impl = new DataDAOImpl();
	
		Boolean save = impl.save(entity);
	
		System.out.println(save);
	}

}
