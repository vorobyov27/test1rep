package HomeworkException;

public class MyException1 extends Exception {

    public MyException1 (){
        super();
    }

    public String toString () {
        String res = "Вы ввели отрицательное значение";
        return res;
    }

}
