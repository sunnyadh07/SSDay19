import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        System.out.println(Arrays.toString(runningAverage(num)));

    }
    public static double[] runningAverage(int[] arr){
        double[] result = new double[arr.length];
        int sum = 0;
        double k = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            k = i+1;
            result[i] = sum/k;


        }
        return  result;
    }
}
