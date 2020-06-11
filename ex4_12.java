public class ex4_12 {
    public static void m(String str, double chislo){
        if (str==null) {
            throw new IllegalArgumentException("Неверная строка");
        }
        if (chislo>0.001) {
            throw new IllegalArgumentException("Неверное число");
        } }

    public static void main(String[] args) {
        m(null,0.000001);
    }
}
