public class pairs {
    public static void pairsarr(int numbers[]){
        int ps=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                ps++;
            }
            System.out.println();
        }
        System.out.println("Total pairs:"+ps);
    }
public static void main(String[] args) {
    int numbers[]={1,2,3,4,5};
    pairsarr(numbers);
}
    
}