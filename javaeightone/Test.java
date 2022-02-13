package javaeightone;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		String[] s= {"nag","chiru","baaalu","juniot"};
		
		Predicate<String> p= s2->s2.length()%2==0;
		
		for(String s1:s) {
			if(p.test(s1)) {
				System.out.println(s1);
			}
		}
	}

}
