
//PRACTISE FOR QUESTION FOR GETTER AND SETTER FUCNTION;

// package src;

// class vari{
//   public String name ;
//   protected int id;
//   private int password;

//   public int getpasword(){
//     return password;
//   };
//   public void setpassword(int pass){
//    password=pass;
//   };
//   vari(String name,int id,int password){
//     this.name=name;
//     this.id=id;
//     this.password=password;
//     System.out.println("my name is"+this.name+"my id is"+this.id+"and my password"+this.password);

//   }


// }



// public class ban1 {
//   public static void main(String[] args) {
//   vari v1=new vari("shivam", 056, 7823);
    
//   }

  
// }












// GETTER AND SETTER 

// package src;

// class sanjay{
//     public String name;
//     protected int accountno;
//     protected int ifcs;
//     private  int password;   //we cannot access or provide the values to private modifiers...for this we are usign the getter and setter methos
//     sanjay(String name,int accountno, int ifcs){
//         this.accountno=accountno;
//         this.ifcs=ifcs;
//         this.name=name;
//         System.out.println("My name is"+this.name+"and my accountno is"+this.accountno+"anf my ifsc is"+this.ifcs+"and my password is"+this.password);
//     };
//     public int getpasword(){
//         return this.password;  //her getter fucntion will only return the fucntion 
       
//     };
//     public void setpassword(int pass){
//         this.password=pass; // setter fucntion will help us to provide the values to the getter fucntion.
//         System.out.println("my password is"+this.password);
//     }

// }
// public class ban1 {

//     public static void main(String[] args) {
//         sanjay s1=new sanjay("SANJAY", 4021000, 44699);
//         s1.setpassword(12345);  ///here's how we can provide the values to it

        
//     }
// }