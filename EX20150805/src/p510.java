import java.util.Scanner;
public class p510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�ʧO:");
		String a=scn.next();
		System.out.print("�п�J����:");
		float b=scn.nextFloat();
		float c=(float)((b-170)*0.6+62);
		float d=(float)((b-158)*0.5+52);
        if(a.equals("�k")){
        	System.out.println("�k�ͼз��魫��"+c);
        }else{
        	if(a.equals("�k")){
        		System.out.println("�k�ͼз��魫��"+d);
        	}
        }
	}

}
