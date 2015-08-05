import java.util.Scanner;
public class p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入傾角:");
		int a=scn.nextInt();
		System.out.println("請輸入軸距:");
		int b=scn.nextInt();
		System.out.println("請輸入輪胎尺寸:");
		int c=scn.nextInt();
		if(a>43&&b>=130&&c==12){
			System.out.println("是");
		}else{
			System.out.println("不是");
		}

	}

}
