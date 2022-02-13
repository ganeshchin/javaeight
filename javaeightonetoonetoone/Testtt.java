package javaeightonetoonetoone;
interface I{
	public void demo();
	 default void demo2() {
		 System.out.println("hi"); }
	 public static void name() {
		System.out.println("kikikiki");
	}
		
}


class G implements I  {
	@Override
	public void demo() {
		System.out.println("HI");
		
	
}
class D implements I{
@Override
	public void demo() {
	System.out.println("HI");
}
		
//	}
}
class E implements I{
	@Override
	public void demo() {
	System.out.println("HI");
		
}
}
class F implements I{
	@Override
public void demo() {
		System.out.println("HI");
//		I.name();
		
		
	}
	
}
public class Testtt extends F {

	public static void main(String[] args) {
	F f = new F();
	f.demo();
	}

}}
