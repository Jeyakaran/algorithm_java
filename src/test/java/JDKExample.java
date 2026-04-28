import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

@SuppressWarnings( "unused")
public class JDKExample {
    @Test
    void test() {

        // Array
        int[] numbers = new int[1];
        numbers[0] = 42;

        int[] array2 = new int[]{1, 2};
        int[] array3 = {3, 4};

        // List
        List<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.get(0);

        List<Integer> list02 = List.of(1, 2);

        Arrays.sort(numbers);

        // Set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.contains(1);
        set.remove(1);
        for (Integer i : set) {
            System.out.println(i);
        }

        set.forEach(System.out::println);

        // Map
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('a', 1);
        map1.get('a');

        map1.getOrDefault('a', 1);
        map1.merge('a', 1, Integer::sum);
        map1.merge('b', -1, Integer::sum);

        boolean containsKey = map1.containsKey('a');
        boolean containsValue = map1.containsValue(1);
        Collection<Integer> values = map1.values();
        Set<Character> characters = map1.keySet();

        map1.forEach((k, v) -> System.out.println(k + " " + v));
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<Character, Integer> characterIntegerMap = Map.of('a', 1, 'b', 2);

        // Stream
        int sum = list02.stream().mapToInt(Integer::intValue).sum();

        // Stack
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.pop();
        stack.peek();
        stack.isEmpty();
        stack.size();

        // Queue
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.poll();
        queue.peek();
        queue.isEmpty();

        // Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(3);
        minHeap.offer(1);
        minHeap.poll(); // Returns 1

        // utils
        Math.min(1, 2);
        Math.max(1, 2);

        // counts[char - 'A']
        int[] counts = new int[26];
        counts['C' - 'A']++;

        // String
        String name = "john";
        char[] chars = name.toCharArray();
        char c = name.charAt(0);

        String[] tokens = name.split(" ");

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b");
        sb.reverse();
        sb.toString();

        // Custom Sorting
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Binary Search
        int[] sortedNumbers = {1, 2, 4, 8, 16};
        int index = Arrays.binarySearch(sortedNumbers, 4); // returns 2
        int notFound = Arrays.binarySearch(sortedNumbers, 5); // returns negative insertion point

        // TreeMap / TreeSet (Ordered Map/Set)
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.floorKey(15);   // 10
        treeMap.ceilingKey(15); // 20
        
        TreeSet<Integer> treeSet = new TreeSet<>(Set.of(1, 5, 10));
        treeSet.higher(5); // 10
        treeSet.lower(5);  // 1

        // LinkedHashMap (LRU Cache base)
        LinkedHashMap<Integer, Integer> lruCache = new LinkedHashMap<>(16, 0.75f, true);
        
        // Character Utilities
        Character.isDigit('5');
        Character.isLetter('a');
        Character.isLetterOrDigit('!');
        Character.toLowerCase('A');
        
        // Collections Utilities
        Collections.reverse(list01);
        Collections.max(list02);
        Collections.min(list02);
        
        // Bit Manipulation
        int bitCount = Integer.bitCount(7); // 3 (binary 111)
        String binaryStr = Integer.toBinaryString(7); // "111"
        
        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(1);
        maxHeap.offer(3);
        maxHeap.poll(); // Returns 3

    }

    @Test
    void test_stack() {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
        assertEquals(2, stack.pop());
    }

    @Test
    void test_queue() {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.poll());
    }

}
