package Day21_CRUD;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUDOperation crd = new CRUDOperation();
		//DatabaseConnection1.getConnection();
		//CRUDOperation.insertData("s002","Ishita","MCA");
		//CRUDOperation.deleteData("s004");
		
		CRUDOperation.updateData("Ishita","BCOM","s004");
		//CRUDOperation.getData();
	}

}
