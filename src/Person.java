
public class Person 
{
	public Person()
	{
		System.out.println("Parametresiz yapýlandýrýcý");
	}
	
	public Person(String name)
	{
		System.out.println("Your name is" +name);
	}
	
	public Person(int age)
	{
		System.out.println("Your Age is " + age);
		
	}
	
	
	public void write()
	{
		System.out.println("Ýçerik yazýsý ");
	}
	public void  write(String name)
	{
		System.out.println("dasdasdas " +name );
	}
}
