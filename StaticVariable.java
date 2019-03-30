package Variables;

public class StaticVariable {
	static int a=10;
	
	public static void main(String[] args) {
		StaticVariable obj= new StaticVariable();
		StaticVariable obj1= new StaticVariable();
		System.out.println(a);    //10
		System.out.println(obj.a);  //10
		System.out.println(obj1.a);  //10
		
		a=20;
		System.out.println(a);   //20
		System.out.println(obj.a);  //20
		System.out.println(obj1.a);  //20
		
   
	}

}
