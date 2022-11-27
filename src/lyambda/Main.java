package lyambda;

public class Main {

    public static void main(String[] args) {
        Calculator calc=Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);//ошибка заключается в том, что при значениях пар х и у, равных 1, значение b=0
        int c = calc.devide.apply(a, b);//если b=0, то будет производиться деление на ноль, что математически неправильно
        calc.println.accept(c);//решение данной ошибки - прописать условие, что делитель не может быть равен 0 и вычисление не производить
    }
}
