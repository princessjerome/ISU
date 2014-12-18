public class Scorpion extends Bug{
    
    public Scorpion(){
        super();
        //adds basic class stats
        piercing+=5;
        power+=5;
    }
    
    public int claw(){
        return piercing*2;
    }
    
    public int crush(){
        return power*2;
    }
    
    public int sting(){
        //perhaps make this a poison atk?
        return speed*2;
    }
    
    public int Finisher() {
        //1/5 chances to hit
        int a =(int)(Math.random()*5)+1;
        if(a==1)
            return piercing*power;
        else
            return 0;
    }   
    
}
