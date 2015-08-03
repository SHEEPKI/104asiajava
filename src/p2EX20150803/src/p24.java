import java.util.Scanner;
public class p24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("請輸入圓的半徑");
		float a=scn.nextFloat();
		float b=(float)(a*a*3.14);
		System.out.println("面積為"+b);

	}

}
