public class Stack {
    private static int top = -1;
    private static int[] arr = new int[3];
    public static void main(String[] args) {
        push(1);
        push(10);
        push(5);
        System.out.println(toString(arr));
        push(6);
        System.out.println(toString(arr));
        pop();
        pop();
        System.out.println(toString(arr));
    }

    public static void push(int x) {
        top++;
        if (top == arr.length) {
            int[] oldArr = arr;
            arr = new int[top * 2];
            for (int i = 0; i < oldArr.length; i++) {
                arr[i] = oldArr[i];
            }
        }
        arr[top] = x;
    }

    public static int pop() {
        int x;
        if (top != -1) {
            x = arr[top];
            arr[top] = 0;
            top--;
            return x;
        }
        return -1;
    }

    public static String toString(int[] arr) {
        String string = "";
        for (int i = 0; i < arr.length; i++) {
            string += arr[i] + " ";
        }
        return string;
    }
}
