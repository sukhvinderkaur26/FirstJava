import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //int arr[][]=new int[4][4];
        int arr[][] = new int[][]{
                {10, 20, 23, 40},
                {34, 89, 56, 12},
                {23, 56, 78, 67},
                {45, 67, 12, 34}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || j == 0 || i == arr.length - 1 || j == arr.length - 1) {
                    System.out.print(arr[i][j] + "\t");
                } else System.out.print(" \t");

            }
            System.out.println();
            System.out.println("My changes");
        }

        //      for(int i=0;i<4;i++) {
//int s=0;
//            for (int j = 0; j < 3; j++) {
//             //s=s+arr[i][j];
//                s=s+arr[j][i];
//                //System.out.print(arr[i][j] + "  ");
//
//            }
//            System.out.println(s);
//            //System.out.println();
//        }

        //System.out.println();

// char firstname[]={'S','u','k','h','v','i','n','d','e','r'};
//        System.out.print("First name is : ");
// for(int i=0;i<firstname.length;i++)
// {
//     System.out.print(firstname[i]);
// }

//
//        int marks[]=new int[]{12,34,23,45,10};
//
////        for(int i=0;i<5;i++)
////        {
////        marks[i]=20;
////            }
//        System.out.println("length="+marks.length);
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(marks[i]);
//       }
//        int s=0;
//        for(int i=0;i<5;i++)
//        {
//           s=s+marks[i];
//        }
//        System.out.println(s);
//}
//public static int printSum(int [] arr) {
//        int s=0;
//        for(int i=0;i< arr.length;i++)
//        {
//            s=s+arr[i];
//}
//        return s;


        char firstname[]={'S','u','k','h','v','i','n','d','e','r'};
        System.out.println(firstname);
        System.out.println(Arrays.toString(firstname));
    }
}
