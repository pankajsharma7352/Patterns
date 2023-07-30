public class Pattern10 {
    public static void main(String[] args) {
        int num=5;
        int count= 0;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
