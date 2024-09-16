# runtime O(n)
# memory O(n)

def contiguous_bin(array):
    d = {}
    maxx = 0
    summ = 0
    d[0] = -1
    
    # As explained in the class. we maintain a sum
    # variable where we add one if we encounter 1 and 
    # -1 if encounter 0. We store the first occurence
    # of a particular sum. If in the future we encouter 
    # a sumular sum, that means that the subarray in between 
    # these indices has equal number of 1's and 0's
    for n in range(len(array)):
        if array[n]:
            summ += 1
        elif not array[n]:
            summ -= 1
        
        if summ in d:
            maxx = max(maxx, n - d[summ])
        
        elif summ not in d:
            d[summ] = n
    
    return maxx

array = [0,1,0,1,0,0,1,1]
print(contiguous_bin(array))