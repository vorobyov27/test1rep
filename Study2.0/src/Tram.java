public class Tram {

    public static int sumDig(int x){
        int sum = 0;
        while(x != 0){
            //Суммирование цифр числа
            sum = sum + (x % 10);
            x = x / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
/*        int r = 234682;
        int s = sumDig(r);
        System.out.println(s);*/
    int kol = 0;
    for (int i = 1000; i<=999999;i++){
        int p1 = i%1000;
        int s1 = sumDig(p1);

        int p2 = i/1000;
        int s2 = sumDig(p2);

        if (s1 == s2){
            kol = kol+1;
        }
    }
        System.out.println("кол-во счастливых билетов = "+kol);
    }
}