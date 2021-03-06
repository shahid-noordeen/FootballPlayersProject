package com.qa.dfe.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FootballPlayers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	private String name;
	
	private String teamName;
	
	private String division;
	
	@ManyToOne
	private Nationality nationality;
	
	public FootballPlayers(Integer id, String name, String teamName, String division) {
		super();
		this.id = id;
		this.name = name;
		this.teamName = teamName;
		this.division = division;
		
		
		
	}

	
	
	public FootballPlayers() {
		super();
	}
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getDivision() {
		return division;
	}



	public void setDivision(String division) {
		this.division = division;
	}


	public Nationality getNationality() {
		return nationality;
	}



	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}



	@Override
	public int hashCode() {
		return Objects.hash(division, id, name, nationality, teamName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FootballPlayers other = (FootballPlayers) obj;
		return Objects.equals(division, other.division) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(nationality, other.nationality)
				&& Objects.equals(teamName, other.teamName);
	}



	@Override
	public String toString() {
		return "FootballPlayers [id=" + id + ", name=" + name + ", teamName=" + teamName + ", division=" + division
				+ "]";
	}
	
	



	





	
	

}