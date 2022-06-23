import java.util.Scanner;
class switchcase
{
      public static void main(String[]args)
      {
       int a,b,n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your choise case");
       n=sc.nextInt();

       switch(n)
         {
           case 1:
            {
             System.out.println("Enter two number");
              a=sc.nextInt();
              b=sc.nextInt();
              System.out.println("Addition="+(a+b));
              break;
            }
            case 2:
            {
             System.out.println("Enter two number");
              a=sc.nextInt();
              b=sc.nextInt();
              System.out.println("Substraction="+(a-b));
              break;
            }
             case 3:
            {
             System.out.println("Enter two number");
              a=sc.nextInt();
              b=sc.nextInt();
              System.out.println("Multiplication="+(a*b));
              break;
            }
              case 4:
            {
             System.out.println("Enter two number");
              a=sc.nextInt();
              b=sc.nextInt();
              System.out.println("Division="+(a/b));
              break;
            }
       
      }

}
}