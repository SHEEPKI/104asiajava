import java.util.Scanner;
public class p56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�Ja��:");
		float a=scn.nextFloat();
		System.out.print("�п�Jb��:");
		float b=scn.nextFloat();
		System.out.print("�п�Jc��:");
		float c=scn.nextFloat();
		if(a*a+b*b>c*c){
			System.out.println("�U���T����");
		}else{
			if(a*a+b*b==c*c){
				System.out.println("�����T����");
			}else{
				if(a*a+b*b<c*c){
					System.out.println("�w���T����");
				}
			}
		}
	}

}
