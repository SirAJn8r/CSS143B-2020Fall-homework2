public class Problem1
{
    /*
    Describe your algorithm here in up to 5 sentences:
    It loops through the entire loop once, and every time it encounters a 0, it puts that at the front
    then scoots over most of everything else up to that point.
     */

    public static void colorSort(int[] nums)
    {
        int num0 = 0;
        int num1 = 0;

        for(int i = 0; i < nums.length; i++)
        {
            switch(nums[i])
            {
                case 0:
                    for(int j = i; j > num0; j--)
                    {
                        nums[j] = nums[j-1];
                    }
                    nums[num0] = 0;
                    num0++;
                    break;
                case 1:
                    for(int j = i; j > num0 + num1; j--)
                    {
                        nums[j] = nums[j-1];
                    }
                    nums[num0 + num1] = 1;
                    num1++;
                    break;
                //Since 2's will go to the end, I don't need to catch them in the switch
            }
        }
    }
}
