package test;

public class parent {
int i=10;
{
	m1();
	System.out.println("parent block");
}
parent()
{
	System.out.println("parent constructer");
}
public static void main(String[] args) {
	parent p= new parent();
	System.out.println("parent main");
}
public void m1()
{
	System.out.println(j);
}
int j=20;


}
