import java.util.InputMismatchException;
import java.util.Scanner;

public class var11_1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int[][] arr = new int[x][x];
            int max = 1;
            for(int i = 1; i <= x; i++){
                for(int j = 1; j <= x; j++){
                    System.out.println("arr["+i+"]["+j+"]");
                    int k = sc.nextInt();
                    arr[i-1][j-1] = k;
                }
                if(arr[i-1][i-1] % 2 == 0){
                    max = arr[i-1][i-1];
                }
            }
            System.out.println("Массив:");
            for(int i = 0; i < x; i++){
                for(int j = 0; j < x; j++){
                    System.out.print("["+arr[i][j]+"] ");
                }
                System.out.println();
            }
            for(int i = 0; (i < x)&&(i < x); i++){
                if((arr[i][i] % 2 == 0) && (arr[i][i] > max)){
                    max = arr[i][i];
                }
            }
            if(max % 2 == 1){
                throw new RuntimeException();
            }else{
                System.out.println("Максимум среди четных чисел на главной диагонали");
                    System.out.println("["+max+"]");
            }
        }catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа");
        }catch (RuntimeException e) {
            System.out.println("Hет четных чисел");
        }
    }
}