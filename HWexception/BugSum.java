package HomeworkException;

public class BugSum {
    public static void main(String[] args) {
         try {
             int a = 2;
             int b = 3;
             int c = -1;
             System.out.println("Сумма багов = "+sum(a,b,c));
        }
        catch (MyException1 e) {
             System.out.println("Сработало исключение: " + e);
        }
    }

    public static int sum (int x, int y, int z) throws MyException1 {
        if (x<0 || y<0 || z<0) {
            throw new MyException1();
        }
        int s = x + y + z;
        return s;
    }
}
