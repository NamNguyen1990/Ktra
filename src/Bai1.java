import java.util.Scanner;

public class Bai1 {

    public static int tim (int[] mang, int x) {
        for (int i=0; i< mang.length; i++) {
            if (mang[i] == x) {
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        int size;
        int t = 0;
        int a;
        int b;
        int c;
        int d;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        size = scanner.nextInt();
        int[] mang = new int[size];
//      vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i=0; i<size; i++) {
            System.out.println("Nhập vào phần tử thứ" + i + ":");
            mang[i] = scanner.nextInt(); // Nhập phần tử cho mảng
        }

        System.out.println("Mảng vừa nhập vào là:");
        for (int i=0; i<size; i++) {
            System.out.print(mang[i] + "\t"); // In ra mảng nhập vào
        }

        for (int i=0; i<size; i++) {
            if (mang[i]%2 == 0) {
                t = t+mang[i];
            }
        }
        System.out.println("Tổng chẵn là:" + t);


        System.out.println("Nhập a nào đi");
        a = scanner.nextInt();
        int pos = tim(mang, a);
        if (pos == -1) {
            System.out.println("Không tìm thấy");
        }
        else {
            System.out.println("Vị trí a trong mảng là" + pos);
        }

        System.out.println("Nhập b vào đi");
        b = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần thêm đi");
        d = scanner.nextInt();
        int[] e = new int[d];
        for (int i=0; i< e.length - 1; i++) {
            if (i<d-1) {
                e[i] = mang[i];
            }
            e[d-1] = b;
            if (i>d-1) {
                e[i] = mang[i-1];
            }
        }
       for (int i=0; i<d; i++) {
           System.out.println(e[i] + "");
       }
    }
}

