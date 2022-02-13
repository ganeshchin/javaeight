package javaeightonetoonetoone;
interface KLO{
	void demo();
	default void democancelled() {
		System.out.println("cancel the demo");
	}
}
class Shu implements KLO{

	@Override
	public void demo() {
		System.out.println("hi");
	}
	class She implements KLO{

		@Override
		public void demo() {
			System.out.println("hi how  ru");
		}
		class Shr implements KLO{

			@Override
			public void demo() {
				System.out.println("hi am fine");
			}class Sht implements KLO{

				@Override
				public void demo() {
					System.out.println("hi not fine");
				}
				
			class Shio implements KLO{

					@Override
					public void demo() {
						System.out.println("hi ia m bad"
								+ "");
					}
	
}
			
public class Restful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
			


