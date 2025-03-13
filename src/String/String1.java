package String;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {

//		String str2 = new String("Karade");
//		String str3 = new String("rohan");
//		String st4 = "rohan";
		// String str1 ="rohan";

//		System.out.println(str1 + " " + str3); 

		// <******Length method********>

//		String str1 = "rohan3333";
//		int length = str1.length();
//		if (length < 8) {
//			System.out.println("Password should minimun lenth 8");
//			return;
//		} else {
//
//			System.out.println("Correct Password");
//		}

//           <*******charAt(int index)*******>		

//		String str1= "srohanki2Agstya";
////		char ch='z';
////		System.out.println(str1.charAt(8)==ch);
//		
//		if(str1.charAt(0)=='f'){
//			System.out.println("First year student");
//		}else if (str1.charAt(0)=='s'){
//			System.out.println("Second year student");
//			
//		}

//     <*******substring(int start)*******>	

//		String str1="RohanAgstya";
//		System.out.println(str1.substring(5,10));

		// Real Time
//		String filename = "abc.xyz.wdqwd.pdf";
//		// System.out.println(filename.substring(3));
//		// System.out.println(filename.lastIndexOf("."));
//		int indexofDot = filename.lastIndexOf(".");
//		if (!filename.substring(indexofDot).equals(".pdf")) {
//			System.out.println("only PDF file allowed");
//			return;
//		}
//           System.out.println("File upload succesfully");

//		<******contains(CharSequence sequence)*******>		

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Search");
//		String searchTerm = sc.nextLine();
//		
//		String str1[]= {"Agstya","rohan","ki2","mama"};
//		
//		for(int i=0;i<str1.length;i++){
//			if(str1[i].contains(searchTerm)) {
//				System.out.println(str1[i]);
//			}
//		}

////		<******startsWith(String prefix) and endsWith(String suffix)*******>
//		
//		String str1="F5132131315";
//
//		System.out.println(str1.charAt(0));
//		System.out.println(str1.startsWith("g"));
//		System.out.println(str1.endsWith("315"));

//		<******startsWith(String prefix) and endsWith(String suffix)*******>

//		String str1 = "ROhan5151651561";
//	if (str1.toLowerCase().startsWith("roh")) {
//		System.out.println("strting with provided content");	
//	}else {
//		System.out.println("false");
//	}
//		if (str1.toUpperCase().startsWith("RO")) {
//			System.out.println("strting with provided content");
//		} else {
//			System.out.println("false");
//		}

//		<******trim() method*******>	
		
//		String str1=" rogaehcebcu ";
//	System.out.println(str1.trim().length());
//		System.out.println(str1.trim());
//		
		
//		<******replace(char oldChar, char newChar)*******>	
//		String str1= "fuihdiqw6264161";
//		System.out.println(str1.replace("f","R"));

		
//		<******replaceAll(char oldChar, char newChar)*******>	
//		
//		String str1="rohan";
//		System.out.println(str1.replaceAll("rohan", "Agstya"));
//		
		
////		<******split(String regex)*******>	
//		
//		String str1="Rohan,Agastya,Ki2";
//		System.out.println(str1.split(",").toString());
//		
		
		
////	<******concat *******>	
		
		String str1="rohan";
		String str2="karade";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
		
		
	}
}
