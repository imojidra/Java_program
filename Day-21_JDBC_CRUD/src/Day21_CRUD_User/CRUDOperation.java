package Day21_CRUD_User;

import java.sql.*;
import javax.sql.*;


public class CRUDOperation {
	static Statement st;
	Connection cn;
	
	public CRUDOperation(){
		cn = DatabaseConnection1.getConnection();
		try {
			st = cn.createStatement(); // create null statement
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void insertData(String stud_id, String sname, String stream){
		
		/* insert recored by here
		 * String iquery = "insert into tns_student values('s005','Jahanvi','MBA')";*/
		 String iquery = "insert into tns_student values('" + stud_id + "','" + sname + "','"+ stream+ "')";
		try {
			int result = st.executeUpdate(iquery); // executing Query
			if(result > 1){
				System.out.println("Inserted sucessfully....");
			}
		}
		catch(SQLIntegrityConstraintViolationException sq){
			System.out.println("Please enter unique number for student id");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inserted sucessfully");
	}
	
	public static void deleteData(String stud_id){
		//String dquery = "delete from tns_student where stud_id='s004'";
		String dquery = "delete from tns_student where stud_id='"+stud_id+"'";
		int r;
		try {
			r = st.executeUpdate(dquery);
			if(r>0){
				System.out.println("Deleted Sucessfully....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void updateData(String sname,String streams,String stud_id){
		String uquery = "update tns_student set sname= '"+sname+"',stream='"+streams+"' where stud_id= '"+stud_id+"'";
		try {
			int r = st.executeUpdate(uquery);
			if(r>0){
				System.out.println("Updated Sucessfully....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getData(){
		String squery = "select * from tns_student";
		try {
			ResultSet r = st.executeQuery(squery); // executeQuery is used only for select statement to print the output over here
			System.out.println(r); 
			while(r.next()){
				System.out.println(r.getString(1)+ " " +r.getString(2)+" " + r.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

