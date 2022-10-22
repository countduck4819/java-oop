package (default package);
public class HelloWorld{
	public static void main(String[] args){
		Person[] a = new Person[2];

		a[0] = new Person();
		a[0].name="Chau";
		a[0].age=21;
		a[0].height=1.7f;
		
		a[1] = new Person();
		a[1].name="K9";
		a[1].age=26;
		a[1].height=1.8f;

		System.out.println(a[0].name);
		System.out.println(a[0].age);
		System.out.println(a[0].height);
		System.out.println(a[1].name);
		System.out.println(a[1].age);
		System.out.println(a[1].height);
	}
}