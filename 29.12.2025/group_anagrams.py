from collections import defaultdict

def groupAnagrams(strs):
    res = defaultdict(list)

    for s in strs:
        key = tuple(sorted(s))
        res[key].append(s)

    return list(res.values())
