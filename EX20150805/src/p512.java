import java.util.Scanner;
public class p512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入國文成績:");
		float a=scn.nextFloat();
		System.out.print("請輸入英文成績:");
		float b=scn.nextFloat();
		System.out.print("請輸入數學成績:");
		float c=scn.nextFloat();
		float d=a+b+c;
		System.out.println("總分為"+d);
		float f=(a+b+c)/3;
		System.out.println("平均為"+f);
	}

}
