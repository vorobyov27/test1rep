import java.util.Scanner;
public class Circle {
    public double x;
    public double y;
    public double r;

    public Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        if (sc.hasNextDouble()){
            x = sc.nextDouble();
        }
        else System.out.println("Введена хрень");

        System.out.println("Введите y");
        if (sc.hasNextDouble()){
            y = sc.nextDouble();
        }
        else System.out.println("Введена хрень");

        System.out.println("Введите r");
        if (sc.hasNextDouble()){
            r = sc.nextDouble();
        }
        else System.out.println("Введена хрень");
    }

    public static double dlinaOkr (double rad){
       return 3.14*2*rad;
    }

    public static void moveCenter (Circle anyCir){
        anyCir.x = (int)(Math.random()*199)-99;
        anyCir.y = (int)(Math.random()*199)-99;
    }
    public static double distanceCircle (Circle anyCir1, Circle anyCir2){
        double a;
        double b;
        double xmax, xmin;
        double ymax, ymin;
        //вычисляем какой из Х координат больше, какой меньше
        if (anyCir1.x>anyCir2.x){
            xmax = anyCir1.x;
            xmin = anyCir2.x;
        }
        else {
            xmax = anyCir2.x;
            xmin = anyCir1.x;
        }
        //вычисляем какой из У координат больше, какой меньше
        if (anyCir1.y>anyCir2.y){
            ymax = anyCir1.y;
            ymin = anyCir2.y;
        }
        else {
            ymax = anyCir2.y;
            ymin = anyCir1.y;
        }
        // вычисляем катеты "треугольника". Гиппотенузой будет искомое расстояние
        a = xmax - xmin;
        b = ymax - ymin;
        // находим длину гиппотенузы
        double dist = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return dist;
    }

    public static void isOnePoint (Circle anyCirc1, Circle anyCirc2){
        boolean onePoint = false;
        boolean cirсEqual = false;
        if (distanceCircle(anyCirc1, anyCirc2)==anyCirc1.r+anyCirc2.r){
                onePoint = true;
        }
        else if (distanceCircle(anyCirc1, anyCirc2)==Math.abs(anyCirc1.r-anyCirc2.r)) {
                onePoint = true;
        }
        if (distanceCircle(anyCirc1, anyCirc2)==0){
            onePoint = false;
            cirсEqual = true;
        }

        if (onePoint){
            System.out.println("Окружности касаются в одной точке");
        }
        else System.out.println("Окружности не касаются в одной точке");
        if (cirсEqual){
            System.out.println("Окружности совпадают");
        }
    }

}
