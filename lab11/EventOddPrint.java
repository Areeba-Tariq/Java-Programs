class EvenThread extends Thread
{
    public  void run()
    {
        for(int i=0;i<=10;i=i+2)
        {
            System.out.println("Even"+i);
            try{
                sleep(1000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
        }
        
    }
    
}
}

class OddThread extends Thread
{
    public  void run()
    {
        for(int i=1;i<=9;i=i+2)
        {
            System.out.println("Odd"+i);
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
        
        EvenThread e=new EvenThread();
        OddThread o=new OddThread();
        
        e.start();
        o.start();
    }  
}
