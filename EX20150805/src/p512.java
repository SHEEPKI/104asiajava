import java.util.Scanner;
public class p512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J��妨�Z:");
		float a=scn.nextFloat();
		System.out.print("�п�J�^�妨�Z:");
		float b=scn.nextFloat();
		System.out.print("�п�J�ƾǦ��Z:");
		float c=scn.nextFloat();
		float d=a+b+c;
		System.out.println("�`����"+d);
		float f=(a+b+c)/3;
		System.out.println("������"+f);
	}

}
