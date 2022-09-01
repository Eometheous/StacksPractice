public class Stack {
    private static int top = -1;
    public static void main(String[] args) {
        int[] a = new int[10];
        push(a, 1);
        push(a, 10);
        push(a, 5);
        System.out.println(toString(a));
        System.out.println(top);
        pop(a);
        pop(a);
        System.out.println(toString(a));
    }

    public static void push(int[] arr, int x) {
        if (top != arr.length) {
            top++;
            arr[top] = x;
        }
        else {

        }
    }

    public static int pop(int[] arr) {
        int x;
        if (top != -1) {
            x = arr[top];
            arr[top] = 0;
            top--;
            return x;
        }
        return -1;
    }

    public static String toString(int[] a) {
        String string = "";
        for (int i = 0; i < a.length; i++) {
            string += a[i] + " ";
        }
        return string;
    }
}
