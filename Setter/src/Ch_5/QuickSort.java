package Ch_5;

/**
 * Created by ito on 21.03.17.
 */
public class QuickSort {
    static void sort (char items[]){
        quickSort(items, 0, items.length - 1);
    }
    private static void quickSort (char items[], int left, int right) {
        int top, bottom;
        char comparand, value;

        top = left;
        bottom = right;

        comparand = items[((left + right) / 2)];

        do {
            while ((items[top] < comparand) && (top < right)) top++;
            while ((comparand < items[bottom]) && (bottom > left)) bottom--;
            if (top <= bottom) {
                value = items[top];
                items[top] = items[bottom];
                items[bottom] = value;
                top++;
                bottom--;
            }
        }
        while (top <= bottom);
        if (left < bottom)
            quickSort(items, left, bottom);
        if (top < right)
            quickSort(items, top, right);
    }
}
