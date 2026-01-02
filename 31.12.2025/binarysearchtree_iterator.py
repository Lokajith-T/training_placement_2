class BSTIterator(object):
    def __init__(self, root):
        self.stack=[]
        self.putinleft(root)
    def putinleft(self,node):
        while node:
            self.stack.append(node)
            node=node.left    
    def next(self):
        node=self.stack.pop()
        val=node.val
        if node.right:
            self.putinleft(node.right)
        return val
    def hasNext(self):
        return len(self.stack)>0
        
