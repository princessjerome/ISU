public class Beetle extends Bug{
    
    public Beetle(){
        super();
        //adds basic stats of class
        hp+=5;
        armour+=5;
    }
    
    public int tackle(){
        return power;
    }
    
    public int bite(){
        //does dmg equal to power*2
        return power*2;
    }
    
    public void harden(){
        //adds 10 armour to bug
        armour+=10;
    }
    
    public int Finisher() {
        //2/3 chances to hit
        int a =(int)(Math.random()*3)+1;
        if(a>1)
            return armour*power;
        else
            return 0;
    }
    
}
