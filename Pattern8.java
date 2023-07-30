public class Pattern8 {
    public static void main(String[] args) {
        int num =5;
        for(int i=num; i>=1; i--){
            for(int j=num; j>=i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
