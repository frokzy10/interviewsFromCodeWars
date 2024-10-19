package QuickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    private static int iterationCount;
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 7, 8, 9, 1, 5);
        System.out.println("Исходный массив: " + list);
        List<Integer> sortedArr = qsort(list);
        System.out.println("Отсортированный массив: " + sortedArr);
    }
    private static List<Integer> qsort(List<Integer> arr){
        if(arr.size() < 2){
            return arr;
        }else {
            int pivot = arr.getFirst();

            List<Integer> less = new ArrayList<>();
            List<Integer> more = new ArrayList<>();

            for (int i = 1 ; i < arr.size(); i++){
                if(arr.get(i) < pivot){
                    less.add(arr.get(i));
                }else{
                    more.add(arr.get(i));
                }
            }
            System.out.println(iterationCount++);
            List<Integer> result = new ArrayList<>();
            result.addAll(qsort(less));
            result.add(pivot);
            result.addAll(qsort(more));

            return result;
        }
    }
}
