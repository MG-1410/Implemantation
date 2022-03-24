package ArrayList;

import java.util.Arrays;

public class ArrayList<T> {
    Object[] arr;
    static int initialcapacity = 10;
    static int size;

    ArrayList(int initialcapacity){
        this.initialcapacity = initialcapacity;
        this.arr = new Object[initialcapacity];
    }

    ArrayList(){
        this.arr = new Object[initialcapacity];
    }

    public void resize(){
        Object temp[] = new Object[arr.length * 2];
        for (int i = 0 ; i < arr.length; i++)
        {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        if(size == arr.length){
            return true;
        }
        return false;
    }

    public void add(T val){
        if(this.isFull()){
            resize();
        }
        arr[size++] = val;
    }

    public boolean remove(T val){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].equals(val)){
                for(int j = i + 1 ; j < arr.length - 1 ; j++){
                    arr[j - 1] = arr[j];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        arr[index] = value;
    }

    public T get(int index){
        return (T) arr[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(arr) + " ";
    }
}
