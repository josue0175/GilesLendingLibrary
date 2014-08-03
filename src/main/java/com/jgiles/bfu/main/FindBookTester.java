package com.jgiles.bfu.main;

import java.util.List;

public class FindBookTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		//Should return 1 
		BookSpec whatNorikoLikes = new BookSpec("12345", Language.JAPANESE, 20, "children", "used"
				, "19 Longlake Childrens room", "available", "manga", null, "Tsutokkodokoi");
//	public BookSpec(String isbn, Language language, int pages, String audience,
//			String condition, String location, String genre, String subgenre,
//			String title, String status) {
//		
		//No matches
		BookSpec whatNorikoWants = new BookSpec("123456", Language.ENGLISH, 20, "children", "used"
				, "19 Longlake Childrens room", "available", "blah", null, "Tsutokkodokoi");

		//Should return 2 
		//null genre means match all genres
		MagazineSpec whatNorikoReallyWants = new MagazineSpec("01-22-2013", Language.JAPANESE, 21, "children", "new"
				, "19 Longlake Childrens room", "checked out", null, null, "Tsuru no Ongaishi");

		
		List foundBooks = inventory.search(whatNorikoLikes);
		
		if(foundBooks != null) {
			System.out.println(foundBooks);
		}
		else 
			System.out.println("Sorry no books found");

		List anotherfoundBooks = inventory.search(whatNorikoWants);
		
		if(anotherfoundBooks != null) {
			System.out.println(anotherfoundBooks);
		}
		else 
			System.out.println("Sorry no books found");
		
//		List anotheronefoundBooks = inventory.search(whatNorikoReallyWants);
//		if(anotheronefoundBooks != null) {
//			System.out.println(anotheronefoundBooks);
//		}
//		else 
//			System.out.println("Sorry no books found");
				
		
	}
	private static void initializeInventory(Inventory inventory) {
		BookSpec bspec1 = new BookSpec("123456", Language.JAPANESE, 20, "children", "used"
				, "19 Longlake Childrens room", "available", "manga", null, "Tsutokkodokoi");
		inventory.addAuthoredTxt(bspec1, "01a", 20.0);

		BookSpec bspec2 = new BookSpec("1234567", Language.JAPANESE, 21, "children", "new"
				, "19 Longlake Childrens room", "checked out", "storybook", null, "Tsuru no Ongaishi"); 
		inventory.addAuthoredTxt(bspec2, "01b", 21.0);

		//BUG: Cannot have Mags and Books in same place
//		MagazineSpec mspec1 = new MagazineSpec("01-22-2013", Language.JAPANESE, 21, "children", "new"
//				, "19 Longlake Childrens room", "checked out", "storybook", null, "La cama grande de sofia"); 
//		inventory.addAuthoredTxt(mspec1, "01c", 22.0);

	}

}
