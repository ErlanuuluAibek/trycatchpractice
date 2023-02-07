import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        san(scanner.nextInt());

    }
    public  static void san(int san)  {
        try {
            int san2=1;
            for (int i = 1; i <=san; i++) {
                san2*=i;
            }
            System.out.println(san2);
        }catch (ArithmeticException a){
            if(san<1){
                System.out.println(a.getMessage());
            }
        }finally {
            System.out.println("финиш");
        }
    }

}