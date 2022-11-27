package lyambda;

public class Calculator implements Supplier, BinaryOperator, UnaryOperator, Consumer, Predicate {

    @Override
    public Calculator get() {
        return new Calculator();
    }

    public Calculator() {
    }

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("На ноль делить нельзя! Вычисление не произведено.");
            return 9999999;
        }
    };// y != 0 ? x / y : 9999999; - реализация через тернарный оператор
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Boolean> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

    @Override
    public int apply(int x, int y) {
        return 0;
    }

    @Override
    public void accept(int c) {

    }

    @Override
    public boolean isPositive(int x) {
        return false;
    }

    @Override
    public int operator(int x) {
        return 0;
    }
}
