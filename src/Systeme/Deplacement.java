package Systeme;

public class Deplacement {
    private Player player;
    private Ennemi ennemi;
    private Grille grille;

    public Deplacement(Player player, Ennemi ennemi, Grille grille) {
        this.player = player;
        this.ennemi = ennemi;
        this.grille = grille;
    }

    public void updatePositions() {
        player.moveTowards(ennemi);
        ennemi.moveTowards(player);

        if (player.getX() == ennemi.getX() && player.getY() == ennemi.getY()) {
            System.out.println("Collision detected!");
        }
        grille.updateGrid(player.getX(), player.getY(), ennemi.getX(), ennemi.getY());
        grille.displayGrid();
    }
}


