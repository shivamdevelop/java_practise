       ////    // class sort {
//     // IT compares the a[0] element with a[1] element and swap them..
//     //and it continues this process until the greatest element reaches at the LAST
//    public static   void Bubblesort(int a[]){
//        int temp;
       
//        int n=a.length;
//    for(int i=0;i<a.length;i++){
//        for(int j=1;j<n-i;j++){
//            if(a[j-1] > a[j]){    
//              temp = a[j-1];    
//                a[j-1] = a[j];    
//                  a[j] = temp;
//    }}}}
//    public static void main(String args[]){
//        int a[]={34,65,34,65,33,5,4,23};
//        System.out.println("Before sorting");
//        for(int i=1;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println("After sorting");
//       Bubblesort(a);
//     for(int i=1;i<a.length;i++){
//         System.out.print(a[i]+" ");
//     }}}


// class sort{
//     //In selection sort, very first element is compared with greatest element of the lsit and than swappping has been done...
//     //this process than continues with the secon element and further continues until the list is sorted..
//     int a[];
//    public static void selectionsort(int a[]){
//     int temp=0;
//     int n=a.length;
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             if(a[i]>a[j]){
//                 temp=a[i];
//                 a[i]=a[j+1];
//                 a[j+1]=temp;
//             }
//         }
//     }

//    } 
// public static void main(String args[]){
//     int a[]={34,65,34,65,33,5,4,23};
//         System.out.println("Before sorting");
//         for(int i=1;i<a.length;i++){
//             System.out.print(a[i]+" ");
//        }
//         System.out.println("After sorting");
//         selectionsort(a);
//      for(int i=1;i<a.length;i++){
//          System.out.print(a[i]+" ");
// }

// }

// }  

// class searching {
//     int item;
//     public static void linearsearch(int a[], int item){
//         for(int i=0;i<a.length;i++){
//             if(a[i]==item){
//                 System.out.println("element is at"+i+" "+"position ");
//             }else if(a[i]!=item){
//                 System.out.println("Item not found");

//             }
//         }

//     }
//      public static void main(String args[]){
//         int a[]={3,5,7,9,10,12,14,16,18,20};
//         linearsearch(a,9);
//         for(int i=1;i<a.length;i++){
//         System.out.println( "item is"+a[i]);
//     }
// }
// }


//  class BinarySearch {
//     public static int binarySearch(int[] arr, int target) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             // Check if target is at mid
//             if (arr[mid] == target) {
//                 return mid;
//             }

//             // If target is greater, ignore left half
//             if (arr[mid] < target) {
//                 left = mid + 1;
//             }
//             // If target is smaller, ignore right half 
//             else {
//                 right = mid - 1;
//             }
//         }

//         // Target not found
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 3, 5, 7, 9, 11, 13};
//         int target = 7;
//         int result = binarySearch(arr, target);

//         if (result == -1) {
//             System.out.println("Element not found");
//         } else {
//             System.out.println("Element found at index: " + arr[result]);
//         }
//     }
// }





                //    FIND DUPLICATE ELEMENT USING 
                //    1.SORTING AND CHECKING THE DULICACY.

                // import java.util.HashSet;

                //  class FindDuplicates {
                //     public static void findDuplicates(int[] arr) {
                //         HashSet<Integer> set = new HashSet<>();
                //         boolean foundDuplicate = false;
                
                //         for (int i = 0; i < arr.length; i++) {
                //             if (set.contains(arr[i])) {
                //                 System.out.println("Duplicate found: " + arr[i]);
                //                 foundDuplicate = true;
                //             } else {
                //                 set.add(arr[i]);
                //             }
                //         }
                
                //         if (!foundDuplicate) {
                //             System.out.println("No duplicates found.");
                //         }
                //     }
                
                //     public static void main(String[] args) {
                //         int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 3};
                //         findDuplicates(arr);
                //     }
                // }
                
//                 import java.util.HashMap;

//     

// import java.util.HashMap;
// import java.util.Map.Entry;
// import java.util.Set;
   
// class duplicate {
//     public static void main(String[] args){
//         int a[]={3,5,7,2,4,2,5,6};
//         HashMap <Integer,Integer> hm=new HashMap<>();
//         for(int no:a){ 
//         int count = hm.get(no);
//         if(count==0){
//             hm.put(no, 1);
//             System.out.println("Number apppears"+1+"time");
          
//         }else{
//             count =count +1;
//             hm.put(no,count);
//             System.out.println("Number"+no+"appears"+count+"times");
//             Set<Entry<Integer,Integer>> es=hm.entrySet();
//         }
//         }
//     }
// }

// import java.util.HashSet;

//  class serching and sorting {
//     public static void main(String[] args) {
//         int temp=-1;
//         int a[]={3,5,8,3,5,9,8};
//         HashSet <Integer> set=new HashSet<>();
//         for(int i=0;i<a.length;i++){
//             if(set.contains(a[i])){
//                 temp=a[i];
//             }else{
//                 set.add(a[i]);
//             }
//         }if(temp!=-1){
//             System.out.println("first duplicate number is"+a[temp]);
//         }  
//     }
// }



// // //find  the missing number

// class fnidmissing{
//        public static void main(String[] args) {
//               int  a[]={1,3,4,5,6};
//               int lastnum=a.length+1;
//               int expectedno=lastnum*(lastnum+1)/2;
//               int sum=0;
//               for(int i=0;i<a.length;i++){
//                    sum=sum+a[i];  
//               }
//               int result=expectedno-sum;
//               System.out.println("Here the missing number is"+result);


//        }
// }
