package bomba;

public abstract class Bomba {
	
	public Bomba() {
		
	}
	
	public void esplodi() {
		System.out.println("BOOM!");
	}
	
	public abstract void innesca();
	
	public abstract boolean disinnesca();
	
	
}
