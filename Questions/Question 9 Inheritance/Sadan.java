public class Sadan extends Car{
    int length;

    public double getSalePrice(){
        if( length > 20 ){
            return regularPrice * 95/100;
        }else{
            return regularPrice * 9/10;
        }
    }
}
