from collections import deque

def ladderLength(beginWord, endWord, wordList):
    wordSet = set(wordList)
    q = deque([(beginWord, 1)])

    while q:
        word, steps = q.popleft()
        if word == endWord:
            return steps

        for i in range(len(word)):
            for c in "abcdefghijklmnopqrstuvwxyz":
                nxt = word[:i] + c + word[i+1:]
                if nxt in wordSet:
                    wordSet.remove(nxt)
                    q.append((nxt, steps + 1))
    return 0
