package org.example.dsaString;


public class StarPattern {


    public static void main (String [] args) {
        int n = 5;
        starPattern1( n);
    }

//             *
//             * *
//             * * *
//             * * * *
//             * * * * *
//             * * * *
//             * * *
//             * *
//             *

    public static void starPattern1( int num){
        for(int i=0; i< num; i++){
            String s = "";
            for(int j=0; j <= i; j++){
                 s= s+ " *";
            }
            System.out.println(s);
        }
        for(int i=num-2; i >= 0; i--){
            String t = "";
            for(int j=0; j <=i; j++){
                t= t+ " *";
            }
            System.out.println(t);
        }
    }

//        *****
//        *****
//        *****
//        *****

    public static void solidRectangle(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//            *****
//            *   *
//            *   *
//            *****

    public static void hollowRectangle(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//        *
//        **
//        ***
//        ****
    public static void halfPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//        ****
//        ***
//        **
//        *

    public static void invertedHalfPyramid(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//              *
//             **
//            ***
//           ****

    public static void rightAlignedPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//                  *
//                 ***
//                *****
//               *******

    public static void fullPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//            *******
//             *****
//              ***
//               *

    public static void invertedFullPyramid(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//              *
//             ***
//            *****
//           *******
//            *****
//             ***
//              *

    public static void diamond(int n){
        // upper
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++) System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        // lower
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++) System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }


//                  *
//                 * *
//                *   *
//               *     *
//                *   *
//                 * *
//                  *

    public static void hollowDiamond(int n){
        // Upper half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++) System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++){
                if(j == 1 || j == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        // Lower half
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++) System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++){
                if(j == 1 || j == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }




}
