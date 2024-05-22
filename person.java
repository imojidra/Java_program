package tnsworkshop.newpackage.personalinfo;

import tnsworkshop.newpackage.country.country;
import tnsworkshop.newpackage.country.state;

public class person {

	private String pname;
	private country c1;
	private state s1;
	
	public person(String pname, country c1, state s1) {
		this.pname = pname;
		this.c1 = c1;
		this.s1 = s1;
	}

	public person() {
		
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public country getC1() {
		return c1;
	}

	public void setC1(country c1) {
		this.c1 = c1;
	}

	public state getS1() {
		return s1;
	}

	public void setS1(state s1) {
		this.s1 = s1;
	}

	@Override
	public String toString() {
		return "person [pname=" + pname + ", c1=" + c1 + ", s1=" + s1 + "]";
	}
	
	
	
	
	
	
	
}
