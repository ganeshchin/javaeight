package javaeightonetoonetoone;
interface K
{
	default void m1() {
		System.out.println("m1");
	}
	
}
interface J{
	default void m1() {
		System.out.println("m2");
	}
}
public class Testtttt implements K{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
