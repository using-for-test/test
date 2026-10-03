public class Shorted_check {
    
    public static boolean isShorted(int[] a){
        return isShortedTheArray(a,0);
    }

    public static boolean isShortedTheArray(int[] arr, int idx){
        if (arr.length == 0 || idx >= arr.length-1) {
            return true;
        }


        if (arr[idx] > arr[idx+1]) {
            return  false;            
        }

        return isShortedTheArray(arr, idx+1);

    }

    public static void main(String[] args) {
        int[] a = {12,15,69,78,96};

        System.out.println(isShorted(a));

    }


}
