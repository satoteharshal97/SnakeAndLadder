public class SnakeAndLadderUC {
    public static final int NO_PlAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int WIN_POSITION = 100;

    public static void main(String[] args) {
        int startPosition = 0;
        int playerPosition = 0;
        int diceCount = 0;
        while(playerPosition < WIN_POSITION) {
            int rollDice = (int) Math.floor(Math.random() * 6 + 1);
            int option = (int) Math.floor(Math.random() * 3 + 1);

            switch (option) {
                case NO_PlAY:
                    break;
                case LADDER:
                    playerPosition = playerPosition + rollDice;
                    if(playerPosition > 100){
                        playerPosition = playerPosition -rollDice;
                    }
                    break;
                case SNAKE:
                    playerPosition = playerPosition - rollDice;
                    if(playerPosition < 0){
                        playerPosition = startPosition;
                    }
                    break;
            }
        }
		 System.out.println("Player has reached Winning Position:" + playerPosition);
    }
}