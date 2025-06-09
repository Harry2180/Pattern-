public class array_program {
    public static void main(String[] args) {
        int arr[][]= new int[5][5];
        for(int i=0; i<arr[0].length;i++){
             for(int j=0; j<arr.length;j++){
                arr[i][j]=5;
             }
        }
        for(int i=0; i<arr[0].length;i++){
             for(int j=0; j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
             }
             System.out.println();
    }
}
}
