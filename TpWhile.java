package m2i;

import javax.swing.JOptionPane;

public class TpWhile {

	public static void main(String[] args) {

		int nb = (int) (Math.random() * 10 + 1);
		System.out.println(nb);
		int nbSaisie;
		int nbChance = 10;
		
		do {
			nbSaisie = Integer.parseInt(JOptionPane.showInputDialog("Votre nombre"));
			System.out.println("le nombre saisit est : " + nbSaisie);
			if (nbSaisie < nb) {
				System.out.println("nombre trop petit "+ "chance restantes " +nbChance);
				nbChance--;
			}else if (nbSaisie > nb) {
				System.out.println("nombre trop grand "+ "chance restantes " + nbChance);
				nbChance--;
			}else {
				System.out.println("vous avez trouvez le bon nombre " +"chance restantes " + nbChance);
			}
		} while (nbSaisie != nb && nbChance!=0);
		 
		
		

	}

}
