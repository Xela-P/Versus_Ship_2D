package src;

import java.util.Random;

import Systeme.Deplacement;
import Systeme.Ennemi;
import Systeme.Grille;
import Systeme.Player;

public class main {

	public static void main(String[] args) {
        Grille grille = new Grille(20, 20);
        Player player = new Player(grille);
        Ennemi ennemi = new Ennemi(grille);
        Deplacement deplacement = new Deplacement(player, ennemi, grille);

        for (int i = 0; i < 20; i++) {
            deplacement.updatePositions();
            try {
                Thread.sleep(2000);
				System.out.println("********** next game ********");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}

}
