public class Ford extends Car{
    int year;
    int  manufacturerDiscount;

    public double getPrice(){

        double salePrice = super.getSalePrice();
        return salePrice - manufacturerDiscount;


    }
}
