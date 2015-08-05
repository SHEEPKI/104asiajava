import java.util.Scanner;
public class p510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入性別:");
		String a=scn.next();
		System.out.print("請輸入身高:");
		float b=scn.nextFloat();
		float c=(float)((b-170)*0.6+62);
		float d=(float)((b-158)*0.5+52);
        if(a.equals("男")){
        	System.out.println("男生標準體重為"+c);
        }else{
        	if(a.equals("女")){
        		System.out.println("女生標準體重為"+d);
        	}
        }
	}

}
