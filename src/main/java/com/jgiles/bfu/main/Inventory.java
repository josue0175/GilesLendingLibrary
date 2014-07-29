package com.jgiles.bfu.main;

//http://www.javabeat.net/implementing-restful-api-for-obtaining-the-book-details-for-an-isbn/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Inventory {
	
	private List inventory;

	public Inventory() {
		inventory = new LinkedList<AuthoredTxt>();
	}
	
	public void addAuthoredTxt(AuthoredTxtSpec spec, String sid, double price) {
		AuthoredTxt authoredtxt = null;

		if(spec instanceof BookSpec) {
			authoredtxt = new Book((BookSpec) spec, sid, price);
		}
		if(spec instanceof MagazineSpec) {
			authoredtxt = new Magazine((MagazineSpec) spec, sid, price);
		}

		inventory.add(authoredtxt);
	}
	
	public AuthoredTxt getAuthoredTxt(String sid) {
		for(Iterator i = inventory.iterator(); i.hasNext();) {
			AuthoredTxt authtxt = (AuthoredTxt)i.next();
			
			if(authtxt.getSid().equals(sid)) return authtxt;
		}
		return null;
	}

	
	//This search is seriously broken
	public List search(BookSpec searchSpec) {
		List matchingBooks = new LinkedList<Book>();
		
		//TODO broken here; If magazine is part of the inventory this casting to Book breaks
		for(Iterator i = inventory.iterator(); i.hasNext();) {
			Book book = (Book)i.next();
			//delegate search to BookSpec class; Use the book->spec instance to do a match with the searchSpec
			if(book.getSpec().matches(searchSpec)) matchingBooks.add(book);
		}
		return matchingBooks;
	}
	
	//This search is seriously broken
	public List search(MagazineSpec searchSpec) {
		List matchingMagazines = new LinkedList<Magazine>();
		
		for(Iterator i = inventory.iterator(); i.hasNext();) {
			Magazine magazine = (Magazine)i.next();
			//delegate search to MagazineSpec class; Use the magazine->spec instance to do a match with the searchSpec
			if(magazine.getSpec().matches(searchSpec)) matchingMagazines.add(magazine);
		}
		return matchingMagazines;
	}
}
