package HW5_210123;

public class HW5_aufg1_4 {
    public static void main(String[] args) {
        int total_num;
        int[] numbers = new int[]{1,3,5,2,6,7,9,8};
        total_num = 9;
        int exsumme = total_num * ((total_num + 1) / 2);
        int summe = 0;
        for (int i: numbers) {
            summe += i;
        }
        System.out.print( exsumme - summe);
        System.out.print("\n");
    }
}

