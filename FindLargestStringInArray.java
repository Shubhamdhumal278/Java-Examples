
public class FindLargestStringInArray {
    public static void main(String[] args){
        String[] arr = {"shubham" , "ajay" , "sachin" , "Laxmiputra" , "pratik"};

        String largestWords =  findLargestWord(arr);
        
        System.out.println("Largest Word In String is : "+largestWords);
    }

    public static String findLargestWord(String[] arr){
        //int maxLength = arr[0].length;
        String largestWord = arr[0];

        for(String word : arr){
            if(word.length() > largestWord.length()){
                largestWord = word ;
            }
        }

        return largestWord ;
    }
}

//Output => Largest Word In String is : Laxmiputra