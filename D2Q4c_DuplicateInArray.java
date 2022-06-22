package akm;

public class D2Q4c_DuplicateInArray {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

        public static void main(String args[]) {
        int arr[] = {1,3,4,2,1};
        D2Q4c_DuplicateInArray inArray=new D2Q4c_DuplicateInArray();
        System.out.println("The duplicate element is " + inArray.findDuplicate(arr));
    }
}
