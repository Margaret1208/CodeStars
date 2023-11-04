import java.util.Scanner;

public class Heapsort {
    public void sort(int arr[]){
        int a = arr.length;

        // Xây dựng chương trình sắp xếp mảng
        for (int i= a/2 -1; i>=0; i--){
            heapify(arr,a,i);
        }

        // Trích xuất từng phần tử từ heap
        for (int i = a-1; i>0;i--) {
            // Di chuyen root tu hien tai den end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // goi max - heapify tren Heap da sap xep
            heapify(arr,i,0);
        }
    }
    void heapify(int arr[], int a, int i){
        int large = i; // khởi tạo large như root
        int l = 2*i;
        int r = 2*i+1;        //arr[1.9.4.2.7]

        // Nút con trái lơn hơn nút con gốc
        if (l<a && arr[l] > arr[large]){
            large = l;
        }
        //Nút con phải lớn hơn nút con gốc
        if (r < a && arr[r]>arr[large]){
            large = r;
        }
        //Nếu large không phải là root
        if (large != i){
            int index = arr[i];
            arr[i] = arr[large];
            arr[large] = index;

            // Vun đống lại các cây con bị ảnh hưởng
            heapify(arr,a,index);
        }
    }
    // In mang
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i =0; i <n; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main (String [] args){
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n<0);
        int arr[] = new int [n];

        // Nhap phan tu cho mang
        for (int i=0; i < n; i++){
            System.out.println("Nhập phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
        printArray(arr);

        Heapsort ob = new Heapsort();
        ob.sort(arr);

        System.out.println("Mang duoc sap xep la: ");
        printArray(arr);
    }
}
