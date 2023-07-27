// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RedLight rl=new RedLight();
        GreenLight gl=new GreenLight();
        YellowLight yl=new YellowLight();

        rl.start();
        gl.start();
        yl.start();
    }
}