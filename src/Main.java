public class Main {
    public static void main(String[] args) {
        Array arr1 = new Array(5);
        Array arr2 = new Array(5);
        Array arr3 = new Array(5);
        ArrayFiller.consoleFill(arr1);
        ArrayFiller.randomFill(arr2, -5, 5);
        ArrayFiller.fileFill(arr3, "C:\\Users\\BountyHunter\\Desktop\\numbers.txt");
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
    }
}