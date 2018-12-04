
package bomba;

import java.util.Scanner;

public class Tnt extends Bomba {
Scanner sc = new Scanner (System.in);

	@Override
	public void innesca() {
		System.out.println("Dammi l'accendino o un fiammifero");

	}

	@Override
	public boolean disinnesca() {
		System.out.println("Sei Wile coyote?");
		if (sc.nextLine().equalsIgnoreCase("si")) {
			return false;
		}
		return true;
	}

}
