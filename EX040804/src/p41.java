import java.util.Scanner;
public class p41 {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     System.out.print("�п�JA��:");
     int a=scn.nextInt();
     System.out.print("�п�JB��:");
     int b=scn.nextInt();
     if(a>b){
     System.out.println(a+">"+b);
     }else{
     if(a<b){
     System.out.println(a+"<"+b);
    }else{
    if(a==b){
    System.out.println(a+"="+b);
    		 }
    	 }
     }
     
     
	}

}
