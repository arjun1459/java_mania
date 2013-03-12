/*to demonstrate type casting in java */
class Typecast
{
	public static void main(String arg[])
	{
	 byte b;
	 int i=257;
	 double d =23.123;
	 b=(byte)i;
	 i=(int)d;
	 b=(byte)d;    
	 System.out.println( b+ " " + i+" " + d);
	}
}
