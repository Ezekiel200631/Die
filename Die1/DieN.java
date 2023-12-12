public class DieN {

    private int value;  

    public DieN() { 
        roll();
    }

    public void roll() { 
        value = (int)(Math.random()*6) + 1;
    }    

    public int getValue() { 
        return value; 
    }

    public int rollAndGetValue() { 
        roll(); 
        return getValue();
    }

}   
