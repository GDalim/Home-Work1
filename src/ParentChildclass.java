
public class ParentChildclass {

	//parent class
	int age = 44;
	String name = "Dalim";
	
	
	
	
	public static void main(String[] args) {
		
		ParentChildclass L = new ParentChildclass ();
		System.out.println(L.age);
		System.out.println(L.age);
		System.out.println(ParentChildclass.name);
		 
		hello H = new hello();
		System.out.println(H.age1);
		System.out.println(H.height3);
		
		
		
	}
	
	public class hello{
	
		//child class
		int age1 =25;
		String name1 = "Hamid";
		static double height3 = 5.11;
		double height2 = 6.0;
		
		
		public static void main(String[] args) {
			
			ParentChildclass N = new ParentChildclass();
			System.out.println(N.age);
			System.out.println(N.name);
			System.out.println(ParentChildclass.name);
			
			
			
		}
		
	}
	
	
	
	
}
