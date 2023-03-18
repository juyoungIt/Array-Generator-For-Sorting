import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayGenerator generator = new ArrayGenerator(Integer.parseInt(args[0]));
        int[] arr = generator.generate();

        System.out.println(Arrays.toString(arr));

        // write sorting code here...

        System.exit(0);
    }
}