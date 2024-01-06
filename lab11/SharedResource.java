class sharedResource 
{
  public static int counter=0;   
  
  public synchronized  static void IncrementCounter()
  {
      counter++;
  }
  public synchronized static void displayCount()
  {
      System.out.println("Counter value "+counter);
  }
}
class ThreadTypeA extends Thread
{
    public void run()
    {
        while(sharedResource.counter!=5){
        sharedResource.IncrementCounter();
        sharedResource.displayCount();
        try{
                sleep(1000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
        }
        }
    }
}

class ThreadTypeB extends Thread
{
    public  void run()
    {
        while(sharedResource.counter!=5){
        sharedResource.IncrementCounter();
        sharedResource.displayCount();
            try{
                sleep(1000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
        }
    }
    
}
}

public class PrepFinal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          ThreadTypeA e=new ThreadTypeA();
         ThreadTypeB o=new ThreadTypeB();
        
        e.start();
        o.start();
    }  
}
