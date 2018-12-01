package Ch_3;

class MyDArray {
    public static void main(String[] args) {
// Индексные переменные и размерность массива:
        int i, j, n = 3;
// Создание двухмерного массива:
        int[][] nums = new int[n - 1][n];
// Вложенные инструкции цикла:
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n; j++) {
// Заполнение элементов массива:
                nums[i][j] = 10 * (i + 1) + j + 1;
// Вывод значений в одну строку:
                System.out.print(nums[i][j] + " ");
            }
// Переход на новую строку
            System.out.println();
        }
    }
}