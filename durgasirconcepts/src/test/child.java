package test;

 class child extends parent {
int x=100;
{
	m2();
	System.out.println("child first block");
}
child()
{
	System.out.println("child constructer");
}
public static void main(String[] args) {
	child c =new child();
	System.out.println("child main");
}
public void m2()
{
	System.out.println(y);
}
{
	System.out.println("child second block");
}
int y=200;
}

