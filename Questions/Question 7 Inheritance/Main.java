// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Item i=new Item(12,"TV/HD");

        System.out.println("Item Location: "+i.getLocation());
        System.out.println("Item Description: "+i.getDescription());

        Monster m=new Monster(458,"Sony Phone");
        System.out.println("Item Location: "+m.getLocation());
        System.out.println("Item Description: "+m.getDescription());

        m.setLocation(456);
        System.out.println("Item Location: "+m.getLocation());
    }
}