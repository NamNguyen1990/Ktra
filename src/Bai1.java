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


        System.out.println("Nhập số cần tìm vào đi");
        a = scanner.nextInt();
        int pos = tim(mang, a);
        if (pos == -1) {
            System.out.println("Không tìm thấy");
        }
        else {
            System.out.println("Vị trí số đã nhập trong mảng là:" + pos);
        }

        System.out.println("Nhập vào số cần xóa:");
        int soCanXoa = scanner.nextInt();
        int viTriXoa = tim(mang, soCanXoa);
        int[] mangMoi = new int[mang.length - 1];
        for (int i=0; i<viTriXoa; i++) {
            mangMoi[i] = mang[i];
        }
        for (int i=viTriXoa; i<mang.length -1; i++) {
            mangMoi[i] = mang[i+1];
        }
        mang = mangMoi;
        System.out.println("Mảng mới sau khi xóa sẽ là:");
        for (int i=0; i<mang.length; i++) {
            System.out.print(mang[i] + "\t");
        }

        System.out.println("\n Nhập số muốn thêm vào đi");
        b = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần thêm đi");
        d = scanner.nextInt();
        int[] e = new int[mang.length + 1];
        for (int i=0; i< e.length; i++) {
            if (i<d) {
                e[i] = mang[i];
            }
            e[d] = b;
            if (i>d) {
                e[i] = mang[i-1];
            }
        }
        System.out.println("Mảng mới sẽ là:");
        for (int i=0; i<e.length; i++) {
           System.out.println(e[i] + "");
       }
    }
}

