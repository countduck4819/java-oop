import java.util.Scanner;
public class Bai23{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i =0 ; i < n ;i++){
			a[i] = sc.nextInt();
		}
		int maxx = -1;
		int svthu = -1;
		for (int i=0;i<n;i++){
			if (a[i]>maxx){
				maxx = a[i];
				svthu=i;
			}
		}
		for (int i=0;i<n-1;i++){
			for (int j=i+1;j<n;j++){
				if (a[i]>a[j]){
					int tt = a[i];
					a[i]=a[j];
					a[j]=tt;
				}
			}
		}
		System.out.println();
		System.out.println(maxx);
		System.out.println();
		System.out.println(svthu+1);
		System.out.println();
		for (float i : a){
			System.out.println(i);
		}
	}
	
}







