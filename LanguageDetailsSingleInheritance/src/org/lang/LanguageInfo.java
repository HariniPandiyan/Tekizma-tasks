package org.lang;



public class LanguageInfo extends StateDetails{
	
	public void englishLanguage() {
		System.out.println("English is one of the language which is used to improve our communication skill");
	}
	public void tamilLanguage() {
		System.out.println("Tamil is one of the famous Language ");
	}
	public void hindilanguage() {
		System.out.println("Hindi is our National Language");
	}
	public static void main(String[] args) {
		LanguageInfo lang = new LanguageInfo();
		lang.englishLanguage();
		lang.tamilLanguage();
		lang.hindilanguage();
		lang.southIndia();
		lang.northIndia();

	}

}
