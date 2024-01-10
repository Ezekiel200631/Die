import java.util.Random;

public class DieN {
    private int sides;
    private Random random;

    public DieN(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }

    public static void main(String[] args) {
        
        DieN sixSidedDie = new DieN(6);

        int result = sixSidedDie.roll();
        System.out.println("The result of rolling a 6-sided die is: " + result);
    }
}

