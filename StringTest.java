class StringTest 
{
	public static void main(String[] args) 
	{
		String s=new String("Computer");
		if(s=="Computer")
			System.out.println("equals A");
		if(s.equals("Computer"))
			System.out.println("equals B");


		String s1=new String("phenobarbital");
		String s2=s1.substring(3,5);
		System.out.println(s2);

		int x=3,y=5;
		if(x==y)
		System.out.println("equals A");
		else
			System.out.println("not equals");


			System.out.println(" "+2+3);
			System.out.println(2+3);
			System.out.println(2+3+"");
			System.out.println(2+""+3);
		
		}
}
