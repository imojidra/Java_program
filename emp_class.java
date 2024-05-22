package workshop_java;
import java.util.*;
import java.io.*;
public class emp_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		
		/*System.out.println("Enter Name =");
		name=sc.nextLine();
		System.out.println("Enter Id=");
		id=sc.nextInt();*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter Name =");
		name=br.readLine();
		System.out.println("Enter Id=");
		id=Integer.parseInt(br.readLine());
		Employee e2=new Employee(id,name);
		
		System.out.println(e2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setName("Devanshi");
		System.out.println(e1);
		
		
		
	}

}
