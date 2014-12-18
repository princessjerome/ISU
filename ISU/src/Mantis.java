public class Mantis extends Bug{
    
    public Mantis(){
        super();
        //adds basic class stats
        speed+=5;
        power+=5;
    }
    
    public int bite(){
        return power*2;
    }
    
    public int flyingStrike(){
        return power*3;
    }
    
    public int slash(){
        return power*3;
    }
    
    public int Finisher() {
        //does a random amount of dmg, with a base of 20
        return (int)(Math.random()*50)+20;
    }
    
}
