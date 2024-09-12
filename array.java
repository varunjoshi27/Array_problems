/**
 * array
 */
public class array {
    public static void printsubarray(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k=i;k<=j;k++){
                  System.out.print(array[k]+" ");
                }
              System.out.println();
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    int array[]={2,4,6,8,10}; 

    printsubarray(array);


}
    
}