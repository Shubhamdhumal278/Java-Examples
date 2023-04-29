
public class FindLargestNumberInArray {
    public static void main(String[] args){
        int[] arr = {22 , 11 , 33 , 88 , 77 , 44 , 66};

        int res  = findMax(arr);

        System.out.println("largest number is array : " + res );
    }

    public static int findMax(int[] arr){
        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max ;
    }
}

//Output => largest number is array : 88