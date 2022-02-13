package javaeightonetoonetoone;
class A{
	int a=111;
}
public class Test {

	public static void main(String[] args) {
		A obj1= new A();
		System.out.println(obj1.a);
		A obj2=new A(){
		};
		System.out.println(obj1);
		System.out.println(obj2);

	}

}
