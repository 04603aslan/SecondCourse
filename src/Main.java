
public class Main {

	public static void main(String[] args) 
	{
		/*Person lisiler =new Person();
		lisiler.write();
		
		Person kisiler= new Person(18);
		
		Calculation cal=new Calculation();
		int result = cal.sum(2,4);
		
		 
		System.out.println("Result is " +new Calculation().sum(4, 5));// static metod kullanýmý..... 
		*/
		int[]sayi_dizi=new int[3];
		
		int[] sayisal_dizi=new int[7];
		
		int[] a,b,c;
		a=new int[6];
		b=new int[6];
		
		a[0]=55;
		a[5]=43;
		
		
		String[] names= {"ayse","burak","baris"};
		
		System.out.println("Dizi eleman "+ names[2]);
		
		
		for(int i=0;i<sayi_dizi.length;i++)
		{
			System.out.println("sayi_dizi eleman " + sayi_dizi);
			
		}
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		DevelopCalculation develop= new DevelopCalculation();
		System.out.println(develop.sum(32, 2));
		
		develop.sub(5, 65);
		
	}

}
