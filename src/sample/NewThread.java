package sample;

public class NewThread extends Thread {

    public void run(){
        System.out.println("     Nowy watek : POCZATEK");
        try { for(int i = 5; i > 0; i--){
        Thread.sleep(500);
        }
        } catch (InterruptedException e) {}      System.out.println("     Nowy watek : KONIEC");
    }


}
