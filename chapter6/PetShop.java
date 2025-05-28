package chapter6;
//create a gorilla class which implements the Animal interface
//add this comment inside approriate methods


public class PetShop{
    public static void main(String[] args) {
    gorilla g = new gorilla();

    System.out.println(g.feed(false));    
    g.groom();
    g.pet();
}
}

interface Animal{
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class gorilla implements Animal{
    @Override
    //put gorilla food into cage
    public boolean feed(boolean timeToEat) {
        //boolean feed = timeToEat;
        return false;
        
    }


    //lather, rinse, repeat
    public void groom(){
        System.out.println("lather, rinse, repeat");
    }
    //pet at your own risk
    public void pet(){
        System.out.println("pet at your own risk");
    }
        
}
