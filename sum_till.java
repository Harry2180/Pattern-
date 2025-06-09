public class sum_till {
    public static void main(String []args){
        int add=0;
        for(int i=0; i<=100; i++){
            add=add + i;
            if(i==50){
                System.out.println();
                continue;
            }
            System.out.println(add);
        }
    }
    
}
