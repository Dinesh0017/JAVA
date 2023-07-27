public class GreenLight extends Thread{
    public void run(){
        while(true){
            try{
                System.out.println("Green Light");
                Thread.sleep(10000);

        }
        catch(InterruptedException e){
            System.out.println(e);
            }
        }
    }
}
