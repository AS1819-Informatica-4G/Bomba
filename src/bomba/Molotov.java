package bomba;

public class Molotov extends Bomba {

	@Override
	public void innesca() {
		System.out.println("Dammi l'accendino");
	}

	@Override
	public boolean disinnesca() {
		System.out.println("Ti sei bruciato :(");
		return false;
	}

}
