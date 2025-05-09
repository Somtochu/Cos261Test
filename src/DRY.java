public class DRY {
    private static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        //without DRY
        int sum1 = 3 + 4;
        int sum2 = 5 + 3;

        //with DRY
        int sum3 = sum(3, 4);
        int sum4 = sum(5, 3);
    }
}
