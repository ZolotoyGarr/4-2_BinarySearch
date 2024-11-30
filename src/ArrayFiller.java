import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ArrayFiller {
    public static void consoleFill(Array array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length(); i++) {
            System.out.println("Enter " + (i + 1) + " element: ");
            array.set(i, scanner.nextInt());
        }
    }

    public static void randomFill(Array array, int from, int to) {
        Random random = new Random();
        for (int i = 0; i < array.length(); i++) {
            int randomNumber = random.nextInt(to - from + 1) + from;
            array.set(i, randomNumber);
        }
    }

    public static void fileFill(Array array, String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            for (int i = 0; i < array.length(); i++) {
                if ((line = reader.readLine()) != null) {
                    try {
                        int number = Integer.parseInt(line.trim());
                        array.set(i, number);
                    } catch (NumberFormatException e) {
                        System.err.println("Некорректное число: " + line);
                    }
                } else {
                    System.err.println("Недостаточно данных в файле. ");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
