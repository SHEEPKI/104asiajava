import java.util.Scanner;
public class p53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入a值:");
		float a=scn.nextFloat();
		System.out.print("請輸入b值:");
		float b=scn.nextFloat();
		System.out.print("請輸入c值:");
		float c=scn.nextFloat();
		if(a<=b&&b<=c&&a<=c){
		     System.out.println("是");
		}else{
			System.out.println("否");
		}
	}

}
