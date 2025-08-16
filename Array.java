public class Array{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Access element at index 2: " + arr[2]);
        arr[3] = 35;
        System.out.println("After insertion at index 3: " + arr[3]);
        int delete= 1;
        for (int i = delete; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.print("After deletion at index 1: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
