import java.util.Scanner;
public class Bai24{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int diemnhap = sc.nextInt();
		int[] a = new int[n];
		for (int i =0 ; i < n ;i++){
			a[i] = sc.nextInt();
		}
		int soluong =0;
		System.out.println(diemnhap);
		for (int i =0 ;i<n;i++){
			if (diemnhap == a[i]){
				System.out.println("Sinh vien thu : "+(i+1));
				soluong+=1;
			}
		}
		if (soluong ==0){
			System.out.println("Khong co diem day trong danh sach");
		}
	}
}