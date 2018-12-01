package Ch_5;

/**
 * Created by ito on 21.03.17.
 */
public class Queue {
    private Object[] o;
    private int putloc;//входной индекс
    private int getloc;// выходной индекс

    //создание пустой очереди
    Queue(int size){
        o = new Object[size+1];
        getloc = putloc = 0;
    }

    //создание очереди из другой очереди
    Queue(Queue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        o = new Object[ob.o.length];
        System.arraycopy(ob.o, 0, o, 0, ob.o.length);
    }

    //создание очереди из массива
    Queue(Object[] o){
        putloc = 0;
        getloc = 0;
        this.o = new Object[o.length + 1];
        for (int i = 0; i < o.length; i++)
            put (o[i]);
    }

    //проверка переполнения очереди
    boolean isFull(){
        return (putloc == (o.length - 1));
    }

    //проверка пустоты очереди
    boolean isEmpty(){
        return (putloc == getloc);
    }

    //добавления объекта в очередь
    void put(Object obj)throws IllegalStateException{
        if (isFull())
            throw new IllegalStateException("Очередь переполнена");
        o[++putloc] = obj;
    }

    //извлечения объекта из очереди
    Object get() throws IllegalStateException{
        if (isEmpty())
            throw new IllegalStateException("Очередь пуста");
        return o[++getloc];
    }


}
