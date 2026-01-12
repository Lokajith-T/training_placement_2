def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])
    
    sorted_arr = []
    while left and right:
        sorted_arr.append(left.pop(0) if left[0] < right[0] else right.pop(0))
    
    return sorted_arr + left + right

print(merge_sort([5, 3, 8, 4, 2]))  # Output: [2, 3, 4, 5, 8]
