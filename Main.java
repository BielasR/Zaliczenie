import java.util.Random;
class Main 
{
  public static void main(String[] args) 
  {
    Random K =new Random();

    int K1 = K.nextInt(6) + 1;
    int K2 = K.nextInt(6) + 1;

    System.out.println("Wynik kostki 1: " + K1);
    System.out.println("Wynik kostki 2: " + K2);

    if(K1 == K2)
    {
      System.out.println("Wygrana");
    }
     else
       System.out.println("Przegrana"); 

    
  }
}