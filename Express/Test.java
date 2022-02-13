package Express;
@FunctionalInterface
interface Interf{
	public  void methodone();
}


public class Test {

	public static void main(String[] args) {
		Interf i= ()->System.out.println("hi");
		i.methodone();
		

	}

}
