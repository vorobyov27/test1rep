import java.util.Scanner;

public class Chapter1 {
    public static void main (String[] args){

  //      задача 2.1
 /*           int q = 21;
            int w = 15;
            System.out.println(q+" / "+w+" = "+q/w+" и "+q%w+" в остатке.");
 */

// Задача 2.2
/*        int q = 49;
        System.out.println("Сумма цифр числа = "+((q/10)+(q%10)));
*/

// Задача 3a.3
/*       int a = 1236777;
       int res =  (int)Math.ceil(Math.log10(Math.abs(a) + 0.5));
       System.out.println(res);*/

// Задача 7.5; 2 3 5 9 17 33 65 129 257 513 1025 2049 4097 8193
/*        for (int a = 2; a<10000; a=2*a-1){
            System.out.print(a + " ");
        }*/

// Задача 7.6; -64 72
/*        int res;
        for (int a = -166; true; a=2*a+200){
            if ((1<(Math.abs(a/10)))&&Math.abs(a/10)<10){
                res = a;
                System.out.print(res + " ");
            }
         else if ((a/10)>10){
              break;
            }

        }*/
// Задача 7.10; 12 первых элементов последовательности  2а(n-2)-2, где a1 = 3, a2 = 2.
/*        for (int a = 3, int i = 1; i<13; i++){
            System.out.print(a + " ");
        }*/

// Задача 7.12 - для введённого нат числа посчитать сумму цифр
/*    Scanner sc = new Scanner(System.in);
    int d=1;
    System.out.print("Введите целое число: ");
    if(sc.hasNextInt()) {
        d = sc.nextInt();

        int digAmount =  (int)Math.ceil(Math.log10(Math.abs(d) + 0.5)); //вычисление кол-ва цифр в числе
        if (digAmount == 1){
            System.out.println("Сумма цифр равна "+d); //если кол-во цифр = 1. Сумма цифр и есть само число
        }
        else {
            int sum = 0;
            int delimoe = Math.abs(d);
            int delitel = 0;
            int cifra = 0;
            for (int i = digAmount-1; i>=0;i--){
                delitel = (int)Math.pow(10,i);
                cifra = delimoe/delitel;
                sum = sum + cifra;
                delimoe = delimoe - (cifra*delitel);
            }
            System.out.println("Сумма цифр равна "+sum);
        }
    }
    else {
        System.out.println("Число не целое");
    }*/

    }
}
