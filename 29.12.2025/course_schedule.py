from collections import defaultdict, deque

def canFinish(numCourses, prerequisites):
    graph = defaultdict(list)
    indegree = [0] * numCourses

    for a, b in prerequisites:
        graph[b].append(a)
        indegree[a] += 1

    q = deque()
    for i in range(numCourses):
        if indegree[i] == 0:
            q.append(i)

    finished = 0
    while q:
        course = q.popleft()
        finished += 1
        for next_course in graph[course]:
            indegree[next_course] -= 1
            if indegree[next_course] == 0:
                q.append(next_course)

    return finished == numCourses
