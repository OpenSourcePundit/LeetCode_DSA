class Solution {
   public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        // Initialize adjacency list
        for (int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());

        // Build graph and in-degree array
        for (int[] pre : prerequisites) {
            int dest = pre[0], src = pre[1];
            graph.get(src).add(dest);
            inDegree[dest]++;
        }

        // Add all courses with 0 in-degree to queue
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            if (inDegree[i] == 0)
                queue.add(i);

        int completed = 0;

        while (!queue.isEmpty()) {
            int course = queue.poll();
            completed++;

            for (int neighbor : graph.get(course)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0)
                    queue.offer(neighbor);
            }
        }

        return completed == numCourses;
    }
}