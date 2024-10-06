import java.util.*;
public class Main {
//    public static LinkedList<String> fullJustify(String[] words, int maxWidth){
//
//        int temp = maxWidth;
//        LinkedList<String> result = new LinkedList<>();
//        LinkedList<String> finalResult = new LinkedList<>();
//        String addWord = "";
//
//        for(int i=0 ;i < words.length ; i++) {
//
//            String word = words[i] + " ";
//            int wordLength = word.length();
//            if(wordLength <= maxWidth) {
//
//                if((addWord.length() + word.length()) <= maxWidth) {
//                    addWord += word;
//                }
//                else {
//                    result.add(addWord);
//                    addWord = words[i] + " ";
//                    maxWidth = temp;
//                }
//            }
//            else {
//                result.add(addWord);
//                addWord = words[i] ;
//                maxWidth = temp;
//            }
//        }
//        result.add(addWord);
//
//
//        for(int i=0 ; i< result.size() ; i++) {
//            String word = result.get(i);
//            System.out.println(word.length());
//
//
//            if(i==0) {
//                for(int j=0 ; j<word.length() ; j++){
//                    if(word.charAt(j)==' ') {
//                        if(word.length() <maxWidth)
//                        {
//
//                        }
//                    }
//
//                }
//            }
//
//        }
//
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String[] list ={"This", "is", "an", "example", "of", "text", "justification."};
//        System.out.println(fullJustify(list, 16));
//    }

    public static int rob(int[] nums) {

        int sum = 0;
        int sum1 = 0;
        if(nums.length>2){
            for(int i=0; i<nums.length; i+=2){
                sum = sum + nums[i];
            }

            for(int j=1 ; j<nums.length ; j+=2){
                sum1 += nums[j];
            }
        } else if (nums.length<=2) {
            if(nums.length<2)
            {
                sum = sum+nums[0];
            }
            else {
                if(nums[0] > nums[1])
                {
                    sum = sum+nums[0];
                }
                else {
                    sum = sum+nums[1];
                }
            }
        }

        if(sum1>sum)
        {
            return sum1;
        }
        return  sum;
    }

    public  static  void main(String[] args){
        int[] nums ={2,7,9,3,1};
        System.out.println(rob(nums));
    }
}

