package javaeightonetoonetoone;

@FunctionalInterface
interface Basic {
	public void demo();
	}
public class Testt {

	public static void main(String[] args) {

		
				Basic a=()->System.out.println("hi");
				a.demo();
				System.out.println(a);
				
			}

		
	}


