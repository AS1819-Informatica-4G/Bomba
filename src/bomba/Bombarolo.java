package bomba;

public class Bombarolo {

	public static void main(String[] args) {
		Bomba bomba = new Orologeria(300);
		bomba.innesca();
		while(!bomba.disinnesca());
		
		
	}

}
