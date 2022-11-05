import java.util.Arrays;

class Case2
{
    // Решения задачи №1
    /*
        Передаем в функцию строку и число
        Переводим строку в массив чар(символов)
        Каждый симвл переводим в строку приумножая его на переданную цифру и записываем в новую строку
        Возвращаем новую строку с умноженными символами
    */
    static String repeat(String str, int num2){
        char[] buf = str.toCharArray();
        String newStr = "";
        for (int i = 0; i < buf.length; i++) {
            String tempStr = "";
            for (int j = 0; j < num2; j++) {
                tempStr += Character.toString(buf[i]);
            }
            newStr += tempStr;
        }
        return newStr;
    }
    static void task1(){
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));
    }


    // Решения задачи №2
    /*
        Передаем массив в функцию
        Сортируем массив
        Нулевое значение массива является минимальным
        Последнее значения массива является максимальным
        Возвращаем разницу макс от мин
    */
    static int differenceMaxMin(int[] arr){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        return max - min;
    }
    static void task2(){
        int[] arr1 = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(arr1));
        int[] arr2 = {44, 32, 86, 19};
        System.out.println(differenceMaxMin(arr2));
    }


    // Решения задачи №3
    /*
        Передаем массив
        В переменную sum считаем сумму массива
        Применяем деление с остатком суммы на длинну массива и возвращаем тру если 0 и фолс в противном случае
    */
    static boolean isAvgWhole(int[] arr){
        int sum = 0;
        for (int value : arr)
            sum += value;
        if (sum % arr.length == 0)
            return true;
        else
            return false;
    }
    static void task3(){
        int[] arr1 = {1, 3};
        System.out.println(isAvgWhole(arr1));
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(isAvgWhole(arr2));
        int[] arr3 = {1, 5, 6};
        System.out.println(isAvgWhole(arr3));
        int[] arr4 = {1, 1, 1, 1};
        System.out.println(isAvgWhole(arr4));
        int[] arr5 = {9, 2, 2, 5};
        System.out.println(isAvgWhole(arr5));
    }


    // Решения задачи №4
    /*
        Передаем массив
        начиная с 1 элемента идем по массиву и складываем текующее число с предыдущим
        ДЛя простоты вывода переводим массив в строку и возвращаем
    */
    static String cumulativeSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        return Arrays.toString(arr);
    }
    static void task4(){
        int[] arr1 = {1, 2, 3};
        System.out.println(cumulativeSum(arr1));
        int[] arr2 = {1, -2, 3};
        System.out.println(cumulativeSum(arr2));
        int[] arr3 = {3, 3, -2, 408, 3, 3};
        System.out.println(cumulativeSum(arr3));
    }


    // Решения задачи №5
    /*
        Переводим строку в массив чар
        Идем по символам и если находм точку, то записывем номер элемента в переменную count
        Если count равна 0, то возвращаем 0
        Иначе пересчитываем переменную count - из длинны слова вычитаем 1 и вычитаем переменную count
        (Последний символ массива является длина масисва - 1)
    */
    static int getDecimalPlaces(String str){
        int count = 0;
        char[] buf = str.toCharArray();
        for (int i = 1; i < buf.length; i++) {
            if (buf[i] == '.') {
                count = i;
            }
        }
        if (count == 0) {
            return 0;
        }
        else{
            count = buf.length - 1 - count;
            return count;
        }

    }
    static void task5(){
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
    }


    // Решения задачи №6
    /*
        Передаем в функцию число n
        создаем 3 переменные
        циклом проходим от 2 до переменной n включительно (<=)
        в переменную n2 будет записан порядковый номер числа фибоначчи
        возвращаем переменную n2
    */
    static int Fibonacci(int n){
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        for(int i = 2; i <= n; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
        }
        return n2;
    }
    static void task6(){
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(12));
    }


    // Решения задачи №7
    /*
        Передаем строку в функцию
        Переводим строку в массив char
        Если длина массива больше 5, то возвращаем false

        циклом перебираем элементы массива, если ASCII представление элемента не попадает указанный диапазон(не является числом), то возвращаем false
        если цикл пройден возвращаем true
    */
    static boolean isValid(String str){
        char[] buf = str.toCharArray();
        if (buf.length > 5) {
            return false;
        }
        for (int i = 0; i < buf.length; i++) {
            if ((int)buf[i] < 48 || (int)buf[i] > 57) {
                return false;
            }
        }
        return true;
    }
    static void task7(){
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
    }



    // Решения задачи №8
    /*
        Передаем 2 строки в функцию
        Переводим строки в char массивы
        Если длина двух массивов равна 0(массивы пусты), то возвращаем true
        Если элементы первые и последние элементы массивов равны, то возвращаем true
        (buf1[0] - это первый элемент массива buf2[buf2.length - 1] - последний элемент массива)
        иначе возвращаем false
    */
    static boolean isStrangePair(String str1, String str2){
        char[] buf1 = str1.toCharArray();
        char[] buf2 = str2.toCharArray();
        if (buf1.length == 0 && buf2.length == 0) {
            return true;
        }
        if (buf1[0] == buf2[buf2.length - 1] && buf1[buf1.length - 1] == buf2[0]) {
            return true;
        }
        return false;
    }
    static void task8(){
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));
    }



    // Решения задачи №9
    /*
        isPrefix
        Передаем 2 строки в функцию
        Переводим 2 строку в char массив
        создаем переменную slice - чтобы убрать префикс(знак -) у второй строки
        С помощью встроенной функции startsWith - определяем начинается ли слово с данной строки
        С помощью встроенной функции substring - определяем срез строки от начала строки до переменной slice

        isSuffix
        Передаем 2 строки в функцию
        Переводим 2 строку в char массив
        создаем переменную slice - чтобы убрать префикс(знак -) у второй строки
        С помощью встроенной функции endsWith - определяем начинается ли слово с данной строки
        С помощью встроенной функции substring - определяем срез строки от 2 элемента строки до переменной slice
    */
    static boolean isPrefix(String str1, String str2){
        char[] buf = str2.toCharArray();
        int slice = buf.length - 1;
        if (str1.startsWith(str2.substring(0, slice))) {
            return true;
        }
        return false;
    }
    static boolean isSuffix(String str1, String str2){
        char[] buf = str2.toCharArray();
        int slice = buf.length;
        if (str1.endsWith(str2.substring(1, slice))) {
            return true;
        }
        return false;
    }
    static void task9(){
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
    }


    // Решения задачи №10
    /*
        По формуле n-центрированного числа выясняем является переданное число одходящим для построенния чентрированного шестиугольного числа

    */
    static int hexLattice(int x){
        int num = 0, result = 0, i = 0;
        boolean border = true;

        for (i = 1; result != x; i++) {
            result = 3 * i * i - 3 * i + 1;
            if (result > x) {
                System.out.println("Invalid");
                return 1;
            }
            num = i;
        }
        i = num;

        while(result != 0){
            for (int j = 0; j != num * 2 - 1 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j != i; j++) {
                System.out.print("o" + " ");
            }
            System.out.println();
            result -=i;
            if ((i < num * 2 - 1) && (border)) {
                i++;
            }
            else{
                border = false;
                i--;
            }
        }
        return 1;
    }

    static void task10(){
        System.out.println("ex1");
        hexLattice(1);
        System.out.println("ex2");
        hexLattice(7);
        System.out.println("ex3");
        hexLattice(19);
        System.out.println("ex4");
        hexLattice(21);
    }


    public static void main(String args[])
    {
        System.out.println("Task 1");
        task1();
        System.out.println("Task 2");
        task2();
        System.out.println("Task 3");
        task3();
        System.out.println("Task 4");
        task4();
        System.out.println("Task 5");
        task5();
        System.out.println("Task 6");
        task6();
        System.out.println("Task 8");
        task8();
        System.out.println("Task 9");
        task9();
        System.out.println("Task 10");
        task10();
    }
}