package Day17_ListCollection;

public class Color {
	private int cno;
	private String Cname;
	
	
	public Color(int cno, String cname) {
		super();
		this.cno = cno;
		Cname = cname;
	}
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	@Override
	public String toString() {
		return "Color [cno=" + cno + ", Cname=" + Cname + "]";
	}
	
	
}
