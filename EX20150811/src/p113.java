import java.util.Scanner;
import java.util.Random;

public class p113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[10];

		int i = 0;
		int j = 0;
		for (i = 0; i < 10; i++) {
			data[i] = rnd.nextInt(100);
			System.out.print(data[i]+" ");
			for (j = i + 1; j < 10; j++) {
				if (data[i] > data[j]) {
					int v1 = data[i];
					data[i] = data[j];
					data[j] = v1;
				}
			}
		}

	}

}
