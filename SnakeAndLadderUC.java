public class SnakeAndLadderUC {
	
    public static void main(String[] args) {
        int startPosition = 0;
	int rollDice = (int) Math.floor(Math.random() * 6 + 1);
        System.out.println("Player is at initial position: " + startPosition);
	System.out.println("After rolling dice we get : " + rollDice);	
    }
}