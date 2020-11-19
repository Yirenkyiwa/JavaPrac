package eclipse_prac;

//variable length arguments
class Calc{
	public int add(int ... p) {// the '...' stores all parameters in the method 'add' as an array.NB: The user can enter as many parameters as you desire
		int sum=0;
		for(int q : p) {//the values in variable 'p' is stored in new variable 'q'
			sum=sum + q;//sums all values in 'p'
		}
		return sum;
	}
}

class Calculator{
	public int addition(int a,int b) {
		int result = a+b;
		return result;
	}
}
public class Found {
	public static void main(String args[]){ 
		
		//a program to print two dimensional array
		int arr_num[][]= {
							{1,2,3,4},//arrays deal with rows and columns. Rows are the horizontal dimension while columns are the vertical dimension
							{2,4,6,8},
							{5,6,7,8}
		};
		
		for(int i=0;i<3;i++) {//i is used to represent the rows
			for(int j=0;j<4;j++) {//j is used to represent the columns. j prints out the array
				System.out.print(arr_num[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n======================\n");
		
		//dealing with jagged arrays
		int arr_num2[][]= {{1,3,5,7},{3,6,9},{2,4,6,8}};
		for(int m=0;m<arr_num2.length;m++) {//the .length is used to check the length of the rows of the array
			for(int n=0;n<arr_num2[m].length;n++) { //array_num2[m].length is checking the length of the rows of the array 
				System.out.print(arr_num2[m][n] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n=======================\n");
		
		//printing '*' in increasing order from 1-4 on new lines
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=a;b++) {//this for loop prints the number of stars
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=======================\n");
		
		//using enhanced for loops 
		int digits[]= {2,12,6,9,23};
		for(int p : digits) {// this 'for loop' stores all values stored in the array 'digits' into the variable 'p'
			System.out.print(p + " ");
		}
		System.out.println();
	
		System.out.println("\n=======================\n");
		
		//using enhanced for loops in 2 dimensional arrays
		int num[][]={{2,12,6,9,23},{3,4,8,9,14},{12,34,67,32,5}};
		for(int k[] : num) {//k[] stores the values in the array 'num'
			for(int l : k) {//l stores the values in the array 'k'
				System.out.print(l + " ");//prints the values in array 'k' with spaces between them
			}
		System.out.println();
		}
		System.out.println("\n=======================\n");
		
		Calc obj = new Calc(); //creating an object of the class 'Calc'
		System.out.println(obj.add(2,14,6));//calling the method 'add' to be executed
		
		System.out.println("\n=======================\n");
		
		Calculator object = new Calculator();
		System.out.println(object.addition(4,8));
		
	}

}
