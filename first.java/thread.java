//                   //their are two different ways to create the thread


// // 1.By using the thread class.

// class Test extends Thread{
//     public void run(){
//         System.out.println("I am te thread process");
//     }
//     public static void main(String[] args) {
//         {
//             Test t=new Test();
//             t.start();
//         }
//     }
// }
//  // 2.second is by Implementing the runnable Interface

//  class test implements Runnable{
//     public void run(){
//         System.out.println("I am the best");
//     }public static void main(String[] args) {
//         test t =new test();
//         Thread th=new Thread(t);
//         th.start();
//     }
// }

//                     // Performing single task from single thread:

// class test extends Thread{
//     public void run()
            // {

//         System.out.println("I am the best");
//             }
//     public static void main(String[] args){
//             {
//             test t=new test();
//             t.start();
//             }
//          }
//       }

                       // performing signle task from multiple thread:

// public class thread extends Thread {
//     public void run(){
//         System.out.println("acheving multiple task from single");
//     }
//     public static void main(String[] args) {
//        thread th=new thread();
//        th.start();
//        thread th1=new thread();
//        th1.start(); 
//     }  
// }


                         //performing the multiple task from multiple thread;

//  class thread extends Thread{
//     public void run(){
//         System.out.println("Multiple task from single thread");
//     }
// }
// class thread2 extends Thread{
//     public void run(){
//         System.out.println("task2");
//     }
// }
// class main{
//     public static void main(String[] args) {
//         thread th=new thread();
//         th.start(); 
//         thread2 t2=new thread2();
//         t2.start();
//     }
// }


               // thread methods  getname() and setname(); 



            //   class test{
            //    public static void main(String[] args) {
            //         System.out.println(Thread.currentThread().getName());
            //         Thread.currentThread().setName("verma ji");
            //         System.out.println("new thread name is "+Thread.currentThread().getName());
                    
            //     }
            //    }

     
     
     
     
       
    //     class test extends Thread{
    //     public void run(){
    //         System.out.println("It  has been printed by "+Thread.currentThread().getName());
    //         Thread.currentThread().setName("SHIVAM");
    //         System.out.println("It  has been printed by "+Thread.currentThread().getName());
    //         }
    //     public static void main(String[] args) {
    //         test t=new test();
    //         t.start();
    //         System.out.println("It has been printd by the"+ " "+Thread.currentThread().getName());
    //     }
    //    }


     
    // class test extends Thread{
    //     public void run(){
    //         System.out.println("shut up");
    //     }
    //     public static void main(String[] args) {
    //         test t=new test();
    //         t.setName("I am the main");
    //         t.start();
    //         System.out.println(Thread.currentThread().getName());
           
            
    //     }
    // }



    // Daemon Thread mathods isdeamon() and get deamon();
    // deamon thread  are those which runs in someone's background and  it provides the service to the threads..
    //     ex:garbage collector ,finalizer
//     we need to create the deamon thread before teh start method,else will throw the run time error.
//     we cannot create the main method as deamon thread.


  
//    class test extends Thread{
//         public void run(){
                
//               System.out.println(Thread.currentThread().isDaemon());
//               System.out.println("child thread");
//         }
//         public static void main(String[] args) {
//                 System.out.println("Main Thread");
//                 test t=new test();
//                 t.setDaemon(false);
//                 t.start();
//         }
//    }

// class test extends Thread{
//         public void run(){
               

//              if(Thread.currentThread().isDaemon()){
//                  System.out.println("I am the Daemon Thread");
//              }else{
//                  System.out.println("I am the best");
//           }
//         }
//         public static void main(String[] args) {
//                 test t = new test();
//                 t.setDaemon(true);
//                 t.start();
//         }
// }



// class test extends Thread
// {
//         public void run(){
//                 System.out.println(Thread.currentThread().getName());
//                 System.out.println(Thread.currentThread().isDaemon());
//                 if(Thread.currentThread().isDaemon()){
//                         System.out.println("I ma teh daemon thread");
//                 }
//                 else{System.out.println("I ma the child Thread");
//                 }
//         }
//         public static void main(String[] args) {
//                 test t=new test();
//                 t.setName("verma jii");
//                 t.setDaemon(true);
//                 t.start();
//         }
// }
 
    

                    // Priority Threads
                    // priority are inherited from Default parent Thread
                    // By default priority of main is 5.
//         class test extends Thread{
//         public void run(){
//                 System.out.println("I am teh child class");
//                 System.out.println(Thread.currentThread().getPriority());
//         }
//         public static void main(String[] args) {
//                 test t=new test();
//                 System.out.println(Thread.currentThread().getPriority());
//                 t.start();
//         }
// } 





// class test extends Thread{
//     public  void run(){
//         System.out.println("I am teh child Thread");
//         System.out.println("Child Thread Priority is"+Thread.currentThread().getPriority());
//         Thread.currentThread().setPriority(1);
//         System.out.println("New priority of the child Thread is"+Thread.currentThread().getPriority());

//     }
//     public static void main(String[] args) {
//         System.out.println("Main Thread Priority"+Thread.currentThread().getPriority());
//         Thread.currentThread().setPriority(10);
//         System.out.println("New priority of the main thread is"+Thread.currentThread().getPriority());
//         test t=new test();
//         t.start();
//     }
// }






                      // Prevent Thread Execution Method
                          // SLEEP();
                          // Yield();
                          // Join()
                          
                      //a.SLEEP method:sleep method generally stops the execution of that
                      //  particualr method for few milli seconds of the time..
 

                        // class test{
                        //     public static void main(String[] args) {
                        //         for(int i=1;i<=5;i++){
                        //             try {
                        //                 Thread.sleep(1000);
                        //                 System.out.println(i);
                                        
                        //             } catch (Exception e) {
                        //                 e.getStackTrace();
                        //             }
                                    
                        //         }
                        //     }
                        // }

                                        // AND


// class test extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             try {
//                 System.out.println(i);
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
//     public static void main(String[] args) {
//         test t=new test();
//         t.start();
//     }
// }
    

            

             //  B.Yield method 
             // Yield method stops the execution of current method and gives the priortiy to high priorty methods
             // to maintain theri execution.


// class test extends Thread{
//   public void run(){
//     try {
//       Thread.yield();
//       System.out.println("I am child class");
//       for(int i=0;i<10;i++){
//         System.out.println(i+" "+Thread.currentThread().getName());
       
//       }
//     } catch (Exception e) {
//       e.printStackTrace();
//     }
    
//   }
//   public static void main(String[] args) {
//     test t=new test();
//     t.run();
//     t.setPriority(10);
//     // Thread.yield();
//     System.out.println("I am the main class");
//     for(int i=0;i<=10;i++){
//       System.out.println(Thread.currentThread().getName());

//     }
//   }
// }


        //  c.Join() method.
        //     join method is used to execute the thread just after the completion of currentky running Thread..
        //     join method generally start's the execution of the waiting Thread just after finishing the currently running thread 




        // class Test extends Thread{
        //   public void run(){
        //     for(int i=1;i<=5;i++){
        //       try {
        //         Thread.sleep(1000);
        //         System.out.println("Child Thread"+" "+i);
        //       } catch (Exception e) {
        //         System.out.println(e);
        //       }

        //     }
        //   }
        //   public static void main(String[] args) throws InterruptedException {
        //     Test t=new Test();
        //     t.start();
        //     t.join();    
        //     // Thread.yield();
        //     for(int i=1;i<=5;i++){
        //       try {
        //         Thread.sleep(1000);
        //         System.out.println("Main Thread"+" "+i);
        //       } catch (Exception e) {
        //         System.out.println(e);
        //       }

        //     }
        //   }
        // }


                            //  Interrupting Method's
                            // They are used to interruot an exception...
                            // They are only used with the sleep and yield  method
                            // Types are:interrupt();isInterrupt();inInterruput();  

                            // class test extends Thread{
                            //   public void run(){
                            //     for(int i=0;i<=5;i++){
                            //       try {
                            //         Thread.sleep(1000);
                            //         System.out.println(i);
                                    
                            //       } catch (Exception e) {
                            //       System.out.println("Thread interrupted"+" "+e);
                            //       }
                                  
                            //     }
                            //   }
                            //   public static void main(String[] args) {
                            //     test t= new test();
                            //     t.start();
                            //     t.interrupt();
                            //   }
                            // }
                    
            

// Iterruoted() and Isinterrupt method is used to chec whether the interruotion is occur 


