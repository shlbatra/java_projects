public class App {
    public static void main(String[] args) {
        int myInt = 7; // myInt. does not work
        double shoeSize = 9.5;
        char myInitial = 'S';

        String myName = "John"; // Non Primitive Type
        System.out.println(myName.length());

        System.out.println(myInt * shoeSize);
        String name = printName("SAHIL");
        Cat.dingDong(); // call static method directly
        Cat mycat = new Cat();
        mycat.name = "aSaa";
        mycat.age = 6;
        mycat.meow();

    }

    private static String printName(String name) { // method defined
        // System.out.println("My name is " + name);
        return "My name is " + name;
    }

}
