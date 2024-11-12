import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1,2,3,4,5));
    }

//    public static void miniMaxSum(List<Integer> arr) {
//        // Viết hàm tính tổng tối thiểu và tổng tối đá trong mảng gồm 5 phần tử :
//        // 1. Tìm 4 số nhỏ nhất
//        // 2. Tìm 4 số lớn nhất
//        // 3. Sum 4 số nhỏ nhất
//        // 4. Sum 4 số lớn nhấtnhất
//        List<Integer> minList = new ArrayList<>();
//
//        for(int i = 0 ; i < arr.size(); i++) {
//            for (int j = 1; j< arr.size(); j++ ){
//                int numberFlg = arr.get(i) ;
//                int numberCompare = arr.get(j) ;
//
//                if(numberFlg < numberCompare){
//                    minList.add(numberFlg) ;
//                    break;
//                }
//            }
//
//        }
//
//        List<Integer> maxList = new ArrayList<>();
//
//        for(int i = 0 ; i < arr.size(); i++) {
//            for (int j = 0 ; j< arr.size(); j++ ){
//                int numberFlg = arr.get(i) ;
//                int numberCompare = arr.get(j) ;
//
//                if(numberFlg > numberCompare){
//                    maxList.add(numberFlg) ;
//                    break;
//                }
//            }
//
//        }
//        System.out.println( minList);
//        System.out.println(maxList);
//
//        List<Integer> sum = new ArrayList<>();
//        int sim2 = 0 ;
//        for (Integer i : minList) {
//             sim2+= i ;
//        }
//
//        int sim3 = 0 ;
//        for (Integer i : maxList) {
//            sim3+= i ;
//        }
//        sum.add(sim2);
//        sum.add(sim3);
//        System.out.println(sum);
//
//    }
public static void miniMaxSum(List<Integer> arr) {

    long totalSum = 0;
    for (int num : arr) {
        totalSum += num;
    }


    int minElement = arr.get(0);
    int maxElement = arr.get(0);
    for (int num : arr) {
        if (num < minElement) {
            minElement = num;
        }
        if (num > maxElement) {
            maxElement = num;
        }
    }


    long minSum = totalSum - maxElement;
    long maxSum = totalSum - minElement;

    // Step 4: Print the result
    System.out.println(minSum + " " + maxSum);
}

}