// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                Sadan s = new Sadan();
                s.speed=150;
                s.regularPrice=30000.00;
                s.color="Yellow";
                s.length=18;

                Ford f = new Ford();
                f.speed=120;
                f.regularPrice=35000.00;
                f.color="Red";
                f.year=2019;
                f.manufacturerDiscount=5000;

                Ford f2 = new Ford();
                f2.speed=100;
                f2.regularPrice=32000.00;
                f2.color="Blue";
                f2.year=2020;
                f2.manufacturerDiscount=4500;

                Car c = new Car();
                c.speed=85;
                c.regularPrice=20000.00;
                c.color="Black";

                System.out.println("Sale price of Sedan "+s.getSalePrice());
                System.out.println("Sale price of Ford "+f.getSalePrice());
                System.out.println("Sale price of Ford2 "+s.getSalePrice());
                System.out.println("Sale price of Car "+f.getSalePrice());
            }


}