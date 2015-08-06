import java.util.Scanner;
public class p64_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
	     System.out.println("輸入班級人數:");
	     int a=scn.nextInt();
	     int ab=0;
	     int ac=0;
	     for(int i=0;i<a;i=i+1){
	    	 System.out.println("輸入體重:");
		     int b=scn.nextInt();
		     ab=ab+b;
		     
		     System.out.println("輸入身高:");
		     int c=scn.nextInt();
		     ac=ac+c;
		     
	     }
	     int h=ac/a;
	     int w=ab/a;
	     System.out.println("平均身高"+h);
	     System.out.println("平均體重"+w);
	}

}
