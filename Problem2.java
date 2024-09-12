public class Problem0
{
  public static void main(String[] args)
  {
    int number = 123;
    int digit1 = (number % 10); // print 3
    number = number / 10;  //make number 12

    int digit2 = (number % 10); // print 2
    number = number / 10;  //make number 2

    int digit3 = (number % 10); // print 1
    number = number / 10;  //make number 0
    System.out.println(digit1);
    System.out.println(digit2);
    System.out.println(digit3);
  }
}

