import java.util.Scanner;

public class ExerciseArray {
    public static void main(String[] args) {
        int n, sum =0, index, min = 0, max =0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n<0);

        int[] arr = new int [n];
        System.out.println("Nhập phần tử trong mảng \n");
        for (int i = 0; i < n; i++){
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr [i] = sc.nextInt();
        }

        //Nhập phần tử vào mảng
        System.out.println("\n_________________________________________________________\n" );
        System.out.println("Mảng đã nhập là: \n");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + "\t");
        }

        //Thực hiện phép tính tổng các giá trị phần tử trong mảng
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        System.out.println("\n_________________________________________________________\n" );
        System.out.println("Tổng các phần tử trong mảng: " + sum + "\n");

        /*------------------------------------------------*/
        // Sắp xếp mảng giảm dần
        for (int i =0; i < n -1 ; i++) {
            for (int j = i+1; j <= n -1; j++) {
                if (arr[i]<arr[j]) {
                     index = arr[i];
                     arr[i] = arr[j];
                     arr[j] = index;
                }
            }
        }
        System.out.println("\n_________________________________________________________\n" );
        System.out.println("Mảng được sắp xếp là: " );
        for (int i = 0; i < n; i++){
            System.out.println (arr[i] + "\t");
        }
        // Giá trị max min
        System.out.println("\nPhần tử min: " + arr[n-1]);
        /*------------------------------------------*/
        // Sắp xếp mảng tăng dần
        for (int i =0; i < n -1 ; i++) {
            for (int j = i+1; j <= n -1; j++) {
                if (arr[i]>arr[j]) {
                    index = arr[i];
                    arr[i] = arr[j];
                    arr[j] = index;
                }
            }
        }
        System.out.println("\n_________________________________________________________\n" );
        System.out.println("\nMảng được sắp xếp là: " );
        for (int i = 0; i < n; i++){
            System.out.println (arr[i] + "\t");
        }
        // Giá trị max min
        System.out.println("\nPhần tử max: " + arr[n-1]);
        System.out.println("Hello world!");
    }
}