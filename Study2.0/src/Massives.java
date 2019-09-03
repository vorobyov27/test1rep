import java.util.Arrays;

public class Massives {

    public static void main(String[] args) {
        // Задача 8.8
/*
        int [] mas1 = new int[12];

        for (int i = 0; i < mas1.length; i++){
            mas1[i] = (int)(Math.random()*31 - 15);
            System.out.print(mas1[i]+" ");
        }
        System.out.println("");
        int max = mas1[0];
        int ind = 0;
        for (int i = 1; i < mas1.length; i++){
            if (mas1[i]>=max){
                max = mas1[i];
                ind = i;
            }
        }
        System.out.println("максимальный элемент = "+max);
        System.out.println("Индекс максимального элемента = "+ind);
*/
// Задача 8.2.5: варианты для проверки таблицы умножения
/*        int [] P = new int[15];
        boolean needRandom = true;
        int a = 0;
        int b = 0;
        for (int i = 0; i<15; i++){
            needRandom = true;
            while (needRandom) {

                a = randomizeInt();
                b = randomizeInt();
                int c = a*b;

                if (i == 0) {   //обработка нулевого i
                    P[i] =c;
                    needRandom = false;
                }
                else  { //проверяем, повторяется ли произведение чисел в нашем массиве
                    for ( int j = 0; j<i; j++) {
                        if (P[j]==c) {
                        needRandom = true;
                        break;
                        }
                        else needRandom = false;
                    }
                    P[i] = c;
                }
            }
            System.out.println("Пример"+(i+1)+": "+a+" * "+b);
        }*/
// Задача 8.2.4 создать двумерный массив 6х7, отсортировать каждую строку, чтобы макс элемент был вначале
        int temp = 0;
        System.out.println("Исходный массив:");
        int [][] m = new int[6][7];
            for (int i=0;i<6;i++){
                for (int j=0;j<7;j++){
                    m[i][j] = randomizeInt();
                    System.out.print(m[i][j]+" ");
                }
                System.out.println(" ");
            }
            for (int i=0;i<6;i++){
                for (int j=6;j>0; j--){
                    if (m[i][j]>m[i][j-1]){
                        temp = m[i][j-1];
                        m[i][j-1] = m[i][j];
                        m[i][j] = temp;
                    }
                }
            }
        System.out.println("Отсортированный массив: ");
            for (int i=0;i<6;i++){
                for (int j=0;j<7;j++){
                    System.out.print(m[i][j]+" ");
                }
            System.out.println(" ");
            }
    }

    public static int randomizeInt (){
 //       int x = (int)(Math.random()*8+2);
        return ((int)(Math.random()*8+2));
    }
}