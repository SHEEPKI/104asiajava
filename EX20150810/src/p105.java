import java.util.Scanner;
public class p105 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        double n=20000;
        int k=1;
        while(n<1100000){
        	n+=n*0.15;
            k++;
            System.out.println(k+"�Ӥp�ɫ�U���B�q"+n);
        }
        System.out.println(k);
    }
 
}