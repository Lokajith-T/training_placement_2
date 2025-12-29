def maxProduct(nums):
    cur_max = cur_min = result = nums[0]

    for n in nums[1:]:
        temp = cur_max
        cur_max = max(n, cur_max * n, cur_min * n)
        cur_min = min(n, temp * n, cur_min * n)
        result = max(result, cur_max)

    return result
