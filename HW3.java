import java.util.ArrayList;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Integer> m=new ArrayList<>();
        Random ran=new Random();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);
       int ri;
       while (!m.isEmpty()){
           ri=ran.nextInt(m.size());
           System.out.println(m);
           m.remove(ri);
       }

    }
}
