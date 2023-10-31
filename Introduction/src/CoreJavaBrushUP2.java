import java.util.ArrayList;

public class CoreJavaBrushUP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,4,5,6,7,8,9,10,22};
		for (int i = 0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i] + "is even number");
			}
			else {
				System.out.println(arr2[i] + "is odd number");
			}
		}
		
		ArrayList a= new ArrayList<String>();
		// create object of the class to use all methods and access to methods
		a.add("new");
		a.add("sheet");
		a.add("academy");
		a.add("selenium");
		
		System.out.println(a.get(2));	// to fetching the third index value
		//we can't use here length method because it's growable ,better to use size()
		for (int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}


	}

}
