import java.util.Scanner;
public class p514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J����(cm):");
		float a=scn.nextFloat();
		System.out.print("�п�J�魫(kg):");
		float b=scn.nextFloat();
		float d=(float)(a/2.54);
		System.out.println(d+"�^�T");
		float f=(float)(b/0.454);
		System.out.println(f+"�S");
	}

}
