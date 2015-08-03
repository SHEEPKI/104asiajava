import java.util.Scanner;
public class p21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// TODO Auto-generated method stub
    System.out.println("Hello,請問您是?");
    String name=scn.next();
    System.out.println("Hi,"+name+"您好!");
    System.out.println(name+",很高興認識你,請問您是哪一所高中畢業的?");
    String highschool=scn.next();
    System.out.println(name+"，原來你是"+highschool+"畢業的。");
    System.out.println("你現在在讀哪個系的?");
    String a=scn.next();
    System.out.println("哇~~"+a+"可是熱門科系耶,你實在是太厲害了!:)");
    System.out.println("你畢業後要從事什麼工作?");
    String p=scn.next();
    System.out.println(p+"是個不錯的工作,真是羨慕你!:)");
	}

}
