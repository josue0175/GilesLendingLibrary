package com.jgiles.bfu.main;

public abstract class AuthoredTxtSpec {
	
	private Language language;
	private int pages;
	private String audience; //???
	private String condition; //create enum
	private String location; //create enum
	private String genre; //isbn data
	private String subgenre; //isbn data
	private String title; //isbn data
	private String status; //isbn data

	public AuthoredTxtSpec(Language language, int pages, String audience,
			String condition, String location, String genre, String subgenre,
			String title, String status) {
		this.language = language;
		this.pages = pages;
		this.audience = audience;
		this.condition = condition;
		this.location = location;
		this.genre = genre;
		this.subgenre = subgenre;
		this.title = title;
		this.status = status;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public String getAudience() {
		return audience;
	}
	public void setAudience(String audience) {
		this.audience = audience;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSubgenre() {
		return subgenre;
	}
	public void setSubgenre(String subgenre) {
		this.subgenre = subgenre;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	//This search is seriously broken
	public boolean matches(AuthoredTxtSpec otherSpec) {
		
			//Include the check for null for multiple matches
			if((otherSpec.getGenre() != null) && (otherSpec.getGenre() != null) && (genre != otherSpec.getGenre())) return false;
			if((otherSpec.getLanguage() != null) && (otherSpec.getLanguage() != null) && (language != otherSpec.getLanguage())) return false;

			return true;
	}

}
