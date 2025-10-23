package arrays;

public class RemoveDuplicates_SortedArray {

    public int removeDuplicates(int[] nums){

        if(nums.length == 0) return 0;

        int i=0;
        for(int j=1; j< nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,2,2,2,4,4,4,4,5};
        RemoveDuplicates_SortedArray rd = new RemoveDuplicates_SortedArray();

        int k = rd.removeDuplicates(nums);

        System.out.println("Unique count of the elements: " +k);

        System.out.println("Array after removing duplicates: " );
        for(int x=0; x<k;x++){
            System.out.println(nums[x]+ " ");
        }


    }

}
