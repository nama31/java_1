import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    int[] arr = new int[10];
    for (int i=0;i< arr.length;i++){
        arr[i] = i;
    }
        System.out.println(both(arr));
        System.out.println(palendrom(121));
    }
    public static int sumi(int[] arr){
        int controrr = 0;
        for(int i = 0;i<arr.length;i++){
            controrr += arr[i];
        }
        return controrr;
    }
    public static int avarage(int[] arr){
        return sumi(arr)/arr.length;
    }

    public static int both(int[] arr){
        Arrays.sort(arr);
        int[] maxi = Arrays.copyOfRange(arr,arr.length-1,arr.length);
        int[] mini = Arrays.copyOfRange(arr,0,1);
        int[] maxi_2 = Arrays.copyOfRange(arr,arr.length-2,arr.length-1);
        int[] mini_2 = Arrays.copyOfRange(arr,1,2);
        System.out.println(Arrays.toString(maxi)+Arrays.toString(mini));
        System.out.println("seconds"+Arrays.toString(maxi_2)+Arrays.toString(mini_2));
        return 0;
    }
    public static boolean palendrom(int num){
        int revers = 0;
        int copy = num;
        while (num>0) {
            revers = (revers*10) +(num%10);
            num/=10;
        }
        return revers==copy;
    }
}
