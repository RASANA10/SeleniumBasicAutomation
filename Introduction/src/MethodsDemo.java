
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		d.getData();
		String name = d.getData();
		System.out.println(name);
		//access other class method
		MethodsDemo2 d1= new MethodsDemo2();
		d1.getUserData();
		String name1 = getData1();
		System.out.println(name1);
		
		
	}

	public String getData() {
		System.out.println("hello world");
		return "rahul Shetty";
	}
	// we can access the method without creating object using static then its directly accessible withing class level
	//class level access is provided using static method
	public static String getData1() {
		System.out.println("Hii");
		return "rahul Shetty Academy";

	}

}
