public class Massives {

    public static void main(String[] args) {
        // Задача 8.8
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

    }
}
// test comment