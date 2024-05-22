package tnsworkshop.newpackage.country;

public class state {

	private String sname;

	public state(String sname) {
		
		this.sname = sname;
	}

	
	public state() {
		
	}


	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "state [sname=" + sname + "]";
	}
	
	
	
}
