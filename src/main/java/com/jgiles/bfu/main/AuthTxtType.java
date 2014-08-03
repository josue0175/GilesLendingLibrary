package com.jgiles.bfu.main;

public enum AuthTxtType {
	BOOK, MAGAZINE;
		
	public String toString() {
		switch(this) {
			case BOOK:
				return "Book";
			case MAGAZINE:
				return "Magazine";
		}
		return null;
					 
	}
		

}
