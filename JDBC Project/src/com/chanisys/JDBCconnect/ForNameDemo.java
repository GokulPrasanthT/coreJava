package com.chanisys.JDBCconnect;

public class ForNameDemo {

	public static void main(String[] args) {
		Actor hero=new Actor();
		hero.Name="VJS";
		hero.city="Theni";
		String classname ="JDBCconnect";
		Class firstclass=Class.forName(classname);

	}

}
