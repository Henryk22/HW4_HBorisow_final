package HW5_210123;
public class HW5_aufg1final {
    public static void main(String[] args) {
        int amelement = 9; // теоретическое количество элементов массива
        int[] arr = new int[]{1,3,4,2,6,7,9,8};// актуализируем массив
        int exsumme = amelement * ((amelement + 1) / 2);//сумма полного (теоретического) массива
        int summe = 0;
        for (int i: arr) {  //цикл нахождения суммы
            summe += i;
        }
        System.out.println("This number is not in the array: "+(exsumme - summe));

            }
}

