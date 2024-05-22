package workshop_java;

public class Employee {

	private int eid;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Employee() {
		eid=1;
		name="devanshi";
	}

	public Employee(int eid, String name) {
		
		this.eid = eid;
		this.name = name;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
}
