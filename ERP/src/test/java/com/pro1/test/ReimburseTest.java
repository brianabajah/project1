package com.pro1.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.time.LocalDate;

import com.pro1.DAO.UserDao;
import com.pro1.dtbAccessors.*;
import com.pro1.reimburse.reimbursements.*;
import com.pro1.reimburse.users.Users;

public class ReimburseTest {

	LocalDate tim= LocalDate.now();
	private Reimbursement  reimb = new Reimbursement(1, "lodging", 1, "pending", 1, 1, tim, tim, "more info", 1, 1);
	
	@Test
	public void testgetReimb_id() {
		
		assertTrue(reimb.getReimb_id()==1);
	}

	@Test
	public void testgetReimb_amount() {
		
		assertTrue(reimb.getReimb_amount()==1);
	}

	@Test
	public void testgetReimb_submitted() {
		assertTrue(reimb.getReimb_submitted() instanceof  LocalDate);
	}
	
	@Test
	public void  testgetReimb_resolved() {
		assertTrue(reimb.getReimb_resolved() instanceof  LocalDate);
	}

	@Test
	public void testgetReimb_description() {
		
		assertEquals(reimb.getReimb_description(),"more info");
	}

	@Test
	public void testgetReimb_author() {
		assertTrue(reimb.getReimb_author()== 1);
	}
	
	@Test
	public void testgetReimb_resolver() {
		assertTrue(reimb.getReimb_resolver()== 1);
	}
	
	@Test
	public void testgetReimb_status_id() {
		
		assertTrue(reimb.getReimb_status_id()== 1);
	}
	
	@Test
	public void testgetReimb_status() {
		assertEquals(reimb.getReimb_status(),"pending");
	}
	
	@Test
	public void testgetReimb_type_id() {
		assertTrue(reimb.getReimb_type_id()== 1);
	}
	
	@Test
	public void testgetReimb_type() {
		assertEquals(reimb.getReimb_type(),"lodging");
	}
	
	@Test
	public void testgetUrl() {
		Authentication aut= new Authentication();
		assertTrue(aut.getUrl().equals(System.getenv("URL")));
	}
	
	@Test
	public void testgetName() {
		Authentication aut= new Authentication();
		assertTrue(aut.getName().equals(System.getenv("NAME")));

	}
	@Test
	public void testgetPass() {
		Authentication aut= new Authentication();
		assertTrue(aut.getPass().equals(System.getenv("PASS")));
	}
	@Test
	public void testConnection() {
		Connectivity con = new Connectivity();
		assertTrue(con.getCon() instanceof Connection);
	} 
	
	@Test
	public void testaddNewEmployee() {
		Users use= new Users(1, "test", "test", "test", "test", "test");
		UserDao usdao = new UserDao();
		assertTrue(usdao.addNewEmployees(use)>=0);
 	}
	
	
//	@Test 
//	public void testremoveEmployees() {
//		testduplicateNewEmployee();
//		Users use= new Users(1, "test", "test", "test", "test", "test");
//		UserDao usdao = new UserDao();
//		assertEquals(usdao.removeEmployees(use),1);
// 	}
//	
//	@Test
//	public void testnoremoveEmployees(){
//		testduplicateNewEmployee();
//		Users use= new Users(1, "test", "test", "test", "test", "test");
//		UserDao usdao = new UserDao();
//		assertEquals(usdao.removeEmployees(use),0);
// 	}

}
