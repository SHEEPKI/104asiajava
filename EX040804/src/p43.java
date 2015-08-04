import java.util.Scanner;
public class p43 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入身高:");
		int a=scn.nextInt();
		System.out.print("請輸入體重:");
		float b=scn.nextFloat();
		if(a>=165&&b<=45){
			System.out.println("可以");
		}else{
			System.out.println("不行");
			
		}

	}

}
