package CoreJavaTraning;

public class BasicJava {

	// Parameterise method
	public int addition(int a, int b) {
		return a + b;

	}
//	public void addtoDatabase(String firstname, String lastname, int rollno) {
//		
//String sqlQuery="insert into studenttable(firstname,lastname,rollno) values("+firstname+","+lastname+","+rollno+" );";
//System.out.println(sqlQuery);
//	}
//	// non-parameterize method

	public void addition() {
		System.out.println("non-parameterize method");
	}
	
	public void getdata() {
		String firstname="Rohan";
		String  lastname="Karade";
		System.out.println(firstname+lastname);
		
	}

	public static void main(String[] args) {

		BasicJava basic = new BasicJava();
		System.out.println(basic.addition(10, 20));
		basic.addition();
		basic.getdata();
//		basic.addtoDatabase("Rohan", "Karade", 36);

//int var1=10;
//	int var2=20;
//	
//	int var3=var1/var2;
//	System.out.println(var3);

	}
}
