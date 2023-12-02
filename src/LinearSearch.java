import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int target = 6;
        int check = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<arr.length; i++){
            if (arr[i] == target){
                check = 1;
                break;
            }
        }
        if (check == 1){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
