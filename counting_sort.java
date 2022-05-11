import java.util.Scanner;

public class counting_sort { // time complexity O(n+k)

    public static void sort(int[] a, int n, int k) {
        int[] arr = new int[k + 1];
        int i;
        for (i = 0; i < n; i++)
            arr[a[i]]++;
        for (i = 0; i < k; i++)
            arr[i + 1] += arr[i];
        int[] output = new int[n];
        for (i = 0; i < n; i++) {
            output[arr[a[i]] - 1] = a[i];
            --arr[a[i]];
        }
        for (int l : output)
            System.out.print(l + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size fo array");
        int n = sc.nextInt();
        System.out.println("enter the biggest value given as input");
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();
        sort(a, n, k);

    }
}
