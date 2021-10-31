public class Kastbana {


  public static void main (String [] args) {
    System.out.println("Height: 0.615");
    new Kastbana(3.47542803119, 60);
    System.out.println(" ");
    System.out.println("Height: 0.630 ");
    new Kastbana(3.5175559697, 60);
    System.out.println(" ");
    System.out.println("Height: 0.600");
    new Kastbana(3.43278312743, 60);
  }

  public Kastbana(double V0, int Vinkel) {
    double VelocityY = V0 * (Math.sin(Math.toRadians(Vinkel)));
    double VelocityX = V0 * (Math.cos(Math.toRadians(Vinkel)));

    System.out.println("Question A");
    QuestionA(VelocityY, VelocityX);
    System.out.println("Question B");
    QuestionB(VelocityY, VelocityX);

    timeInterval(VelocityY, VelocityX);
  }

  private static void QuestionA(double VelocityY, double VelocityX) {
    double t = VelocityY/9.82;
    double TimeToZero = t * 2;

    double AnswerA = VelocityX * TimeToZero;
    System.out.println("Den landar " + AnswerA + " m från kanonen");
    System.out.println("Efter " + TimeToZero + " Sekunder");
    System.out.println(" ");
  }

  private static void QuestionB(double VelocityY, double VelocityX) {
    double height = 0.78;
    double b = (VelocityY * 2/9.82);
    double t = ((b) + (Math.sqrt((b*b) + (4 * (height*2/9.82)))))/2;

    double AnswerB = VelocityX * t;
    System.out.println("Den landar " + AnswerB + " m från kanonen om den faller av bordet");
    System.out.println("Efter " + t + " Sekunder");
    System.out.println(" ");
  }



  private static void timeInterval(double VelocityY, double VelocityX) {
    double time = 0;
    double dt = 0.2;


     while (time < 1) {
      double currentH = (VelocityY * time) - (9.82 * (time*time) / 2 );
      double currentD = VelocityX * time;

      System.out.println("Time: " + time + " s");
      System.out.println("Height: " + currentH);
      System.out.println("Distance: " + currentD);

      time = time + dt;
    }
  }
}