package org.example.dsaString;




public class PrintStarPattern {


//             *
//             * *
//             * * *
//             * * * *
//             * * * * *
//             * * * *
//             * * *
//             * *
//             *

    static void printstar(int n){
        for(int i=0; i<n; i++){
            String str = "";
            for(int j=0; j<=i; j++){
                str = str+" *";
            }
            System.out.println(str);
        }

        for(int i=n-2; i>=0; i--){
            String str = "";
            for(int j=0; j<=i; j++){

                str = str+" *";

            }
            System.out.println(str);
        }

    }


    public static void main (String [] args) {
        int n = 5;
        printstar( n);
    }

}
