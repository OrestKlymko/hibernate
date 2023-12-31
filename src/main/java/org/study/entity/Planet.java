package org.study.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "planet")
public class Planet {
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String planetName;

	public void setId(String id) {
		this.id = id.toUpperCase();
	}
}
