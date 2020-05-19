import java.util.Scanner;

public class calculator {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数值");
        int console1=sc.nextInt();
        Scanner en=new Scanner(System.in);
        System.out.println("请输入第二个数值");
       int console2=en.nextInt();
       Scanner co=new Scanner(System.in);
       System.out.println("请输入运算符号");
       char console3=co.next().charAt(0);


        switch(console3){
             case '+':
                jia(console1,console2);
               break;
         case '-':
                  jian(console1,console2);
                  break;
      case '*':
               cheng(console1,console2);
                break;
       case '/':
                 chu(console1,console2);
            break;
       default:
         System.out.println("您输入的格式有误！");
     break;
      }


}

    private static void chu(int console1, int console2) {
        int div=console1/console2;
        System.out.println(div);
    }

    private static void  jia(int console1, int console2) {
        int sum=console1+console2;
        System.out.println(sum);
    }

    private static void jian(int console1, int console2) {
        int cl=console1-console2;
        System.out.println(cl);
    }

    private static void cheng(int console1, int console2) {
        int col=console1*console2;
        System.out.println(col);
    }
}
