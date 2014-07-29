package com.jgiles.bfu.main;

public class MagazineSpec extends AuthoredTxtSpec {
	private String dateIssued;

	public MagazineSpec(String dateIssued, Language language, int pages, String audience,
			String condition, String location, String status, String genre, String subgenre,
			String title) {

		super(language, pages, audience, condition, location, genre, subgenre,
			title, status);

		this.setDateIssued(dateIssued);
	}

	public String getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(String dateIssued) {
		this.dateIssued = dateIssued;
	}	

	public boolean matches(MagazineSpec otherSpec) {
			
		if(!super.matches(otherSpec)) return false;
		if(!(otherSpec instanceof MagazineSpec)) return false;
		//Include the check for null for multiple matches
		MagazineSpec spec = (MagazineSpec)otherSpec;
		if(dateIssued != spec.getDateIssued()) return false;

		return true;
		}
}
