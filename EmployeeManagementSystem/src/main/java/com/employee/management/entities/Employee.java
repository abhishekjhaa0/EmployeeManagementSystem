package com.employee.management.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "employees")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	  @JsonProperty("empId")
	@Column (name ="emp_id")
   private int empId;
	
	 @JsonProperty("empName")
	@Column (name ="emp_name")
   private String empName;
	
	   @JsonProperty("designation")
	@Column (name ="designation")
   private String designation;
	
	   @JsonProperty("empSalary")
	@Column (name ="emp_salary")
   private double empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	   
}
