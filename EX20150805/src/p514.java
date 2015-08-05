import java.util.Scanner;
public class p514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入身高(cm):");
		float a=scn.nextFloat();
		System.out.print("請輸入體重(kg):");
		float b=scn.nextFloat();
		float d=(float)(a/2.54);
		System.out.println(d+"英吋");
		float f=(float)(b/0.454);
		System.out.println(f+"磅");
	}

}
