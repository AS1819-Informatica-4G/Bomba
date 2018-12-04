package bomba;

import java.util.Scanner;

public class Orologeria extends Bomba {
	Scanner sc = new Scanner (System.in);
	private int secondi;
	private int filo;
	private boolean innescata = false;
	private int scelta;
	
	public Orologeria(int secondi) {
		super();
		this.secondi = secondi;
	}

	@Override
	public void innesca() {
		innescata = true;
		filo=(int)(Math.random()+1)*4;
		
	}

	@Override
	public boolean disinnesca() {
		if (innescata) {
			System.out.println("Scegli il filo da tagliare da 1 a 5");
			System.out.println("");
			scelta = sc.nextInt();
			if (scelta==filo) {
				
				System.out.println("Bomba disinnescata");
				return true;
				
			}
			else {
				secondi -= secondi/4;
			}
			if (secondi==0) {
				esplodi();
			}
		}
		return false;
	}

}
