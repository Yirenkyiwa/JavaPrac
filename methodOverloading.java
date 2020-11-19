package eclipse_prac;

//import java.io.*;

class methodOverload{
	int a,b,c;
	
	public void Overload(int a, int b, int c){
		a=3;
		b=5;
		c=8;
		int add=a+b+c;
		System.out.println(add);
	}
}

public class methodOverloading {
	public static void main(String args[]) {
		methodOverload obj = new methodOverload();
		obj.Overload(5,6,8);
		
		
		double arr_num[][]= {{1.2,9.0,3.2},{9.2,0.5,1.5,-1.2},{7.3,7.9,4.8}};
		System.out.println(arr_num[2][2]);
		
		int []t[]= {{1,2,3,4},{5,6,7,8},{2,6,4,5}};
		System.out.println(t.length);
		
		int values[]= {1,2,3,4,5,6,7,8};
		for(int i=0;i<8;++i) {
			System.out.print(values[i] + "  ");
	        System.out.println();
		}
		
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(i*10+j+"  ");
			}
			    System.out.println();
			
			}
		
		//printing 1-5 using while,do-while and for loop
		int count=0;
		while(count<6) {
			System.out.print(count + " ");
			count++;
			
		}
		
		
		System.out.println();
		
		
		int counting=0;
		do {
			System.out.print(counting + " ");
			counting++;
		}while(counting<6);
		
		System.out.println();
		
		
		for(int counts=0;counts<6;counts++) {
			System.out.print(counts + " ");
			
		}
		
		System.out.println();
		
		int x=2; int y=1;
		x*=y+1;
		System.out.println(x);
		
		int a,b;
		for(a=1, b=0;a<10;a++) {
			b+=a;
			System.out.print(b + " ");
		}
		
		System.out.println();
		
		int n=1,f=1;
		while(n<=4) {
			f*=n++;
			System.out.print(f + " ");
		}
		
		System.out.println();
		
		boolean done=false;
		int m=5;
		while(m>0 && !done) {
			--m;
			System.out.println(m);
			done=(m*m==1 ||n<3);
		}
		System.out.println();
		
		for(int p=1;p<5;p++) {
			for(int q=1;q<=p;q++) {
				System.out.print(p*q);
			}
			System.out.println();
		}
		
	}
}
