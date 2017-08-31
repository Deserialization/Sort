package cn.it.sort;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ShowPro {
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {	
/*		System.out.println();
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));*/
	int i = 0;
	
	for (; true; ) {
		for (; i < 10; i++) {
			System.out.println("i = "+ i);
			
			if (i == 2) {
				System.out.println("continue");
				continue;
			}
			if (i == 3) {
				System.out.println("break");
				i++;
				break;
			}
			if (i == 7) {
				System.out.println("continue outer");
				i++;				
			}
			if (i == 8) {
				System.out.println("break outer");				
			}
			for (int k = 0; k < 5; k++) {
				if (k == 3) {
					System.out.println("continue inner111");
				}
			}
		}
	}
			
	}

}
