
public class CoreJavaBrushUP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s5= "hello";
		
		String s2= new String ("Welcome");
		String s3 = new String ("Welcome");
		String s="Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(s);
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i=0; i<s.length(); i++){
			System.out.println(s.charAt(i));
		}
		// to reverse order
		System.out.println("*****reverse order******");
		for(int i=s.length()-1; i>=0; i--){
			System.out.println(s.charAt(i));
		}

	}

}
