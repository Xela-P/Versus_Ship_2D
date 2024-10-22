package src;

import java.util.Random;
import java.util.Scanner;

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
		grille.updateGrid(player.getX(), player.getY(), ennemi.getX(), ennemi.getY());
Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Votre position: (" + player.getX() + ", " + player.getY() + ")");
            System.out.println("Position ennemi: (" + ennemi.getX() + ", " + ennemi.getY() + ")");
            grille.displayGrid(); 

            System.out.println("faites bouger votre personnage (w: haut, s: bas, a: gauche, d: droit): ");
            String input = scanner.nextLine();
			String lastMover = "";
            switch (input.toLowerCase()) {
                case "w": 
                    player.move(player.getX(), player.getY() - 1, grille);
					lastMover = "Player";
                    break;
                case "s": 
                    player.move(player.getX(), player.getY() + 1, grille);
					lastMover = "Player";
                    break;
                case "a": 
                    player.move(player.getX() - 1, player.getY(), grille);
					lastMover = "Player";
                    break;
                case "d": 
                    player.move(player.getX() + 1, player.getY(), grille);
					lastMover = "Player";
                    break;
                default:
                    System.out.println("Invalid input! Utilisez w, a, s, d.");
                    continue; 
            }

            deplacement.updatePositions();
			lastMover = "Ennemi";

            if (player.getX() == ennemi.getX() && player.getY() == ennemi.getY()) {
				String message = lastMover == "Ennemi" ? "Vous avez perdu" : "Vous avez gagné";
                System.out.println(message);
                break;
            }

            System.out.println("********** next game **********\n");
        }

        scanner.close();
	}

}
