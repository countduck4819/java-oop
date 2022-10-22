import java.util.Scanner;
public class Bai22{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] a = new float[n];
		for (int i =0 ; i < n ;i++){
			a[i] = sc.nextFloat();
		}
		int tong = 0 ;
		for (float i : a){
			tong+=i;
			System.out.println(i);
		}
		System.out.println(tong);
	}
	
}





