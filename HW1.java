import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
        int[]m=new int []{1,2,3,4,5};
        System.out.println(Arrays.toString(m));

 reverse(m,5);
    }
    public static void reverse(int[]a,int size){
        int[]copy=new int[size];
        for (int i = 0; i < a.length; i++) {
            copy[i]=a[a.length-1-i];

        }
        a=copy;
        System.out.println(Arrays.toString(a));
    }
}
