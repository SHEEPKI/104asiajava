import java.util.Scanner;
public class p53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�Ja��:");
		float a=scn.nextFloat();
		System.out.print("�п�Jb��:");
		float b=scn.nextFloat();
		System.out.print("�п�Jc��:");
		float c=scn.nextFloat();
		if(a<=b&&b<=c&&a<=c){
		     System.out.println("�O");
		}else{
			System.out.println("�_");
		}
	}

}
