import java.util.Scanner;
public class Bai19{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int gio = a.nextInt();
		int phut = a.nextInt();
		int giay = a .nextInt();
		System.out.println((gio*60+phut)*60+giay);
		//return 0;
	}
}