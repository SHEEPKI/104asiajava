import java.util.Scanner;
import java.util.Random;
public class p111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		
	int data[]=new int[10];
     int count=0;
     
     for(int i=0;i<10;i++){
    	 data[i]=rnd.nextInt(100);
    	 if(data[i]%2==0){
    		 
    		 count++;
    		
    	 } 
     }
     int j=1;
     while(j<=3){
    	 System.out.println("猜有幾個偶數:");
    	 int k=scn.nextInt();
    	 if(k==count){
    		 System.out.println("猜對!"); 
    		 System.out.print(rnd.nextInt(100)+1+" ");
    		 break;
    		 
    	 }else{
    		 System.out.println("答錯!");
    		 System.out.print(rnd.nextInt(100)+1+" ");
    	 j++;
     }
    	
     }
	}

}
