package tnsif.newpackage.personalInfo;


import tnsif.newpackage.countryInfo.*;
import tnsif.newpackage.personalInfo.*;

public class Person {
	private String pname;
	private Country c1;
	private State s1;
	private int age;
	private double sal;
	
	public Person()
	{
		this.pname="";
	}
	
	public Person(String pname, Country c1, State s1,int age,double sal) {
		//super();
		this.pname = pname;
		this.c1=c1;
		this.s1=s1;
		this.age=age;
		this.sal=sal;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Country getC1() {
		return c1;
	}

	public void setC1(Country c1) {
		this.c1 = c1;
	}

	public State getS1() {
		return s1;
	}

	public void setS1(State s1) {
		this.s1 = s1;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", c1=" + c1 + ", s1=" + s1 + ", age=" + age + ", sal=" + sal + "]";
	}

	
		
}
