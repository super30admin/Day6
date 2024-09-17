/* Problem Statement: 
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:

Input: [0,1]

Output: 2

Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

Example 2:

Input: [0,1,0]

Output: 2

Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

 *
 * Time Complexity : O(n) 
 * Space Complexity : O(k) where k is size of hash table 
 */

/* PART 1 : Helper functions to implement a C hash table with 
 *  collision handling in form of linked list
 *
 * TODO: Write function for freeing hash table 
 */
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
 
#define HT_SIZE 50000 //hash_array table

struct hash_array
{
    int key;
    int value;
    struct hash_array* next;
}hash_array[HT_SIZE];

/* Add entry in hash table. If entry exists, set it to that value
 *
 */
void add_entry_hash_table(int num, int value)   
{
    int temp = abs(num % HT_SIZE);

    if(hash_array[temp].key==0) {
        hash_array[temp].key= num;
        hash_array[temp].value = value;

    }else if(hash_array[temp].key==num) {
        hash_array[temp].value = value;
    }else {

        struct hash_array *p = &hash_array[temp];

        while(p->key!=num&&p->next!=NULL) {
        	p=p->next;
        }

        if(p->key==num){
        	p->value = value;
        }
        else
        {
            p->next=(struct hash_array*)malloc(sizeof(struct hash_array));
            p = p->next;
            p->key = num;
            p->value = value;
            p->next = NULL;
        }
    } 
}

/* Check if entry is present in hash table for the key. If yes, then return the
 * value stored for that hash table in value and return 0 or 1 based on success/failure */
int is_present_hash_table(int num, int *value) 
{

    int temp = abs(num % HT_SIZE);
    
    if(hash_array[temp].key==num)
    {
        *value = hash_array[temp].value;
        return 1;
    }else
    {
        struct hash_array *p=&hash_array[temp]; 
        while((p->key != num) && (p->next != NULL)) {
        	p = p->next;
        }
        if(p->key==num) {
        	*value = p->value;
            return 1;
        }
        else
        {
            return 0;
        }
    }
    return 0;
}

int findMaxLength(int* nums, int numsSize){
    int sum_cnt = 0;
    int max_len = 0;
    int hash_val = 0;
    int idx = 0;
    memset(hash_array, 0, sizeof(struct hash_array) * HT_SIZE);
    /* If 0 is encountered. sum_cnt -= 1 
     * else if 1 is encounterd, then sum_cnt += 1
     * eg: 0,1,0,1,0,0,0,1,0,1
      sum_cnt : -1, 0, -1, 0,-1,-2,-3,-2,-3,-2
      Using sum_cnt as key at each index, we can store it in hash table and 
      determine the contiguous array of 0,1 
     */
    for (idx = 0; idx < numsSize; idx++) {
        sum_cnt += ((nums[idx] == 1) ? 1 : -1 );
        
        /*Case, when we encounter cases like this
         * 0,1,0,1 only 4 elements for eg: equal num of 0s and 1s */
        if (sum_cnt == 0) {
            max_len = (idx + 1);
        }
        /* If the sum cnt is already in hash table, then check the
         * new count with the existing max_len and update if needed */
        if (is_present_hash_table(sum_cnt, &hash_val)) {
            if ((idx - hash_val) > max_len) {
                max_len = (idx - hash_val);
            }
        } else {
            add_entry_hash_table(sum_cnt, idx);
        }
    }
    return max_len;
}


int main(int argc, char *argv[]) {
    int *num_p = NULL;
    int idx = 0;
    if (argc < 2) {
        printf("Usage: ./a.out <num1> ... <num n>\n");
        exit(1);
    }
    printf("Input length: %d \n", argc - 1);

    num_p = (int *)malloc((argc - 1)*sizeof(int));
    if (num_p == NULL) {
        printf("Memory allocation failed \n");
        return -1;
    }
    /* Dont want to change the function, so copying the input to int array */
    for (idx = 1; idx <= (argc - 1); idx++) {
        num_p[idx - 1] = atoi(argv[idx]);
    }
    printf("Max length of contiguous array is : %d\n", findMaxLength(num_p, argc - 1));

    free(num_p);
    return 0;
}
