package Assignment1;
class A
{
	B b;
	C b()
	{
		return new C();
	}
}
class B
{
	int c;
	public int a;
}
class C
{
	B b;
	A b()
	{
		return new A();
	}
}
public class Assgnment1 {
	public static void main(String[] args) {
A a = null;
C c = null;
a.b.c=c.b.a;
}
}
