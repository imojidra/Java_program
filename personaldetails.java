package tnsworkshop.newpackage.personalinfo;

import tnsworkshop.newpackage.country.country;
import tnsworkshop.newpackage.country.state;

public class personaldetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		country c=new country("India");
		state s=new state("Gujarat");
		person p=new person("Devanshi",c,s);
		
		System.out.println(p);
		
		country c1=new country();
		state s1=new state();
		person p1=new person();
		
		c1.setCname("India");
		s1.setSname("UP");
		
		p1.setC1(c1);
		p1.setS1(s1);
		p1.setPname("Vishwa");
		System.out.println(p1);
		
		
		

	}

}
