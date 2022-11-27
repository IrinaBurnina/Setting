package lyambda;
@FunctionalInterface
interface BinaryOperator<Integer> {
    int apply(int x, int y);
}
