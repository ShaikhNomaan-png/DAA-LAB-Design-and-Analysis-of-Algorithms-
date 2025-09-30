import java.util.*;

class KWayMergeSort {
    
    static class Node {
        int value;  
        int arrayIndex; 
        int nextIndex;  
        
        public Node(int value, int arrayIndex, int nextIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.nextIndex = nextIndex;
        }
    }

    public static List<Integer> mergeKSortedArrays(List<List<Integer>> sortedArrays) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(n -> n.value));
        List<Integer> mergedList = new ArrayList<>();

        for (int i = 0; i < sortedArrays.size(); i++) {
            if (!sortedArrays.get(i).isEmpty()) {
                minHeap.add(new Node(sortedArrays.get(i).get(0), i, 1));
            }
        }

        while (!minHeap.isEmpty()) {
            Node smallest = minHeap.poll();
            mergedList.add(smallest.value);

            if (smallest.nextIndex < sortedArrays.get(smallest.arrayIndex).size()) {
                minHeap.add(new Node(sortedArrays.get(smallest.arrayIndex).get(smallest.nextIndex), 
                                     smallest.arrayIndex, 
                                     smallest.nextIndex + 1));
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<List<Integer>> sortedArrays = new ArrayList<>();
        sortedArrays.add(Arrays.asList(1, 5, 9));
        sortedArrays.add(Arrays.asList(2, 6, 10));
        sortedArrays.add(Arrays.asList(3, 7, 11));
        sortedArrays.add(Arrays.asList(4, 8, 12));

        List<Integer> mergedList = mergeKSortedArrays(sortedArrays);
        System.out.println("Merged Sorted Array: " + mergedList);
    }
}
