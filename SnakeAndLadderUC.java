
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
			
            diceCount ++;
            int rollDice = (int) Math.floor(Math.random() * 6 + 1);
            int option = (int) Math.floor(Math.random() * 3 + 1);

            switch (option) {
                case NO_PlAY:
                    System.out.println("Player is at same position:");
                    break;
                case LADDER:
                    playerPosition = playerPosition + rollDice;
                    System.out.println("Player has got ladder so its increased by: "+ rollDice);
                    if(playerPosition > 100){
                        playerPosition = playerPosition -rollDice;

                    }
                    break;
                case SNAKE:
                    playerPosition = playerPosition - rollDice;
                    System.out.println("Player has got ladder so its decreased by: "+ rollDice);
                    if(playerPosition < 0){
                        playerPosition = startPosition;
                    }
                    break;
            }
            if(playerPosition == 100){
                System.out.println("Number of times dice was thrown: " + diceCount);
                System.out.println("Final position of player: " + playerPosition);
            }
        }
    }
}