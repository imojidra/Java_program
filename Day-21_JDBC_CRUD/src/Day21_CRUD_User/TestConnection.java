package Day21_CRUD_User;

import Day21_CRUD.CRUDOperation;

import java.util.*;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		tns_student ts = new tns_student();
		
		CRUDOperation crd = new CRUDOperation();
		
		//crd.updateData(ts.getSname(), ts.getStud_id());
		int ch=0;
		do{
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice : ");
			ch=sc3.nextInt();
			switch(ch){
			case 1: // insert
				System.out.println("Enter Student Id : ");
				ts.setStud_id(sc.nextLine());
				
				System.out.println("Enter Name : ");
				ts.setSname(sc1.nextLine());
		
				System.out.println("Enter Stream : ");
				ts.setStream(sc2.nextLine());
				crd.insertData(ts.getStud_id(), ts.getSname(), ts.getStream());
				System.out.println("Inserted...");
				break;
				
			case 2: // delete
				System.out.println("Enter Id you want to delete : ");
				ts.setStud_id(sc.nextLine());
				
				crd.deleteData(ts.getStud_id());
				break;
				
			case 3: //update
				System.out.println("Enter Id you want to update : ");
				ts.setStud_id(sc.nextLine());
				
				System.out.println("Enter New Name : ");
				ts.setSname(sc1.nextLine());
				
				System.out.println("Enter New Stream : ");
				ts.setStream(sc2.nextLine());
				
				crd.updateData(ts.getSname(),ts.getStream(),ts.getStud_id());
				break;
				
			case 4: // show table
				
				crd.getData();
			}
		}while(ch!=5);
	}

}
