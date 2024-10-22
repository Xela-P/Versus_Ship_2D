package Systeme;

public class Player {
    private int x;
    private int y;

    public Player(Grille grille) {
        this.x = (int)(Math.random() * (grille.getNbCol() / 2)); // Random X within the first half of columns
        this.y = (int)(Math.random() * (grille.getNbLig() / 2)); // Random Y within the first half of rows
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void moveTowards(Ennemi ennemi) {
        if (x < ennemi.getX()) {
            x++;
        } else if (x > ennemi.getX()) {
            x--;
        }

        if (y < ennemi.getY()) {
            y++;
        } else if (y > ennemi.getY()) {
            y--;
        }
    }
    public void move(int newX, int newY, Grille grille) {
        if (newX >= 0 && newX < grille.getNbCol() / 2 && newY >= 0 && newY < grille.getNbLig() / 2) {
            this.x = newX;
            this.y = newY;
        } else {
            System.out.println("Move out of bounds! Try a different direction.");
        }
    }
}
