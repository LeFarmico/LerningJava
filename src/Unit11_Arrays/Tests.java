package Unit11_Arrays;

public class Tests {
    public static void main(String[] args) {
        int[] numbers = {2, -1, -56, 300, 0, 25, 0, 0};
        swap(numbers, 0,0);
        for (int num : numbers){
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println("Максимальное занчение в массиве: " + getMax(numbers));
        System.out.println("Минимальное занчение в массиве: " + getMin(numbers));
        System.out.println("Индекс заданного числа: " + getFirstIndex(numbers, 3));
        printOdd(numbers);
        printEvenIndex(numbers);
        printLine(createOddArray(99));
        printInLineReverse(createOddArray(99));
        printLine(bubbleSort(numbers));
        printLine(moveZeros(numbers));
    }
    public static void swap(int[] array, int indexOne, int indexTwo){
        if(indexOne < array.length && indexTwo < array.length && indexOne >= 0 && indexTwo >= 0){
            int swapNumber1 = array[indexOne];
            int swapNumber2 = array[indexTwo];
            array[indexOne] = swapNumber2;
            array[indexTwo] = swapNumber1;
        }
        else {
            System.out.println("Out of bounce!");
        }
    }
    private static int getMax(int[] array){
        int maxValue = array[0];
        for (int arrayValues : array){
            if (arrayValues > maxValue){
                maxValue = arrayValues;
            }
        }
        return  maxValue;
    }
    private static int getMin(int[] array){
        int minValue = array[0];
        for (int arrayValues : array){
            if (arrayValues < minValue){
                minValue = arrayValues;
            }
        }
        return  minValue;
    }
    private static int getFirstIndex(int[] array, int number){
        int index;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                index = i;
                return index;
            }
        }
        System.out.println("Нет такого числа!");
        return -1;
    }
    private static void printOdd(int[] array){
        for (int num : array){
            if (num % 2 != 0){
                System.out.print("Все четные занчения в массиве: " + num + ", ");
            }
        }
        System.out.println();
    }
    private static void printEvenIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print("Все не четные занчения в массиве: " + i + ", ");
            }
        }
        System.out.println();
    }
    private static int[] createOddArray(int untilNumber){
        int lengthOddArray = (untilNumber + 1) / 2;
        int oddArray[] = new int[lengthOddArray];
        int n = 0;
        for (int i = 0; i <= untilNumber ; i++) {
            if (i % 2 != 0){
                oddArray[n] = i;
                n++;
            }
        }
        return  oddArray;
    }
    private static void printLine(int [] array){
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i] + " ";
        }
        System.out.println(result);
    }
    private static void printInLineReverse(int[] array) {
        String result = "";
        for (int i = array.length-1; i >= 0; i--){
            result = result + array[i] + " ";
        }
        System.out.println(result);
    }
    private static int[] bubbleSort(int[] array){
        boolean repeat = true;
        while (repeat) {
            if (array.length <= 1)
                return array;
            repeat = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    repeat = true;
                }
            }
        }
        return array;
    }
    private  static int[] moveZeros(int[] array){
        if (array.length <= 1)
            return array;
        for (int i = 0; i < array.length-1 ; i++) {
            for (int n = 0; n < array.length-1; n++){
                if(array[n] == 0 && array[n+1] != 0){
                    swap(array, n, n+1);
                }
            }
        }
        return  array;
    }
}
