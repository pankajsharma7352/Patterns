public class Pattern8 {
    public static void main(String[] args) {
        int num =5;
        for(int i=5; i>=1; i--){
            for(int j=5; j>=i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
