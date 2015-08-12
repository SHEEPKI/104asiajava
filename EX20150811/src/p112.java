import java.util.Scanner;
import java.util.Random;
public class p112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		
		int data[]=new int[10];
		int i=0;
		int count=0;
	    boolean flag=false;
	    while(i<10){
		data[i]=rnd.nextInt(100);
		flag=false;
		for(int j=0;j<i;j++){
			if(data[i]==data[j]){
				boolean ture=false;
				flag=ture;
			}
		}
		if(flag==false){
			i++;
			int j=1;
			System.out.println("猜有幾個偶數:");
			while(j<=3){
				int k=scn.nextInt();
		    	 if(k==count){
		    		 System.out.println("猜對!"); 
		    		 data[i]=rnd.nextInt(100);
		    		 //System.out.print(rnd.nextInt(100)+1+" ");
		    		 break;
		    		 
		    	 }else{
		    		 System.out.println("答錯!"); 
		    	 j++;
		    	 }
			}
		}
	}
	}

}