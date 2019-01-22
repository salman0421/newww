package test1;

public class test {
	{
		System.out.println("FIB");
	}
	static 
	{
		System.out.println("FSB");
	}
	test()
	{
		System.out.println("constructer");
	}
	public static void main(String[] args) {
		test t1= new test();
		System.out.println("main");
		test t2=new test();
	}
	static
	{
		System.out.println("SSB");
	}
	{
		System.out.println("SIB");
	}
	
}
