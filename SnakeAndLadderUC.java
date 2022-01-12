
public class SnakeAndLadderUC {
	
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_POSITION = 100;
    public static final int START_POSITION = 0;
    public static int chance = 0;
    public static int playerOnePosition = 0;
    public static int playerTwoPosition = 0;
    public static int playerPosition = 0;

    public static void main(String[] args) {
        switchPlayer();
    }

    public static void switchPlayer(){
	    
        while (playerOnePosition < WINNING_POSITION && playerTwoPosition < WINNING_POSITION) {
            if (chance % 2 == 0) {
                playerPosition = playerOnePosition;
                playGame();
                playerOnePosition = playerPosition;
                if (playerOnePosition == WINNING_POSITION) {
                    System.out.println("Yey!Player One Won");
                    break;
                }
            } else {
                playerPosition = playerTwoPosition;
                playGame();
                playerTwoPosition = playerPosition;
                if (playerTwoPosition == WINNING_POSITION) {
                    System.out.println("Yey! Player Two Won");
                    break;
                }
            }
        }
    }
    public static void playGame(){
        int rollDice = (int) Math.floor(Math.random() * 6 + 1);
        int option = (int) Math.floor(Math.random() * 3);

        switch (option) {
            case NO_PLAY:
                playerPosition = playerPosition;
                System.out.println("Player  is at same position");
                break;
            case LADDER:
                chance++;
                playerPosition = playerPosition + rollDice;
                System.out.println("Player position is increased by : " + rollDice);
                if (playerPosition > 100) {
                    playerPosition = playerPosition - rollDice;
                }
                break;
            case SNAKE:
                playerPosition = playerPosition - rollDice;
                System.out.println("Player  position is decreased by : " + rollDice);
                if (playerPosition < 0) {
                    playerPosition = START_POSITION;
                }
        }
    }
}
