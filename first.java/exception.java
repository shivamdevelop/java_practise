// import java.io.FileInputStream;

// public class exception {

//     public static void main(String[] args) {
//         try {                                                                   
//              FileInputStream fis=new FileInputStream("d:/abc.xttt");        run time exception
//         } catch (Exception e) { 
//             System.out.println(e+"not found ");
//         }
//         System.out.println("hello java ");

//     }
// }

 


// public class exception {

//     public static void main(String[] args) {
//         try {
//             Class.forName("OOPS PRACTESESET.java");          COMPILE TIME EXCEPTION
//             } catch (Exception e) {
//            System.out.println(e+" "+"Not found");
//         }
//     }
// } 

// public class exception {

//     public static void main(String[] args) {
//        String name=null;
//        try {
    
//     System.out.println(name.length());

       
//        } catch (Exception e) {
//         System.out.println(e+"is the reason");
        
      
//     }
// }
// }


// public class exception {

//     public static void main(String[] args) {
//         try {
//             int a=100;
//             int b=0;
//             int c=a/b;
//             System.out.println(c);
            
//         } catch (Exception e) {
//             System.out.println("1"+e);
//             e.printStackTrace();                     //Exception handling mehtods:
//             System.out.println(e.toString()+"3");        //printstacktrace(); toString(); getMessage();
//             System.out.println(e.getMessage()+"4");
//         }
       
//     }
// }

// public class exception {

// public static void main(String[] args) {
//     try {
//         int a=100;
//             int b=0;
//             int c=a/b;
//             System.out.println(c);
                                                        //   using the finally keyword
//     } catch (Exception e) {
//         e.printStackTrace();
//     }
//     finally{
//         System.out.println("Now here I'm in the finlly block");

//     }
    
// }
// }



// //    1  Basic Exception Handling
// public class exception {

//     public static void main(String[] args) {
//         try {
//             int a=100;
//             int b=0;
//             int c=a/b;
//             System.out.println(c);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }finally{
//         System.out.println("I am in the finally block");;
//         }
//      }
// }




// class YoungAgeException extends RuntimeException{
//     YoungAgeException(String msg){
//         super(msg);
//     }
// };

// class show{
//     public static void main(String[] args) {                  THROW practise
//         int  age=17;
//         if(age<18){
//             throw new YoungAgeException("You are under age");
//         }else{
//             throw new YoungAgeException("You are over age");
//         }
//     }
// }

// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;

// class Readwrite{
//     void reafile() throws FileNotFoundException{
//         FileInputStream fis=new FileInputStream("./OOPS.java");
//         System.out.println("File Opened successfully");
        
//     };
//     void writefile() throws FileNotFoundException{
//         FileOutputStream fos=new FileOutputStream("./write.java");          THROWS PRACTISE
//         System.out.println("Content written");
//     }
// };

// class show{
//     public static void main(String[] args) {
//         Readwrite rw=new Readwrite();
//         try {
//             rw.reafile();
            
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         }
//     }
// }



  
//    PRACTISE STARTS HERE
// 1.
// class exception{
//     public static void main(String[] args) {
//        try {
//         int a=100;
//         int b=0;
//         int c=a/b;
//         System.out.println("Result is "+c);
//        } catch (ArithmeticException e) {
//         // might thorw Arithmetic exception;
//        e.printStackTrace();
//         System.out.println("Arithmetic Ecxeption number cannot divided by 0"+e);
//        }finally{
//         System.out.println("I am in the fianlly block");
//        }
//     }
// }



// // 2.
// class exception{
//     public static void main(String[] args) {
//     try {
//         String name="SHIVAM";
//      int length=name.length();
//         System.out.println(length);
//      } catch (NullPointerException e) {
//         e.printStackTrace();

//     }finally{
//         System.out.println("I am inthe finally block");
//     }
//     }

// }

// 3.Reading the file and file not found exception

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.FileReader;
// import java.io.IOException;

// public class exception {
//     public static void main(String[] args) {
//         try {
//             File file=new File("./OOPS.java");
//             FileInputStream fis =new FileInputStream(file);
//             FileOutputStream fod=new FileOutputStream("./otput.java");
//             FileReader fileReader=new FileReader("exception.java");
//             BufferedReader br=new BufferedReader(fileReader);
//             br.readLine();
//             fod.close();
//             br.close();
    
            
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//             System.out.println("File not found error"+" "+e);
//         }  catch(IOException e){
//             e.printStackTrace();
//             System.out.println("File not found exception"+" "+e);
//         }finally{
//             System.out.println("Finally I am in the finally block");
//         }
      
//     }
// }



class agedefaultmsg extends RuntimeException{
    agedefaultmsg(String msg){
        super(msg);
    }
};

class check { 
    public static void main(String[] args) {
        try {int age=17;
            if(age>18){
                throw new  agedefaultmsg("ypu are over age");
            } else if(age<18){
                throw new agedefaultmsg("you are under age");
            }
            
        } catch (Exception e) {
           e.printStackTrace();
           e.toString();
           e.getMessage();
           System.out.println("Error is"+e);
        }
    
    
}
}