package practice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ServerQueue {
    public int priority;
    public String request;

    public ServerQueue(int priority, String request) {
        this.priority = priority;
        this.request = request;
    }

    @Override
    public String toString() {
        return "ServerQueue{" +
                "priority=" + priority +
                ", request='" + request + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Queue<ServerQueue> sq = new PriorityQueue<ServerQueue>(new Comparator<ServerQueue>() {
            @Override
            public int compare(ServerQueue o1, ServerQueue o2) {
                return o1.priority - o2.priority;
            }
        });

        sq.offer(new ServerQueue(4, "Req1"));
        sq.offer(new ServerQueue(2, "Req2"));
        sq.offer(new ServerQueue(5, "Req3"));
        sq.offer(new ServerQueue(1, "Req4"));

        int size = sq.size();
        for (int i = 0; i < size; i++) {
            System.out.println(sq.poll());
        }
    }
}
