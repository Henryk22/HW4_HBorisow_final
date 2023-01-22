package HW5_210123;
//Дан массив из N целых чисел и целое число  K ,
//найдите количество пар элементов в массиве, сумма которых равна K.
public class HW5_task2 {
    static void  pairsValue(int inputArray[], int k) {
        System.out.println("Pairs of elements and their sum : ");
        for (int i =  0; i < inputArray.length; i++) {
            for (int j  = i+1; j < inputArray.length; j++) {
             if(inputArray[i]+inputArray[j] == k) {
             System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+k);
                }//if
            }//for j
        }//for (int i =  0; i < inputArray.length; i++)
    }//static void  pairsValue(int inputArray[], int k)

    public static void  main(String[] args)
    {
        pairsValue(new int[] {2, 7, 4, -5, 11, 5, 20}, -3);

        pairsValue(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
    }//main
}//public class