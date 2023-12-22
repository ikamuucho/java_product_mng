package com.example.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="M_STAFF")
public class MStaffModel {

	@Id
	@Column(name="staff_id")
    private String staff_id;
	@Column(name="staff_name")
    private String STAFF_NAME;
	@Column(name="staff_pass")
    private String STAFF_PASS;
	@Column(name="staff_admn")
    private String STAFF_ADMN;
    
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	public String getSTAFF_NAME() {
		return STAFF_NAME;
	}
	public void setSTAFF_NAME(String sTAFF_NAME) {
		STAFF_NAME = sTAFF_NAME;
	}
	public String getSTAFF_PASS() {
		return STAFF_PASS;
	}
	public void setSTAFF_PASS(String sTAFF_PASS) {
		STAFF_PASS = sTAFF_PASS;
	}
	public String getSTAFF_ADMN() {
		return STAFF_ADMN;
	}
	public void setSTAFF_ADMN(String sTAFF_ADMN) {
		STAFF_ADMN = sTAFF_ADMN;
	}

}
