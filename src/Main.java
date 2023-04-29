
public class Main {

//
////    public static void main(String[] args) {
//
////
////        // pirveli amocana
////
////        int[] arr = {100, 200, 150, 175, 80, 300, 50};
////        double mean = meanOf150Plus(arr);
//        System.out.println(mean); // Output: 206.25
//
//    }
//    public static double meanOf150Plus(int[] arr) {
//        double sum = 0.0;
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 150) {
//                sum += arr[i];
//                count++;
//            }
//        }
//
//        if (count == 0) {
//            return 0.0;
//        } else {
//            return sum / count;
//        }
//    }


// 0000000000000000000000000000000000000000000000

//
//    public static void main(String[] args) {
//        // meoree amocana
//
//        int[] arr = {3, 6, 9, 10, 14};
//        double geoMean = geometricMeanOfOdds(arr);
//        System.out.println(geoMean); // Output: 2.605171084697352
//
//    }
//
//    public static double geometricMeanOfOdds(int[] arr) {
//        double product = 1.0;
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 1) {
//                product *= arr[i];
//                count++;
//            }
//        }
//
//        if (count == 0) {
//            return 0.0;
//        } else {
//            return Math.pow(product, 1.0 / count);
//        }
//    }

    public static void main(String[] args) {
        Department d1 = new Department("Sales", 25, "John Doe");
        Department d2 = new Department("Sales", 25, "Jane Smith");
        Department d3 = new Department("Marketing", 30, "Alice Jones");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(d1.equals(d2)); // Output: false
        System.out.println(d1.equals(d3)); // Output: false
        System.out.println(d2.equals(d3)); // Output: false



    }




}





