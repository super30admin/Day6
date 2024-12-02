/*
This code implements the solution using a stack. Whenever an element from the 
given data is pushed on top of the stack, it is checked whether the element 
before it is the same element or not. If it is the same element, we keep 
pushing till we find a different element. If we find a different element, 
we then pop the current top element, and increment the count by 2. Finally 
after the whole data has been traversed, we return the count.

Problems with this code: It does not give right answer for all cases. There is
some issue, as it seems the continue statement at line 62 does not work as
intended.

Did this code run on Leetcode: Yes

*/



#define MAX 100000
class Solution {
    int top;
public:
    int stack[MAX];
    
    Solution()
    {
        top = -1;
    }
    
    void push(int x)
    {
        stack[++top] = x;
    }
 
    void pop()
    {
        stack[top--];
    }
    
    bool isEmpty()
    {
        return (top < 0);
    }
    //Time complexity: O(n)
    //Space Complexity: O(n)
    int findMaxLength(vector<int>& nums) 
    {
        
        int count = 0;
        int maxcount = 0;
        for(int i = 0;i < nums.size(); i++)
        {
            push(nums[i]);
            //To prevent program from checking at i = -1, as that gives an underflow error
            if(i == 0)
                continue;
            //Continue pushing on stack if element added is equal to previous element 
            if(nums[i] == nums[i-1])
                continue;
            //Pop element if we get a different element from previous
            else if(nums[i] != nums[i-1])
            {   
                pop();
                //If the current stack is empty, reset the count and start again from next array location
                if(isEmpty() == true)
                {   //If the current count is the highest count, then we set maximum count before resetting
                    if(maxcount < count)
                        maxcount = count;
                    count = 0;
                    continue;
                }
                count = count + 2;
            }
            if(maxcount < count)
                maxcount = count;
        }
        
        return maxcount;
        
    }
};