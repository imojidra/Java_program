package Day21_CRUD_User;

public class tns_student {
	private String stud_id;
	private String sname;
	private String stream;
	
	public tns_student(){
		
	}

	public tns_student(String stud_id, String sname, String stream) {
		super();
		this.stud_id = stud_id;
		this.sname = sname;
		this.stream = stream;
	}

	public String getStud_id() {
		return stud_id;
	}

	public void setStud_id(String stud_id) {
		this.stud_id = stud_id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "tns_student [stud_id=" + stud_id + ", sname=" + sname + ", stream=" + stream + "]";
	}
	
	
}
