package eclipse_prac;

/*class Calculator{
	int num1,num2,result;
	
	public void calc() {
		result=num1*num2;
	}
}*/
public class Object_prac {
	public static void main(String args[]) {
		//Calculator obj =new Calculator();
		//obj.num1=4;
		//obj.num2=5;
		//obj.calc(); 
		//System.out.println("The result is " + obj.result);
	//}





 /*class Rehearse{
	int p,q,result;
	public void marian() {
		result=p+q;
	}
}
public class Object_prac{
	public static void main(String args[]) {
		Rehearse obj=new Rehearse();
		obj.p=4;
		obj.q=13;
		obj.marian();
		System.out.println("The answer is " + obj.result);
		
	}
	
}*/

char arr_dollar[]= {'$',' ',' ','$'};
for(int i=1;i<=4;i++) {
	if(i==1||i==2) {
		for(int j=1;j<=4;j++) {
			System.out.print(arr_dollar[j]);
		}
		
	}else {
		for(int j=1;j<=4;j++) {
			System.out.print('$');
		}
	}
	System.out.println();
}
}
}

