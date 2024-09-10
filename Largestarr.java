import java.util.*;
public class Largestarr {
    public static int larger(int array[][]){
        int a=3,b=3;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
              if (array[i][j]>large) {
                 large=array[i][j];             
            }
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int a=3,b=3;
        int array[][]=new int[a][b];

        Scanner sc=new Scanner(System.in);

        // input
        System.out.println("Enter the Elements :");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                array[i][j]=sc.nextInt();
            }
        }

        int largest=larger(array);
        System.out.println("The largest element is:"+largest);

        
    }
}