













// //always create the  main class before and the  several calsses acc to use only.
// //show todays sale by using teh cosnstructor.
// //show sharing of jwellery using inheritance .
// //show sale to customers using polymorphism.
// class shivam {
//         int money;
//         int kamati;
//         int studys;
//       public void print(){
//          System.out.println("my name is shivam verma and my todays sale is"+this.kamati+" "+this.money+" "+this.studys);
//       }
//       public void  sale(int money){
//         System.out.println("my todays sale is of 20k");
//       };
//       public void sale(){
//         System.out.println("my yesterdays sale was of 50k");
//       }
// }
// class sanjay extends shivam{
//         int  chutki;
//         int payal;
//         int ring;
//         int chuchak;
//         sanjay( int  chutki,int payal,int ring,int chuchak, int money,int kamati,int studys){
//                 this.chuchak=chuchak;
//                 this.chutki=chutki;
//                 this.payal=payal;
//                 this.ring=ring;
//                 this.money=money;
//                 this.kamati=kamati;
//                 this.studys=studys;
//                 System.out.println("my name is Sanjay Verma and todays sale is"+this.chuchak+" "+this.chutki+" "+this.payal+" "+this.ring+"and shivam has only gave me this all money"+this.money+" "+this.kamati+" "+this.studys);
//       } 
// };
// public class arrayprogram {

//         public static void main(String[] args) {
//                 shivam s2=new shivam();
//                 s2.print();
//                 s2.sale(s2.money);
//                 sanjay s1=new sanjay(100, 50, 23, 34,34,53,34);
                
//         }
// };
 


















// class sanjay{
//         String sanskaaar;
// }
// class shivam extends sanjay{                     //inheritance 
//         shivam(String sanskaar){
//                 this.sanskaaar=sanskaar;
//                 System.out.println("shivam ko sanjaar mile"+this.sanskaaar+"ji se");
//         }
// }
// public class arrayprogram {
//         public static void main(String[] args) {
//                 shivam sv=new shivam("raghunandan verma ji se");
//               }
//         }
















//   //compile time polymorphism or function overloading 
// class data{
//         String name;
//         int id;
//         String address;
//         data(String name,int id,String address){     //this si paarmetrized constructor portion
//                 this.address=address;
//                 this.id=id;
//                 this.name=name;
//         };

//         public void show(String name){                                 //this is compile time polymorphism
//                 System.out.println("so my name is"+this.name);
//         };

//         public void show(int id){                                       //this is compile time polymorphism
//                 System.out.println("so my id is"+this.id);
//         };
      
//         public void show(String name,int id){                           //this is compile time polymorphism
//         System.out.println("so my name and id is"+this.name+ " "+this.id);
//        }
// }
// public class arrayprogram {
//  public static void main(String[] args){
//                 data d1=new data("shivam", 100000, "ghookna ghaziabad");
//                 d1.show(d1.name);
//                 d1.show(d1.address);
//                 d1.show(d1.id);
//                 }
// }
























// class sunar1{
//         String name;
//         int id;
//         int wealth;
//         sunar1(String name,int id,int wealth){  //parametrized cosntructor
//          this.id=id;
//          this.name=name;
//          this.wealth=wealth;
//          System.out.println("so my name is"+this.name+"and my ID and wealth is"+this.id+" "+this.wealth);
//         }

// }
// class sunar2{
//         String name;
//         int id;
//         int wealth;
//         sunar2(String name, int id,int wealth){ //parametrized constructor and tehy are never been called
//                this.id=id;
//                this.name=name;

//                this.wealth=wealth;
//                System.out.println("so my name is"+ this.name+ "and my ID and wealth is"+this.id+" "+this.wealth);
//         }
// }
// public class arrayprogram {

//         public static void main(String[] args) {
//                 sunar1 s1=new sunar1("shivam",100,100000);
//                 sunar2 s2=new sunar2("sanjay",93239,392739739);
//         }
// }







// class data{
//         String name="shivam";
//         int income=1999999;
//         data(){     //this is  non-parmetrized constructor 
//                 System.out.println("my name is"+this.name+"and my monthly income is"+this.income);
//         }
// }
// public class arrayprogram {

//         public static void main(String[] args) {
//               data d1=new data();  //and cinstructor is never ever been called as like objects;
//         }
// }


























// class sunar1{
//         String name;
//         String profession;
//         int income;
//         int wealth;
//         public void print (){
//                 System.out.println(this.name+"is a"+this.profession+"and his monthly"+this.income+"and having asserts of"+this.wealth);
//         }

// }

// class sunara2{
//         String name;
//         String profession;
//         int income;
//         int wealth;
//         public void print(){

//                 System.out.println(this.name+"is a"+this.profession+"and his monthly"+this.income+"and having asserts of"+this.wealth);
//         }
        
// }
// public class arrayprogram {

//         public static void main(String[] args) {
//                 sunar1 s1=new sunar1();
//                 sunara2 s2=new sunara2();
//                 s1.income=300000;
//                 s1.name="SANJAY";
//                 s1.profession="SUNAR";
//                 s1.wealth=1500000;

//                 s2.income=100000;
//                 s2.name="SHIVAM";
//                 s2.profession="sunar";
//                 s2.wealth=10000;
//                 s1.print();
//                 s2.print();
//         }
// }

























// class intro{
// String name="shivam";
// String address="351 Susbash nagar ghookna ghaziabad";
// int age=24;
// String Caste="verma";
 
// public void show(){


// System.out.println("my name is "+this.name+"my addrees is"+this.address+"and my age and caste is"+this.Caste);
// }
// }

// class professioan{
//         String wrok="SUNAR";
//         String study="M-tech";
//         public void show(){
//                 System.out.println("my profession is"+this.wrok+"and my eduction is"+this.study);
// }
// }



// public class arrayprogram {
//         public static void main(String[] args) {
//                 intro i1=new intro();
//                 professioan p1=new professioan();
//                 i1.show();
//                 p1.show();


//         }

        
// }




























// ****************
// import java.util.HashSet;

// /**
//  * arrayprogram
//  */
// public class arrayprogram {

//         public static void main(String[] args) {
//         HashSet<Integer>hs=new HashSet<>();
//                 int temp=-1;
//                 int a[]={3,4,53,23,23,53,3};
//                 for(int i=0;i<=a.length;i++){
//                         if(hs.contains(a[i])){
//                                 temp=i;
//                         }else {
//                                 hs.add(a[i]);
//                         }
//                         if(temp!=-1){
//                                 System.out.println("duplicate elements are"+a[temp]);
//                         }else{
//                                 System.out.println("new array elements are"+a[i]);
//                         }
//                 }

//         }
// }












//  simple logic to enter the element at any particular position
// public class arrayprogram {

//         public static void main(String[] args) {
//                 int pos=3;
//                 int elem=3;
//                 int a[]={2,3,4,5,6};
//                 for(int i=0;i<=a.length;i++){
//                         if(a[i]==pos){
//                                 a[i+1]=a[i];
//                                 break;
//                         }
//                         a[pos]=elem;
//                         for(i=0;i<=a.length;i++){
//                                 System.out.println(a[i]);
//                         }
//                 }
//         }
// }



// enter the array element at any particular position. second logic
// public class arrayprogram {

//         public static void main(String[] args) {
//                 int pos=4;
//                 int elem=100;
//                 int a[]={23,233,234,544,345,2443,244};
//                 for(int i=0;i<=a.length-1;i++){
//                         if(a[i]==pos){
//                                 a[i-1]=a[i];
//                                 break;
//                         }
//                         a[pos-1]=elem;
//                         for(i=0;i<=a.length-1;i++){
//                                 System.out.println(a[i]);
//                         }
                        
//                 }
//         }
// }
// 23
// 233
// 234
// 100
// 345
// 2443
// 244





//insert element at any particualr position this method traverse from last only
 // public class arrayprogram {
//                 public static void main(String[] args){
//                         int pos=4;
//                         int elem=100;
//                         int a[]={213,33,223,23,33,2,223,332};
//                         for(int i=a.length-1;i>=pos-1;i--){
//                                 if(a[i]==pos){
//                                         a[i]=a[i-1];
//                                         break;
//                                 }
                               
//                         a[pos-1]=elem;
//                                 for(i=0;i<=a.length;i++){
//                                         System.out.println(a[i]);
//                                 }
//                         }
//                 }
// }























































// public class arrayprogram {
//     static void bubblesort(int a[]){
//         int temp;
//         for(int i=0;i<=a.length;i++){
//             for(int j=1;j<a.length-1;j++){
//                 if(a[j-1]>a[j]){
//                     temp=a[j-1];
//                     a[j-1]=a[j];
//                      a[j]=temp;
//                     }}}}

//     public static void main(String[] args) {
//         int a[]={42,45,2,345,32,23,65,3244,54};
//         System.out.println("array before sortig is");
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.println(a[i]+" ");
//         }
//         System.out.println();

//         bubblesort(a);
//         for(int i=0;i<a.length;i++){
//                 System.out.println("array after soting is"+a[i] );
//         }}}
        // array before sortig is
        // 42 
        // 45 
        // 2 
        // 345 
        // 32 
        // 23 
        // 65 
        // 3244 
        // 54 
        
        // array after soting is2   
        // array after soting is23  
        // array after soting is32  
        // array after soting is42  
        // array after soting is45  
        // array after soting is65  
        // array after soting is345 
        // array after soting is3244
        // array after soting is54










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





















// /**
//  * arrayprogram
//  */
// public class arrayprogram {

//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int spaces=2*(5-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }

//             System.out.println(" ");
//         }
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int spaces=2*(5-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }

//             System.out.println(" ");
//         }
//     }
// }
// ********** 
// ****  **** 
// ***    *** 
// **      ** 
// *        * 
// *        * 
// **      ** 
// ***    *** 
// ****  **** 
// ********** 



























// /**
//  * arrayprogram
//  */
// public class arrayprogram {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int spaces=2*(5-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int spaces=2*(5-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }

//     }
// }
// *        * 
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *