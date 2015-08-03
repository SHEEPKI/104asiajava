import java.util.Scanner;
public class p25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("請輸入平方公尺");
		float a=scn.nextFloat();
		System.out.print("請輸入每坪價格");
		float b=scn.nextFloat();
		float c=(float)(a*0.3025*18000);
		System.out.println("阿勳買那塊地花了"+c+"元");
		
	}

}
