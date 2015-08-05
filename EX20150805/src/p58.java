import java.util.Scanner;
public class p58{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入成績?");
		float a=scn.nextFloat();
		System.out.print("成績等第是:");
		if(a>=97){
			System.out.println("A+");
		}else{
			if(a>=94){
				System.out.println("A");
			}else{
				if(a>=90){
					System.out.println("A-");
				}else{
					if(a>=87){
						System.out.println("B+");
					}else{
						if(a>=84){
							System.out.println("B");
						}else{
							if(a>=80){
								System.out.println("B-");
							}else{
								if(a>=77){
									System.out.println("C+");
								}else{
									if(a>=74){
										System.out.println("C");
									}else{
										if(a>=70){
											System.out.println("C-");
										}else{
											if(a>=67){
												System.out.println("D+");
											}else{
												if(a>=64){
													System.out.println("D");
												}else{
													if(a>=60){
														System.out.println("D-");
													}else{
														System.out.println("E");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
		}
		

	}

}
