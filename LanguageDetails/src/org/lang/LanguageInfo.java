package org.lang;

public class LanguageInfo {
	String tamilLanguage;
	String englishLanguage;
	String hindiLanguage;
	
	void setMethod(String tamil,String english,String hindi) {
		tamilLanguage=tamil;
		englishLanguage=english;
		hindiLanguage=hindi;
	}
	
	void Display()
	{
		System.out.println(tamilLanguage);
		System.out.println(englishLanguage);
		System.out.println(hindiLanguage);
	}
	
}
