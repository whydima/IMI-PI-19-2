public class ex4_13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            int h=10/l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ИНдекса нет");
        }
    }
}
