def solveNQueens(n):
    res = []
    cols = set()
    diag1 = set()
    diag2 = set()

    def backtrack(r, board):
        if r == n:
            res.append(board[:])
            return
        for c in range(n):
            if c in cols or r-c in diag1 or r+c in diag2:
                continue
            cols.add(c)
            diag1.add(r-c)
            diag2.add(r+c)
            backtrack(r+1, board + ["."*c + "Q" + "."*(n-c-1)])
            cols.remove(c)
            diag1.remove(r-c)
            diag2.remove(r+c)

    backtrack(0, [])
    return res
