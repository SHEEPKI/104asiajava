import java.util.Scanner;
public class p52 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入店家:");
		String a=scn.next();
		System.out.println("請輸入飲料內容:");
		String b=scn.next();
		if(a!=("五十嵐")&&b==("綠茶")){
		System.out.println("會買");
		}else{
			if(a!=("五十嵐")&&b==("咖啡")){
				System.out.println("會買");
			}else{
				System.out.println("不會買");
			}
		}
			
		
	}

}
