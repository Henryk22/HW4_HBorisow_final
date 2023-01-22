package HW5_210123;
/* Уважаемый Станислав. Сдаю на проверку пока только 1 и 3 задачу. 2 пока мучаю, явно не хватает опыта.
С уважением к Учителю, Heinrich Borisow */

/* First level: 1. Дан массив размера  N-1  , который должен содержать только целые числа в диапазоне от  1 до N.
Каждое число представлено в одном экземпляре, кроме одного числа.  Найдите недостающий элемент. */
public class HW5_task1 {
    public static void main(String[] args) {
        int amelement = 9; // теоретическое количество элементов массива
        int[] arr = new int[]{1,3,4,2,6,7,9,8};// актуализируем массив
        int zsumme = amelement * ((amelement + 1) / 2);//сумма полного (теоретического) массива
        int summe = 0;
        for (int i: arr) {  //цикл нахождения суммы
            summe += i;
        }
        System.out.println("This number is not in the array: "+(zsumme - summe));
            }
}

