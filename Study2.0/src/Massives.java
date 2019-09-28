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
/*        int temp = 0;
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
            }*/
// Задача 8.2.3: двумерный массив, зарандомить -5 5, вывести индекс строки с наибольшим по модулю произведением элементов.

/*        int multiply = 1;
        int max = 1;
        int maxInd = 10;
        System.out.println("Исходный массив:");
        int [][] m = new int[7][4];
            for (int i=0;i<7;i++){
                for (int j=0;j<4;j++){
                    m[i][j] = randomizeInt();
                    System.out.print(m[i][j]+" ");
                }
                System.out.println(" ");
            }
            for (int i=0;i<7;i++){
                for (int j=0;j<4; j++){
                    multiply = multiply*Math.abs(m[i][j]);
                }
                if (multiply > max){
                    max = multiply;
                    multiply = 1;
                    maxInd = i;
                }
                else multiply = 1;
            }
        System.out.println("Индекс строки с max произведением = "+ maxInd);*/

// 9.1.1 - метод рандомайза [a,b]. Заполнить массив.
/*        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = randomizeIntAB(-2,7);
            System.out.print(mas[i]+" ");
        }*/
// 9.1.2 - создать массив и вывести на экран через свои методы
/*    int[] mas1 = new int[10];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = randomizeIntAB(-5,5);
        }
        printArr(mas1);*/

// 9.1.4 - массив из 7ми строк. Отсортировать и вывести по возрастанию заглавной буквы
/*        String[] masStr = {"Лермонтов М.Ю.","Есенин","Акунин Б.","Толстой Л.Н.","Толстой А.Н.","Пушкин А.С","Достоевский "};
        sortArrayPuz(masStr);
        printArr(masStr);*/

// 10.1.3 создание окружности с вводимыми координатами
    Circle cr1 = new Circle();
        System.out.println("Координата центра: ("+cr1.x+","+cr1.y+")"+"; Радиус: "+cr1.r);
/*        System.out.println("Длина окружности = "+ cr1.dlinaOkr(cr1.r));
        cr1.moveCenter(cr1);
        System.out.println("Рандомно сдвигаем центр в ("+cr1.x+","+cr1.y+")");*/
    Circle cr2 = new Circle();
        System.out.println("Координата центра: ("+cr2.x+","+cr2.y+")"+"; Радиус: "+cr2.r);
        System.out.println("Расстояние между центрами окружностей: "+cr1.distanceCircle(cr1,cr2));
    cr1.isOnePoint(cr1,cr2);
    }

    public static int randomizeInt (){
         return ((int)(Math.random()*11)-5);
    }

    //метод рандомайза элемента из отрезка [a,b]
    public static int randomizeIntAB (int a, int b){
        return ((int)(Math.random()*(b-a+1))+a);
    }

    // методы выводит входящий массив в строку
    public static void printArr (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    // распечатывает массив строк в столбик
    public static void printArr (String arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }


    // метод сортирует входящий массив. задача 9.1.3
    public static void sortArrayPuz (int inputArr[]){
        for (int i=inputArr.length-1;i>1;i--){
            boolean sorted = true;
            for (int j=0;j<i; j++){
                if (inputArr[j]>inputArr[j+1]){
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j+1];
                    inputArr[j+1] = temp;
                    sorted = false;
                }
            }
            if (sorted){
                break;
            }
        }
    }
    public static void sortArrayPuz (String inputArr[]){
        for (int i=inputArr.length-1;i>1;i--){
            boolean sorted = true;
            for (int j=0;j<i; j++){
                if (inputArr[j].compareTo(inputArr[j+1])>0){
                    String temp = inputArr[j];
                    inputArr[j] = inputArr[j+1];
                    inputArr[j+1] = temp;
                    sorted = false;
                }
            }
            if (sorted){
                break;
            }
        }
    }

}