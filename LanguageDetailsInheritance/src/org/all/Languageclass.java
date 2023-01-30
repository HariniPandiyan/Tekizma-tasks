package org.all;

import org.telgu.Telgu;

public class Languageclass extends Telgu {
	String tamil;
	String eng;
	String tel;
	public void alllanguage() {
		System.out.println(tamil);
		System.out.println(eng);
		System.out.println(tel);
	}
	
	public static void main(String[] args) {
		Languageclass lang = new Languageclass();
		lang.eng="English";
		lang.tamil="Tamil";
		lang.tel="Telugu";
		lang.alllanguage();

	}

}
