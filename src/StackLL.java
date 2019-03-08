public class StackLL implements StackInterface {

    private class Node {
        String data;
        Node link;
    }

    Node top;

    StackLL(){
        this.top = null;
    }


    @Override
    public void push(String x, String y) {
        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nKosong");
            return;
        }

        temp.data = "Nama: " + x + "\nSakit: " + y;
        temp.link = top;
        top = temp;
    }

    @Override
    public void pop() {
        if (top == null) {
            System.out.print("\nData tidak ada\n");
            return;
        }

        top = (top).link;
        System.out.println("Data berhasil diPop\n");
    }


    @Override
    public void view() {
        if (top == null) {
            System.out.printf("Stack Null\n\n");
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.printf(temp.data + "\n\n");
                temp = temp.link;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
