package javaeightone;

import java.util.function.Predicate;

public class Testtt {

	public static void main(String[] args) {
		Predicate<Integer> p= i->i>10;
		System.out.println(p.test(60));
		System.out.println(p.test(90));
	}

}
