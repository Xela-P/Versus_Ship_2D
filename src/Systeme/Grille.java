package Systeme;

import java.util.Random;

// feur
public class Grille {
private int nbLig;
private int nbCol;
private char [][] grille;


public Grille(int n , int p) {
	nbLig = n;
	nbCol = p;
	grille = new char[nbLig][nbCol];
        for (int i = 0; i < nbLig; i++) {
            for (int j = 0; j < nbCol; j++) {
                    grille[i][j] = '.';
            }
        }
    }

	public int getNbLig() {
        return nbLig;
    }

    public int getNbCol() {
        return nbCol;
    }

	public void updateGrid(int playerX, int playerY, int ennemiX, int ennemiY) {
        for (int i = 0; i < nbLig; i++) {
            for (int j = 0; j < nbCol; j++) {
                grille[i][j] = '.';
            }
        }
        grille[playerY][playerX] = 'P';
        grille[ennemiY][ennemiX] = 'E';
    }

    public void displayGrid() {
        for (int i = 0; i < nbLig; i++) {
            for (int j = 0; j < nbCol; j++) {
                System.out.print(grille[i][j] + " ");
            }
            System.out.println();
        }
    }

}
