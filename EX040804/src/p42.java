import java.util.Scanner;
public class p42 {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入A值:");
		float a=scn.nextFloat();
		System.out.print("請輸入B值:");
		float b=scn.nextFloat();
		System.out.print("你要做的運算是+,-,*或/?");
		float d=a+b;
		float e=a-b;
		float f=a*b;
		float g=a/b;
		String str=scn.next();
		if(str.equals("+")){
		System.out.println(a+"+"+b+"="+d);
		}else{
		if(str.equals("-")){
		System.out.println(a+"-"+b+"="+e);
		}else{
		if(str.equals("*")){
		System.out.println(a+"*"+b+"="+f);
		}else{
		if(str.equals("/")){
		System.out.println(a+"/"+b+"="+g);
				}
			}
		}
		}
		
		
	}

}
