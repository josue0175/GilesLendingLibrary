package com.jgiles.bfu.main;

public enum Language {
	
	JAPANESE, ENGLISH;
	
	 public String toString() {
		 switch(this) {
			 case JAPANESE:
				 return "Japanese Language";
			 case ENGLISH:
				 return "English Language";
		 }
		return null;
				 
	 }
	

}
