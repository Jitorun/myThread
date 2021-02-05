import java.util.Random;

public class main {
    public static void main(String[] args) {
        myThread mt = new myThread();
        mt.start();
        for (int i = 0 ;i<999999998/2;i++){
            System.out.println("新年新对象，年年不一样");
        }
    }
}
