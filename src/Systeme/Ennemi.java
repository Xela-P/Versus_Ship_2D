package Systeme;
public class Ennemi {
    private int x;
    private int y;

    public Ennemi(Grille grille) {
        this.x = grille.getNbCol() / 2 + (int)(Math.random() * (grille.getNbCol() / 2)); // Random X in the second half of columns
        this.y = grille.getNbLig() / 2 + (int)(Math.random() * (grille.getNbLig() / 2)); // Random Y in the second half of rows
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void move(int newX, int newY, Grille grille) {
        if (newX >= grille.getNbCol() / 2 && newX < grille.getNbCol() && newY >= grille.getNbLig() / 2 && newY < grille.getNbLig()) {
            this.x = newX;
            this.y = newY;
        }
    }
    public void moveTowards(Player player) {
        if (x < player.getX()) {
            x++; 
        } else if (x > player.getX()) {
            x--; 
        }

        if (y < player.getY()) {
            y++; 
        } else if (y > player.getY()) {
            y--; 
        }
    }
}