class Solution(object):
    def countLargestGroup(self, n):
        """
        :type n: int
        :rtype: int
        """
        ret = []
        n1 = n + 1
        for i in range(n1):
            #ret.append([])
            ret.append(0)
        for j in range(1,n1):
            #ret[sum(int(k) for k in list(str(j)))].append(j)
            ret[sum(int(k) for k in list(str(j)))] += 1
        #print ret
        #mlen = len(max(ret,key = len))
        return ret.count(max(ret))
        '''
        count = 0
        for l in ret:
            if len(l) == mlen:
                count += 1
        return count
        '''
