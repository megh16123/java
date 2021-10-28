// import java.util.Calendar;
// import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//the class that represents a task
class score{
  public static int score = 0;
 void incre(){
     score++;
 } 
}
class t2 extends TimerTask{
   public void run(){
       System.out.println("hello ji sab changa ?");
   }
}
class tasktime extends TimerTask{
   int time = 0;
    public void run(){
        t2 t = new t2();
        Timer t1 = new Timer();

      if(time == 30){
          System.out.println("Complete");
          System.out.println(score.score);
         t1.schedule(t,0);
          cancel();

      }
      else{
          time++;
      }
       
    
    }
}


public class timer {
    public static void main(String[] args) {
       tasktime t1 = new tasktime();
       score s = new score();
       Timer timer = new Timer();
       timer.schedule(t1, 0,1000); 
       for(int i = 0; i <40;i++){
         System.out.println("moshi moshi "+i);
         s.incre();
       }


        
    }
}
