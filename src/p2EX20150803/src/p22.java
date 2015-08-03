import java.util.Scanner;
public class p22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// TODO Auto-generated method stub
       System.out.print("請輸入三角形的底");
       float s=scn.nextFloat();
       System.out.print("請輸入三角形的高");
       float h=scn.nextFloat();
       float a=s*h/2;
       System.out.println("面積為"+a);
	}

}
