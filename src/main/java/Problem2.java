public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    The main process is a for loop that goes through the whole array and for each value in the array it checks if it is already in the array before then.
    If it is unique so far, it will increase the running index 'length' and replace the value at length with the value at i (might cause no changes).
    If there is already that value in the array, it will just skip to the next iteration in the for loop.
    The result of this is duplicates will be overwritten, collapsing all the unique values into the front of the array, and the running index is the length of these values within the array.
     */

    public static int remove(int[] nums)
    {
        int length = 0;

        for(int i = 0; i < nums.length; i++)
        {
            boolean noDuplicatesSoFar = true;
            for(int j = 0; j < i; j++)
            {
                if(nums[i] == nums[j])
                    noDuplicatesSoFar = false;
            }

            if(noDuplicatesSoFar)
            {
                nums[length] = nums[i];
                length++;
            }
        }

        return length;
    }
}
