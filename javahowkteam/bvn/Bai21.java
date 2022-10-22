import java.util.Scanner;
public class Bai21{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int[] n = new int[b];
		for (int i=0;i<b;i++){
				n[i] = a.nextInt();
		}
		for (int i=0;i<n.length;i++){
			System.out.println(n[i]);
		}
	}
}






