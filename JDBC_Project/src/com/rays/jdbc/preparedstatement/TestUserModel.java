package com.rays.jdbc.preparedstatement;

import java.util.Date;

public class TestUserModel {

	public static void main(String[] args) throws Exception {

//		testAdd();
//		testUpdate();
		testDelete();

	}

	private static void testDelete() throws Exception {
		
		UserBean bean = new UserBean();
		
		bean.setId(6);
		
		UserModel model = new UserModel();
		
		model.delete(bean);
		
	}

	private static void testUpdate() throws Exception {
		UserBean bean = new UserBean();
		
		bean.setId(3);
		bean.setFirstName("Harshita");
		bean.setLastName("Panchal");
		bean.setLogin("harshit@gmail.com");
		bean.setPassword("harshit123");
		bean.setDob(new Date());
		
		UserModel model = new UserModel();
		model.update(bean);
		
		
	}

	public static void testAdd() throws Exception {
		UserBean bean = new UserBean();

		bean.setId(4);
		bean.setFirstName("abc");
		bean.setLastName("abc");
		bean.setLogin("abc@gmail.com");
		bean.setPassword("abc123");
		bean.setDob(new Date());

		UserModel model = new UserModel();

		int id = model.add(bean);

		System.out.println("record inserted at id: " + id);
	}

}
