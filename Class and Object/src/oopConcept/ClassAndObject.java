package oopConcept;

public class ClassAndObject {

	//Class Vars:
	String name;
	int age;
	byte marks;
	int studentID;
	

	
	
	public static void main(String[] args) {
		
		
//Object of the Class: using new keyword
		
		ClassAndObject obj = new ClassAndObject ();
		
		obj.name = "Archimedes";
		obj.age = 25;
		obj.marks = 40;
		obj.studentID = 80;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.marks);
		System.out.println(obj.studentID);
		
		System.out.println("--------------------");
		
		ClassAndObject obj1 = new ClassAndObject ();
		
		
		obj1.name = "Pythagoras";
		obj1.age = 24;
		obj1.marks = 41;
		obj1.studentID = 82;
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.marks);
		System.out.println(obj1.studentID);
		
		
		
		
	
		
		
	}

}
