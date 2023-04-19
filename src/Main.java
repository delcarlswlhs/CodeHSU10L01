public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(10));
    }

    public static int SumOfNumbers(int n){
        return 0;
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}