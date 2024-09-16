import java.util.*;
public class maximum {

    public static int  max(ArrayList<Integer>list){
        int greater=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if (greater<list.get(i)) {
            
                greater=list.get(i);
                
            }
        }
        return greater;
    }
public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(7);
    list.add(6);
    list.add(9);

    int great=max(list);
    System.out.println("The greatest element in the array list is:"+great);
   
}
    
}