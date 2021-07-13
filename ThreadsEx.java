public class ThreadsEx{
    public static void main(String[] args) {
        Thread1 p1=new Thread1();
        Thread2 p2=new Thread2();
        Thread3 p3=new Thread3();
        p1.start();
        p2.start();
        p3.start();
    }
}
class Thread1 extends Thread{
    synchronized public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Good Morning");
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
class Thread2 extends Thread{
    synchronized public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
class Thread3 extends Thread{
    synchronized public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Welcome");
            try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
