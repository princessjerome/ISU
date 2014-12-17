public abstract class Bug {
    //basic stats
    protected int hp, speed, power, armour, piercing, agility;
    protected String name;
    private static int xp;
    
    //overloaded constructors
    public Bug(){
        name = null;
        hp = 0;
        speed = 0;
        power = 0;
        armour = 0;
        piercing = 0;
        agility = 0;
    }
    
    public Bug(String x){
        name = x;
        //idk about these stats
        hp = (int)(Math.random()*5) + 3;
        speed = (int)(Math.random()*5) + 3;
        power = (int)(Math.random()*5) + 3;
        armour = (int)(Math.random()*5) + 3;
        piercing = (int)(Math.random()*5) + 3;
        agility = (int)(Math.random()*5) + 3;
    }

    
    //perhaps add this into one full get stats page?
    public final int getHP(){
        return hp;
    }
    
    public final String getName(){
        return name;
    }
    
    //item effects 
    //perhaps make into own abstract class?
    public final void Steroids(){
        power+=5;
    }
    
    public final void Iron(){
        armour+=5;
    }
    
    public final void Caffeine(){
        speed+=5;
    }
    
    public final void Whetstone(){
        piercing+=5;
    }
    
    
    /*
    public final String steroidRules(){
        lblinfo.setText("Steroids adds 5 power to your bug!");
    }
    
    public final String ironRules(){
        lblinfo.setText("Iron adds 5 armour to your bug!");
    }
    
    public final String caffeineRules(){
        lblinfo.setText("Caffeine adds 5 speed to your bug!");
    }
    
    public final String whetstoneRules(){
        lblinfo.setText("Whetstone adds 5 piercing to your bug!");
    }    
    */
    
    //abstract methods
    abstract public void Finisher();
    abstract public void skitter();
}
