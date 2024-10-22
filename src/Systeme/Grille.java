package Systeme;
// feur
public class Grille {
	private int nbLig;
	private int nbCol;
	private char [][] grille;


	public Grille(int n , int p) {
		nbLig = n;
		nbCol = p;
		grille = new char[nbLig][nbCol];

		for(int i=0; i<nbLig; i++ ) {
			for(int j=0; j<nbCol ; j++) {

				grille[i][j] = '.';

			}
		}

	}
	public void afficher() {
		System.out.println();
		for(int i=0; i<nbLig; i++ ) {
			for(int j=0; j<nbCol ; j++) {

				System.out.print(" | " + grille[i][j]);

			}
			System.out.println(" | "); 
		}
		System.out.println();
	}
	
	public void deplacerH() {
		char tmp;
		for(int i=0; i<nbLig; i++) {
			for(int j=0; j<nbCol; j++) {
				if(grille[i][j] == '.') {
					if(i-1 >= 0) {
						tmp = grille[i][j];
						grille[i][j] = '.';
						
					}
				}
			}
		}
	}
	
	public void deplacerG() {
		char tmp;
		for(int i=0; i<nbLig; i++) {
			for(int j=0; j<nbCol; j++) {
				if(grille[i][j] == '.') {
					if(i-1 >= 0) {
						tmp = grille[i][j];
						grille[i+1][j-1] = '.';
						
					}
				}
			}
		}
	}

	public void deplacerD() {
		char tmp;
		for(int i=0; i<nbLig; i++) {
			for(int j=0; j<nbCol; j++) {
				if(grille[i][j] == '.') {
					if(i-1 >= 0) {
						tmp = grille[i][j];
						grille[i+1][j+1] = '.';
						
					}
				}
			}
		}
	}

}
