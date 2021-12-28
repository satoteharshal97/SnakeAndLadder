
public class SnakeAndLadderUC {
    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
	
    public static void main(String[] args) {
        int startPosition = 0;
        int playerPosition = 0;
        int rollDice = (int) Math.floor(Math.random() * 6 + 1);   
        int option = (int) Math.floor(Math.random() * 3 + 1);
 
        switch (option) {
            case NO_PLAY:
                System.out.println("Player is at same position");
                break;
            case LADDER:
                System.out.println("Player's position is increased by: " + rollDice);    
                break;
            case SNAKE:
                System.out.println("Player's position is decreased by: " + rollDice);
                break;
        }            
    }
}