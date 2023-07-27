public class RedLight extends Thread{
    public void run(){
        while(true){
            try{
                System.out.println("Red Light");
                Thread.sleep(5000);

        }
        catch(InterruptedException e){
            System.out.println(e);
            }
        }
    }
}
