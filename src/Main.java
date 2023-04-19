import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(10));
        System.out.println(factorial(12));
        System.out.println(SumOfNumbers(3));
        RecursiveCountdown(10);
    }

    public static void RecursiveCountdown(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            System.out.println(n);
            RecursiveCountdown(n-1);
        }

    }
    public static int SumOfNumbers(int n){
        if(n==0){
            return 0;
        }
        return n + SumOfNumbers(n-1);
    }

    public static int SumOfNumbers2(int n){
        if(n != 0){
            return n + SumOfNumbers2(n-1);
        }
        else{
            return n;
        }
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int sumArray(int[] arrayIn, int n){
        if(n == 0){
            return 0;
        }
        else{
            return arrayIn[n-1] + sumArray(arrayIn, n-1);
        }
    }

    public static int sumArray2(int[] arr){
        if(arr.length == 1){
            return arr[arr.length-1];
        }
        int[] temp = Arrays.copyOf(arr, arr.length-1);
        return arr[arr.length - 1] + sumArray2(temp);
    }

}