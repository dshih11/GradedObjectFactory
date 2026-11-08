public class Tacos {

    //todo:put instance variables at top of class
    // - create constructor that assigns default values to each variable
    //todo:create 3 methods
    // - 1 that prints the variables out as a coherent sentence
    // - 2 that change one of the attributes in some way

    //instance variables
    public int howMany;
    public boolean hasFilling;
    public String fillingType;

    //constructor
    public Tacos(int phowMany, boolean phasFilling, String pfillingType) {
        howMany = phowMany;
        hasFilling = phasFilling;
        fillingType = pfillingType;
    }//end of constructor

    //method 1: printing them in coherent sentence
    public void printInfo(){
        System.out.println("this is a " + fillingType + " taco");
        System.out.println("it is " + hasFilling + " that the tacos have filling");
        System.out.println("each order comes with " + howMany + " tacos");
    }//end of method

    //method 2: changing number of tacos
    public void addTaco(){
        howMany++;
    }//end of method

    //method 3: changing filling type
    public void changeFilling(String newFillingType) {
        fillingType = newFillingType;
    }//end of method
}
