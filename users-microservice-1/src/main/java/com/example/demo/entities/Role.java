package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Role {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long role_id;
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public Role(Long role_id, String role) {
		super();
		this.role_id = role_id;
		this.role = role;
	}
	public Role() {
		super();
	}
	
	
}

