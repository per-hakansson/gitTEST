import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {3, 5, 2, 1, 7};
        System.out.println(Arrays.toString(sortList(array)));
    }

    public static int[] sortList (int[] arr){

        Arrays.sort(arr);
        return arr;
    }
}