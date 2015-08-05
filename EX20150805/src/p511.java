import java.util.Scanner;
public class p511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入a值:");
		int a=scn.nextInt();
		System.out.print("請輸入b值:");
		int b=scn.nextInt();
		int d=a+b;
		System.out.println("合為"+d);
		int e=a-b;
		System.out.println("差為"+e);
		int f=a*b;
		System.out.println("乘積為"+f);
	}

}
