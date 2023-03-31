package javaPrograms;

class Super{
	int b=0;
	void add(int a , int b) {
		
		System.out.println("Super class sum:- "+(a+b));
		
	}
	
}

class Sub extends Super{
	
	void add(int a ,float c) {
		
		System.out.println("Multiplication is:  "+(a+c));
		
	}
	
}



public class MethodOverRiding {

	public static void main(String[] args) {
		
		Sub ob = new Sub();
		ob.add(10,10);
		ob.add(10,10f);
		

	}

}
