package feb1st;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1 =new Person();
		/*
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		*/
		p1.name="Sivamani";
		p1.age=24;
		p1.phone=9848022338L;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		p1.greet();
		Person.bye(p1.name);
		
		Person p2=new Person();
		
		p2.name="DJ Tillu";
		p2.age=26;
		p2.phone=9969333222L;
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.phone);
		p2.greet();
		Person.bye(p2.name);
				
		

	}

}
