import java.util.*;

public class ArrayGenerator {
    private final int[] array;
    private final Set<Integer> elements;

    public ArrayGenerator(int size) {
        if(size < 1) {
            throw new IllegalArgumentException("ERROR - Invalid Array Size Argument...");
        }
        this.array = new int[size];
        this.elements = new LinkedHashSet<>();
    }

    public int[] generate() {
        Random random = new Random();
        while(this.elements.size() < this.array.length) {
            elements.add(random.nextInt(this.array.length)+1);
        }
        int index = 0;
        for(int element : elements) {
            this.array[index++] = element;
        }
        return this.array;
    }
}
