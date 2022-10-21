import java.util.*;

public class Oct_19 {
    public static void main(String[] args) {

    }

    public static List<String> topKFrequent(String[] words, int k) {
        ArrayList<String> res = new ArrayList<String>(words.length);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            q.offer(entry);
            if (q.size() > k) {
                q.poll();
            }
        }

        while (!q.isEmpty()) {
            res.add(0, q.poll().getKey());
        }

        return res;
    }
}
