package com.pro1.reimburse.reimbursements;

public class ReimbursementStatus  extends ReimbursementType{
	private int reimb_status_id;
	private String reimb_status;
	
		
	public ReimbursementStatus(int reimb_type_id, String reimb_type, int reimb_status_id, String reimb_status) {
		super(reimb_type_id, reimb_type);
		this.reimb_status_id = reimb_status_id;
		this.reimb_status = reimb_status;
	}
	
	
	public ReimbursementStatus() {
		super();
	}


	public ReimbursementStatus(int reimb_type_id, String reimb_type) {
		super(reimb_type_id, reimb_type);
	}

	public int getReimb_status_id() {
		return reimb_status_id;
	}
	public void setReimb_status_id(int reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}
	public String getReimb_status() {
		return reimb_status;
	}
	public void setReimb_status(String reimb_status) {
		this.reimb_status = reimb_status;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public String toString() {
		return "ReimbursementStatus [reimb_status_id=" + reimb_status_id + ", reimb_status=" + reimb_status
				+ ", getReimb_status_id()=" + getReimb_status_id() + ", getReimb_status()=" + getReimb_status()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
