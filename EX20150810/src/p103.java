import java.util.Scanner;
public class p103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("¿é¤Jn:");
		int n=scn.nextInt();
         for(int i=0;i<n;i++){
        	 for(int j=0;j<n-i-1;j++){
        		 System.out.print(" ");
        	 }
        	 for(int k=0;k<=i*2;k++){
        	    System.out.print("*");	 
        	 }
        	 System.out.println();
         }
         int v1=(int)Math.ceil(n/2);
         int v2=n-v1;
         for(int i=0;i<=v2;i++){
        	 for(int j=0;j<=i;j++){
        		 System.out.print(" ");
        	 }
        	 for(int k=0;k<(v2-i)*2+1;k++){
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}
