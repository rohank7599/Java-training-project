package AccessModifier;

public class Demo1 {

//	// public String ab = "abc"; //inside package,outside package
//	private String ab = "abc"; // Access Within the class, Can't access within the outside the class
//
//	// protected String ab = "abc"; // Access Within the package and outside through
//	// child class
//
//	public String getABC() {
//		return ab;
//  }
//	public void setABC(String s1) {
//		ab=s1;
//	}
//
//	public static void main(String[] args) {
//		Demo1 demo = new Demo1();
//		System.out.println(demo.ab);
//
//	}

	private String studentname;
	private int rollno;
	private char div;

	
	
	public Demo1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo1(String studentname, int rollno, char div) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.div = div;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public char getDiv() {
		return div;
	}

	public void setDiv(char div) {
		this.div = div;
	}

}
