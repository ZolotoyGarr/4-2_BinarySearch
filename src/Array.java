import java.util.Arrays;
import java.util.Objects;

public class Array {
    private int[] array;

    public Array(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Размер массива не может быть отрицательным: " + size);
        }
        array = new int[size];
    }

    public Array(int[] array) {
        this.array = array;
    }

    public int get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        return array[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        array[index] = value;
    }

    public int length() {
        return array.length;
    }
    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Objects.deepEquals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    public int binarySearch(int target) {
        int min = 0;
        int max = array.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public int getMax() {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int getMin() {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    }
