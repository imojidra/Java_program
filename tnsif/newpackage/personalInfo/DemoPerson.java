package tnsif.newpackage.personalInfo;

import Day5.CalculateTaxCountry;
import tnsif.newpackage.countryInfo.*;
//import tnsif.newpackage.personalInfo.*;

public class DemoPerson {
	public static void main(String args[])
	{
		Country c = new Country("India");
		State s = new State("Gujarat");
		Person p = new Person("ishita",c,s,25,90000);
		CalculateTaxCountry ct = new CalculateTaxCountry();
		
		ct.taxCal(p);
		
	
		System.out.println(p.toString());
		
		
	}
}
