public class TwoSumSimple {
    public static boolean hasPairWithSum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if( arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        System.out.println(hasPairWithSum(arr, target));

        int[] arr2 = {1, -2, 1, 0, 5};
        int target2 = 0;
        System.out.println(hasPairWithSum(arr2, target2));
    }
}