package com.pro1.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

import com.pro1.dtbAccessors.Connectivity;
import com.pro1.reimburse.reimbursements.Reimbursement;

public class ReimbDao {
	
	public int commitReimburse(Reimbursement remb) {
		Connectivity cnt = new Connectivity();
		Connection con = cnt.getCon();
//		(float reimb_amount, String reimb_description, int employee_id, int ers_reimbursement_typeid)
		
		String sql="insert into ers_reimbursement(reimb_amount,reimb_submitted,reimb_author,reimb_status_id,reimb_type_id) values(?,?,?,?,?); ";
		
		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setFloat(1, remb.getReimb_amount());
			ps.setObject(2, LocalDateTime.now());
			ps.setInt(3,remb.getReimb_author());
			ps.setInt(4, remb.getReimb_status_id());
			ps.setInt(5, remb.getReimb_type_id());
			
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}		
		
	}

}
