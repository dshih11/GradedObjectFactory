public class Factory {
    //todo: make PSVM method that calls constructor to make one instance of Factory class
    // - within Factory constructor, make at least 3 different objects/orders
    // - and call each of your methods at least once
    //variables
    public boolean isOpen = true;
    public int yearFounded = 2026;
    public String owner = "David";

    //instance variables
    public int randomNumber;
    public Tacos tacoOrder1;
    public Tacos tacoOrder2;
    public Tacos tacoOrder3;

    //PSVM method
    public static void main(String[] args) {
        Factory a = new Factory();
    }

    //constructor
    public Factory() {
        randomNumber = (int) (Math.random()* 100);
        System.out.println("Welcome to " + owner + "'s factory" );
        System.out.println("the factory was founded in");
        System.out.println(yearFounded);
        System.out.println("it is " + isOpen + " that the factory is open");

        //using method 1 only:
        tacoOrder1 = new Tacos (randomNumber, true, "chicken");
        tacoOrder1.printInfo();
        //end of tacoOrder1

        //using methods 1 & 2:
        tacoOrder2 = new Tacos(3, true, "chicken");
        tacoOrder2.addTaco();
        tacoOrder2.printInfo();
        //end of tacoOrder2

        //using methods 1 & 3:
        tacoOrder3 = new Tacos(randomNumber, true, "chicken");
        tacoOrder3.changeFilling("steak");
        tacoOrder3.printInfo();
        //end of tacoOrder3
    }//end of Constructor

}
