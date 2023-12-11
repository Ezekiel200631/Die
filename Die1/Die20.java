public class Die20 {

    private int value;  

    public Die20() { 
        roll();
    }

    public void roll() { 
        value = (int)(Math.random()*20) + 1;
    }    

    public int getValue() { 
        return value; 
    }

    public int rollAndGetValue() { 
        roll(); 
        return getValue();
    }

}   
