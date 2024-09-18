import java.util.ArrayList;
import java.util.*;
public class sort {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter:");
        int n=sc.nextInt();

        System.out.println("Enter the " + n +" Elements:");
       for(int i=0;i<n;i++){
          int number=sc.nextInt();
          list.add(number);
       }


       System.out.println("The numbers you entered are:");
       System.out.println(list);
       sc.close();

    }
}