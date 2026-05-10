import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RotateArrays {

    public static boolean sameElements(Object[] pArr1, Object[] pArr2){

        Set<Object> uniqueSet1 = new HashSet<>(Arrays.asList(pArr1)); //set holds unique value
        Set<Object> uniqueSet2 = new HashSet<>(Arrays.asList(pArr2));

        // if size is different, means there will be a mismatch
        if (uniqueSet1.size() != uniqueSet2.size()) return false;

        // 1 2 3
        // 4 5 6

        for (Object obj : uniqueSet1) {

            if (!uniqueSet2.contains(obj))
            {
                return false; //they are same arrays
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {1,2,3,4};
        Integer[] arr3 = {8,6,5,7};

        System.out.println(sameElements(arr1,arr2));
        System.out.println(sameElements(arr1,arr3));


        int [] nums = {5,6,3,4,99,7,9,11,67,8};
        int rotate = 4;


      // 11,67,8,9,5,6,3,4,5,7,9
      //leftRotateElements(nums,rotate);
     // 0 - 7

        rightRotateElementsWithReverse(nums,rotate);




    } //main


    // Approach 1 - copying into temp array.
    public static void leftRotateElements(int[] nums, int rotate){

        if(nums.length < rotate){
            rotate = rotate % nums.length;
        }

        System.out.println(rotate);

        int[] result = new int[nums.length];
        int copyChunk = nums.length - rotate;

        for (int i = 0; i < copyChunk ; i++) {

            result[i] = nums[ rotate + i ];
            // 0 - 6 , 1 - 5, 2 - 4, 3 - 3, 4 - 2, 5 - 1, 6 - 0

        }

        int p=0;
        for (int j = copyChunk; j < nums.length ; j++) {

            result[j] = nums[p];
            p++;
        }

        System.arraycopy(result,0,nums,0,nums.length); //faster.

        //nums = Arrays.copyOf(result,result.length); // internally user arraycopy().

        /*The difference is that Arrays.copyOf does not only copy elements, it also creates a new array.
          System.arraycopy copies into an existing array.*/

        System.out.println(Arrays.toString(nums));


    }

    //Approach 2 - reverse technique.
    public static void rightRotateElementsWithReverse(int[] nums, int rotate){

        int size = nums.length;

        if(size < rotate){
            rotate = rotate % size;
        }

        System.out.println(rotate);

        // 5 6 7 1 3 4 5

        int firstPart =  size-rotate;

        reverse(nums,0, firstPart -1 );
        reverse(nums,firstPart , size -1);
        reverse(nums,0,size -1);

        System.out.println(Arrays.toString(nums));


    }

    public static void reverse(int [] nums,int start, int end){

        int temp;

        if(nums == null || nums.length == 1)
            return;

        while (start < end){

            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;
            start++;
            end--;
        }

    }



}
