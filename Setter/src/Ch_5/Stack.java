package Ch_5;
/**
 * Created by ito on 21.03.17.
 */
public class Stack {
    private Object [] theArray;
    private int topOfStack;

    static final int DEFAULT_CAPACITY = 10;

    //создание пустого стека размером 10
    Stack(){
        theArray = new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    //проверка пуст ли стек
    boolean isEmpty(){
       return topOfStack == -1;
    }

    //возвращает последний добавленный элемент
    Object top(){
        if (isEmpty())
            return null;
        return theArray[topOfStack];
    }

    //извлекает элемент из стека
    void pop(){
        if (isEmpty())
            return;
        topOfStack--;
    }
    //извлекает и возращает элемент с вершины стека
    Object topAndPop(){
        if (isEmpty())
            return null;
        return theArray[topOfStack--];

    }

    //добавляет новый элемент в стек
    void push(Object o){
        if ((topOfStack + 1) == theArray.length)
            doubleArray();
        theArray[++topOfStack] = o;
    }

    //внутренний метод увеличивает размер массива в двое
    private void doubleArray(){
        Object[] newArray;
        newArray = new Object[theArray.length*2];
        System.arraycopy(theArray, 0, newArray, 0, theArray.length);
        theArray =newArray;
    }

    void makeEmpty(){
        topOfStack = -1;
    }
}
