import java.unil.Scanner;
public class DuTuoiDangKi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int age=18;
		if (age>18){
			System.out.println("Bạn đủ tuổi đăng kí");
		}
		else{
			System.out.println("Bạn chưa đủ tuổi để đăng kí");
		}
		
	}
}