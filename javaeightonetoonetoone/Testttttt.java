package javaeightonetoonetoone;
@FunctionalInterface
interface IO{
	void demo(int x,int y);
//	void demo2(int x,int y);
}
@FunctionalInterface
interface Kia extends IO{
	void demo(int x,int y);
}
public class Testttttt {

	public static void main(String[] args) {
		IO i= (x,y)->{System.out.println("hi");
		System.out.println("ioooo");
		System.out.println("jiop");
		System.out.println("mobiel");
		System.out.println("ji");};
			
i.demo(5,9);
	}

}
