// public class practise {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>i;j--){
//                 System.out.print("-");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }


//             System.out.println(" ");
//         }
//     }
// }
// ----* 
// ---**
// --***
// -****
// *****


// public class practise {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 if(i==5 || j==5){
//                     System.out.print("*"+ " ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     } 
// // }
// *  
// *
// *
// *
// * * * * *

// public class practise {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// 1  
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5


// public class practise {
// public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
                    
//             }                                                          
//             System.out.println(" ");
//         }
//     }
//     1 
// 1
// 13
// 13
// 135
// }


// public class practise {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 int sum=i+j;
//                 if(sum %2 == 0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println(" ");


//         }
//     }
// }
// 1 
// 01
// 101
// 0101
// 10101

// public class practise {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for( int j=10;j>=1;j--){
//                 System.out.print("-");
//             }
//             System.out.println(" ");
//         }
//         System.out.println(" ");
//     }
// *----------  
// **---------- 
// ***----------   
// ****----------  
// *****---------- 
// }

//  public class practise {
 
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
//  }
//     * 
//    ***
//   *****
//  *******
// *********
//    

// public class practise {

//     public static void main(String[] args) {
//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(j+ " ");
//         }
//         System.out.println(" ");
//     }
//     }
// }
// 1  
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// public class practise {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// 5 4 3 2 1  
// 5 4 3 2
// 5 4 3
// 5 4
// 5


// public class practise {

//     public static void main(String[] args) {
//         int a=65;
//         for(int i=1;i<=5;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print((char)(a+j)+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// A  
// A B
// A B C
// A B C D
// A B C D E


// public class practise {

//     public static void main(String[] args) {
//         int a=65;
//         for(int i=0;i<=5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print((char)(a+i)+" ");
//             }
//             System.out.println( " ");
//         }
//     }
// }
// A  
// B B
// C C C
// D D D D
// E E E E E
// F F F F F F


// public class practise {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// ----*  
// ---* *
// --* * *
// -* * * *
// * * * * *

// public class practise {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" "
;
//         }
//     }
// }
// **** 
// ***
// **
// *


// /**
//  * arrayprogram
//  */
// public class arrayprogram {

//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){


//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             int diamond=2*(5-i);
//             for(int j=1;j<diamond;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println(" ");
//         }
//         for(int i=1;i<=5;i++){


//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             int diamond=2*(5-i);
//             for(int j=1;j<diamond;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }
   
//     *
//    ***
//   *****
//  *******
//  *******  
//   *****
//    ***
//     *



