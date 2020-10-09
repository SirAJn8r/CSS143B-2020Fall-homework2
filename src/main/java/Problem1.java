public class Problem1
{
    /*
    Describe your algorithm here in up to 5 sentences:
    It loops through the entire loop once, when encountering a 2 it does nothing but increment i, which is used to deduce the number of 2's without a running counter.
    When encountering a 1, it changes the theoretical beginning of the 2 section to a 1, if there is no 2's it will change itself (the current i).
        If there is a 2, then it will change the current value (at i) to be a 2, so that the number of 2's is preserved.
    When encountering a 0, it will basically do what 1 did in relation to 2's but twice, one for each.
    */

    public static void colorSort(int[] nums)
    {
        int num0 = 0;
        int num1 = 0;
        //Note: num2 is represented by (i-num0-num1), basically using deduction to find the number of 2's instead of another variable

        for(int i = 0; i < nums.length; i++)
        {
            switch(nums[i])
            {
                case 0:
                    nums[num0] = 0;
                    if(num1 > 0) nums[num0 + num1] = 1;
                    if( (i-num0-num1) > 0) nums[i] = 2;
                    num0++;
                    break;
                case 1:
                    nums[num0 + num1] = 1;
                    if( (i-num0-num1) > 0) nums[i] = 2;
                    num1++;
                    break;
            }
        }
    }
}
