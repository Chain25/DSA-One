package abstracT;

public abstract class Abstract {
	public String name;
	public String id;
	
	Abstract(String name,String id){
		this.name = name;
		this.id = id;
	}
	
	void abstractMethod() {
		System.out.println("abstract hello");
	}
	
	abstract void render();
}
