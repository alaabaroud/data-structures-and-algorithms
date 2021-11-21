# Quick Sort :
Quicksort is an in-place sorting algorithm It picks an element as pivot and partitions the given array around the picked pivot.

# PsuedoCode: 
``` java
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
    
    ```
    
    # Trace :
 - Step number 1 :  We choose an element and call it pivot. it will be uses it to divide the list into two sub-lists.
 - step number 2 : now reorder all the elements in the sides of the pivot, the ones with smaller value are placed before it, and ones greater than the pivot will be after it. After this step, the pivot is in its final position.
 - this step will be  applied continuesly to both sub-lists on the left and right of the pivot. until it finishes the subarrays.
 - finally we will have a sorted array.

BigO :
time complexity: O(n^2)
space : O(1)


