package Arrays;

public class Array {
	public static void main(String[] args) {

//	  int arr[];
//		arr = new int[5];
//		//int arr[] = new int[5];       //Simple array
//
//		arr[0] = 10;
//		arr[1] = 50;
//		arr[2] = 44;
//		arr[3] = 66;
//
//		//int[] arr2= {1,2,3,5,8};
//		
//		int length = arr.length;
//		System.out.println(length);

//		 Student arr[]= new Student[5];
//		 
//		 Student s1=new Student();
//		 Student s2=new Student();
//		 Student s3=new Student();
//		 s1.studentname="rohan";
//		 s1.rollno=1;
//		 
//		 arr[1]=s1;
//		System.out.println(arr[1].studentname);
//		System.out.println(arr[1].rollno);

		// Multi-Dimensional Array (2D, 3D, etc.)

		int arr2[][] = {

				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 },
		};
           // System.out.println(arr2[1][2]);
	
		 for(int i=0;i<arr2.length;i++) // Loop through rows ----->
		 {
			 
			 for(int j=0;j<arr2[i].length;j++)// Loop through columns |
				 {
				 System.out.println(arr2[i][j] + " ");// Print each element
				 
			 }
			 
			 System.out.println();
		 }
		
		
	

	}
}
