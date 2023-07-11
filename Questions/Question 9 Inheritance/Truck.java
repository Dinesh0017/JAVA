public class Truck extends Car{
     int weight;

    
    public double getSaleprice(){
        if(weight > 2000){
            return regularPrice * 1/10;
        }else{
            return regularPrice * 1/5;
        }
    }
}
