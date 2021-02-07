package abstracT;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract abstract1 = new Abstract("Chain","1") {

			@Override
			void render() {
				// TODO Auto-generated method stub
				System.out.println(name+id);
			}
			
		};
		
		abstract1.render();
	}

}
