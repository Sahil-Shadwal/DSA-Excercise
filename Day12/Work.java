package Day12;

import java.util.*;

public class Work {
    static class Task {
        String name;
        String type;
        int completionTime;

        public Task(String name, String type, int completionTime) {
            this.name = name;
            this.type = type;
            this.completionTime = completionTime;
        }
    }

    static class Worker {
        String name;
        int timeAvailable;

        public Worker(String name) {
            this.name = name;
            this.timeAvailable = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Task[] tasks = new Task[m];
        Worker[] workers = new Worker[n];

        // Read tasks
        for (int i = 0; i < m; i++) {
            String taskName = sc.next();
            String taskType = sc.next();
            int completionTime = taskType.equals("Manual") ? sc.nextInt() : 0;
            tasks[i] = new Task(taskName, taskType, completionTime);
        }

        // Sort tasks by name
        Arrays.sort(tasks, (a, b) -> a.name.compareTo(b.name));

        // Initialize workers
        for (int i = 0; i < n; i++) {
            String workerName = "W" + (i + 1);
            workers[i] = new Worker(workerName);
        }

        int timeTaken = 0;
        int i = 0;
        int j = 0;

        while (i < m || j < n) {
            if (i < m && tasks[i].completionTime == 0) {
                String workerName = workers[j].name;
                System.out.println(workerName + " " + tasks[i].name + " " + timeTaken);
                i++;
                j++;
            } else if (i < m && tasks[i].completionTime > 0) {
                int minIndex = -1;
                for (int k = 0; k < n; k++) {
                    if (workers[k].timeAvailable <= timeTaken) {
                        minIndex = k;
                        break;
                    }
                }
                if (minIndex != -1) {
                    String workerName = workers[minIndex].name;
                    System.out.println(workerName + " " + tasks[i].name + " " + (timeTaken + tasks[i].completionTime));
                    workers[minIndex].timeAvailable = timeTaken + tasks[i].completionTime;
                    i++;
                }

            } else {
                int minIndex = -1;
                for (int k = 0; k < n; k++) {
                    if (workers[k].timeAvailable <= timeTaken) {
                        minIndex = k;
                        break;
                    }
                }
                if (minIndex != -1) {
                    timeTaken = workers[minIndex].timeAvailable;
                    j = minIndex + 1;
                }
            }

        }
    }
}
