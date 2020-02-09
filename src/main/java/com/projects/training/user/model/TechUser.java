package com.projects.training.user.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TechUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String username;
	
	private String experienceLevel;
	
	private String[] languages;
	
	private String selectedLanguage;
	
	private String selectedCategory;
	
	public TechUser() {}

	public TechUser(Long id, String username, String experienceLevel, String[] languages,
			String selectedLanguage, String selectedCategory) {
		this.id = id;
		this.username = username;
		this.experienceLevel = experienceLevel;
		this.languages = languages;
		this.selectedLanguage = selectedLanguage;
		this.selectedCategory = selectedCategory;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getExperienceLevel() {
		return experienceLevel;
	}

	public void setExperienceLevel(String experienceLevel) {
		this.experienceLevel = experienceLevel;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public String getSelectedLanguage() {
		return selectedLanguage;
	}

	public void setSelectedLanguage(String selectedLanguage) {
		this.selectedLanguage = selectedLanguage;
	}

	public String getSelectedCategory() {
		return selectedCategory;
	}

	public void setSelectedCategory(String selectedCategory) {
		this.selectedCategory = selectedCategory;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "TechUser [id=" + id + ", username=" + username + ", experienceLevel="
				+ experienceLevel + ", languages=" + Arrays.toString(languages) + ", selectedLanguage="
				+ selectedLanguage + ", selectedCategory=" + selectedCategory + "]";
	}
			
}
