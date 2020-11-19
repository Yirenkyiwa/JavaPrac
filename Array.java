package eclipse_prac;

public class Array {
	public static void main(String args[]) {
		/*char arr_dollar[]= {'$',' ',' ','$'};
		for(int i=0;i<4;i++) {
			if(i==1||i==2) {
				for(int j=0;j<4;j++) {
				 	System.out.print(arr_dollar[j] + "  ");
				}
			}else {
				for(int j=0;j<4;j++) {
					System.out.print('$' + "  ");
				}
				
			}
			System.out.println();
		}*/
		
		char arr_dollar[]= {'$',' ',' ','$'};
		for(int i=1;i<=4;i++) {
			if(i==2||i==3) {
				for(int j=1;j<=4;j++) {
				 	System.out.print(arr_dollar[j-1] + "  ");
				}
			}else {
				for(int j=1;j<=4;j++) {
					System.out.print('$' + "  ");
				}
				
			}
			System.out.println();
		}
		
		int arr_num[]=new int[4];
		arr_num[0]=5;
		arr_num[1]=7;
		arr_num[2]=9;
		arr_num[3]=12;
		for(int i=0;i<4;i++) {
			System.out.print(arr_num[i] + " ");
		}
		
		}

}
