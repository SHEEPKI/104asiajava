import java.util.Scanner;
public class p56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入a值:");
		float a=scn.nextFloat();
		System.out.print("請輸入b值:");
		float b=scn.nextFloat();
		System.out.print("請輸入c值:");
		float c=scn.nextFloat();
		if(a*a+b*b>c*c){
			System.out.println("銳角三角形");
		}else{
			if(a*a+b*b==c*c){
				System.out.println("直角三角形");
			}else{
				if(a*a+b*b<c*c){
					System.out.println("鈍角三角形");
				}
			}
		}
	}

}
