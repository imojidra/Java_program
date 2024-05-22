package tnsworkshop.newpackage.country;

public class country {

	private String cname;

	
	public country(String cname) {
		
		this.cname = cname;
	}
	

	public country() {
		
	}


	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "country [cname=" + cname + "]";
	}
	
}
