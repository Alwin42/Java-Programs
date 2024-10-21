import java.util.*;
class Eventhread extends Thread
        {
            private int num;
            public Eventhread(int num)
            {
                this.num=num;
            }
            public void run()
            {
                System.out.println("Square of the number "+ num +" = " + num*num);
            }

}
class Oddthread extends Thread
{
    private int num;
    public Oddthread(int num)
    {
        this.num=num;
    }
    public void run()
    {
        System.out.println("Cube of the number "+ num +" = " + num*num*num);   
    }
}

class Randomthread extends Thread
{
    public void run()
    {
        Random r = new Random();
        for(int i=0;i<10;i++)
        {
            int num= r.nextInt(100);
            if(num%2==0)
            {
                new Eventhread(num).start();
            }
            else{
                new Oddthread(num).start();
            }
        }
    }
}
class Test
{
    public static void main(String[] args) {
        Randomthread r = new Randomthread();
        r.start();

    }
}
