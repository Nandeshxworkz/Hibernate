package com.xworkz.freedomfighter.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Entity
@Table(name="freedomfighter_info")
public class FreedomFighterEntity extends ParentEntity {
	
	@Id
//	@GenericGenerator(name="manga",strategy = "increment")
//	@GeneratedValue(generator="manga")
	private int id;
	private String name;
	private String location;
	private String gender;
	private LocalDate dateofBirth;
	private LocalDate deathDate;
	
	public FreedomFighterEntity(int id,String name, String location,String gender,LocalDate dateofBirth, LocalDate deathDate, LocalDateTime createdDate, LocalDateTime updateddate,
			  String createdBy,String updatedBy ) {
		super(createdBy, updatedBy, createdDate, updateddate);
		this.id = id;
		this.name = name;
		this.location = location;
		this.gender = gender;
		this.dateofBirth = dateofBirth;
		this.deathDate = deathDate;
	}
	
	

}
