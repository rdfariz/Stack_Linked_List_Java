import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        Scanner input = new Scanner(System.in);
        boolean log = true;
        System.out.print("Masukkan Ukuran Stack: ");
        int nStack = input.nextInt();
        int i = 0;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. View");
            System.out.println("4. Exit");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            if (pilih == 1) {
                if (i == nStack){
                    System.out.println("Stack Sudah Maksimal\n");
                }else {
                    System.out.print("Nama: ");
                    String nama = input.next();
                    System.out.print("Sakit: ");
                    String sakit = input.next();
                    stack.push(nama, sakit);
                    System.out.println("Data berhasil diPush\n");
                }
            } else if (pilih == 2) {
                stack.pop();
                i--;
            } else if (pilih == 3) {
                stack.view();
            } else if (pilih == 4) {
                System.out.println("Terima Kasih");
                System.exit(0);
            }

            i++;
        }while (log);

    }
}
