import java.util.Scanner;
public class p23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("請輸入梯形的上底");
		float a=scn.nextFloat();
		System.out.print("請輸入梯形的下底");
		float b=scn.nextFloat();
		System.out.print("請輸入梯形的高");
		float c=scn.nextFloat();
		float d=a+b*c/2;
		System.out.println("面積為"+d);

	}

}
