from itertools import permutations

def get_permutations(s):
    return [''.join(p) for p in permutations(s)]

print(get_permutations("abc"))  
# Output: ['abc', 'acb', 'bac', 'bca', 'cab', 'cba']
