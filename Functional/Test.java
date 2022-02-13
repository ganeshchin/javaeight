package Functional;
interface I{
	public abstract void m1();
}
class A implements I{
	public void m1() {
		System.out.println("hi");
	}
}
public class Test {

	public static void main(String[] args) {
		A a=new A();
		a.m1();
		
	}

}
