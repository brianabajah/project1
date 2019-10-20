package com.pro1.reimburse.reimbursements;

import java.time.LocalDate;

public class Reimbursement extends ReimbursementStatus {
private int reimb_id;
private float reimb_amount;
private LocalDate reimb_submitted;
private LocalDate reimb_resolved;
private String reimb_description;
private int reimb_author;
private int reimb_resolver;



public Reimbursement(int reimb_type_id, String reimb_type, int reimb_status_id, String reimb_status, int reimb_id,
		float reimb_amount, LocalDate reimb_submitted, LocalDate reimb_resolved, String reimb_description,
		int reimb_author, int reimb_resolver) {
	super(reimb_type_id, reimb_type, reimb_status_id, reimb_status);
	this.reimb_id = reimb_id;
	this.reimb_amount = reimb_amount;
	this.reimb_submitted = reimb_submitted;
	this.reimb_resolved = reimb_resolved;
	this.reimb_description = reimb_description;
	this.reimb_author = reimb_author;
	this.reimb_resolver = reimb_resolver;
}




public Reimbursement(float reimb_amount, String reimb_description, int employee_id, int ers_reimbursement_typeid) {
	super(ers_reimbursement_typeid);
	this.reimb_amount = reimb_amount;
	this.reimb_description = reimb_description;
	this.reimb_author = employee_id;
}




public int getReimb_id() {
	return reimb_id;
}

public void setReimb_id(int reimb_id) {
	this.reimb_id = reimb_id;
}

public float getReimb_amount() {
	return reimb_amount;
}

public void setReimb_amount(float reimb_amount) {
	this.reimb_amount = reimb_amount;
}

public LocalDate getReimb_submitted() {
	return reimb_submitted;
}

public void setReimb_submitted(LocalDate reimb_submitted) {
	this.reimb_submitted = reimb_submitted;
}

public LocalDate getReimb_resolved() {
	return reimb_resolved;
}

public void setReimb_resolved(LocalDate reimb_resolved) {
	this.reimb_resolved = reimb_resolved;
}

public String getReimb_description() {
	return reimb_description;
}

public void setReimb_description(String reimb_description) {
	this.reimb_description = reimb_description;
}

public int getReimb_author() {
	return reimb_author;
}

public void setReimb_author(int reimb_author) {
	this.reimb_author = reimb_author;
}

public int getReimb_resolver() {
	return reimb_resolver;
}

public void setReimb_resolver(int reimb_resolver) {
	this.reimb_resolver = reimb_resolver;
}




@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}




@Override
public String toString() {
	return "Reimbursement [reimb_id=" + reimb_id + ", reimb_amount=" + reimb_amount + ", reimb_submitted="
			+ reimb_submitted + ", reimb_resolved=" + reimb_resolved + ", reimb_description=" + reimb_description
			+ ", reimb_author=" + reimb_author + ", reimb_resolver=" + reimb_resolver + ", getReimb_id()="
			+ getReimb_id() + ", getReimb_amount()=" + getReimb_amount() + ", getReimb_submitted()="
			+ getReimb_submitted() + ", getReimb_resolved()=" + getReimb_resolved() + ", getReimb_description()="
			+ getReimb_description() + ", getReimb_author()=" + getReimb_author() + ", getReimb_resolver()="
			+ getReimb_resolver() + ", hashCode()=" + hashCode() + "]";
}




}
