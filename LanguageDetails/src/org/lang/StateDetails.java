package org.lang;

public class StateDetails {
	String southIndia;
	String northIndia;
	
	void setMethod(String south,String north) {
		southIndia=south;
		northIndia=north;
	}
	
	void Display()
	{
		System.out.println(southIndia);
		System.out.println(northIndia);
	}
	public static void main(String[] args) {
		LanguageInfo lang =new LanguageInfo();
		lang.setMethod("tamil", "english","hindi");
		lang.Display();
		
		StateDetails state = new StateDetails();
		state.setMethod("south", "north");
		state.Display();
	}

}
