public class Factory {
    //variables
    public boolean isOpen = true;
    public int yearFounded = 2026;

    static void main(String[] args) {Factory a = new Factory();}

    public Factory() {
        System.out.println("Welcome to David's factory");
        System.out.println("the factory was founded in");
        System.out.println(yearFounded);
        System.out.println("it is" + isOpen + "that the factory is open");}


}
