package Day7_Hierarchi_inhe;

public class SalMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setName("Ishita");
		e.setAge(22);
		e.setAdd("Ahmedabad");
		e.setPhn("8849365656");
		e.setSal(55000);
		e.setSpec("Java");
		e.setDept("Devlopment");
		
		Manager m = new Manager();
		m.setName("dimpal");
		m.setAge(23);
		m.setAdd("Rajkot");
		m.setPhn("9801765432");
		m.setSal(45000);
		m.setSpec("Android UI/UX");
		m.setDept("Design");
		
		System.out.println("Employee : ");
		e.printSalary();
		System.out.println(e);
		
		System.out.println("Manager : ");
		m.printSalary();
		System.out.println(m);
		
	}
}
