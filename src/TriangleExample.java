import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ nhất: ");
        int side1 = scanner.nextInt();
        System.out.println("Nhập cạnh thứ hai: ");
        int side2 = scanner.nextInt();
        System.out.println("Nhập cạnh thứ ba: ");
        int side3 = scanner.nextInt();
        TriangleExample triangle = new TriangleExample();
        triangle.IllegalTriangleException(side1,side2,side3);
    }

    public void IllegalTriangleException(int side1, int side2, int side3) {
        try{
            if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2 )
                throw new Exception("These numbers can't be 3 sides of a triangle. ");
            if (side1 <= 0 || side2 <=0 || side3 <= 0)
                throw new Exception("Side of a triangle can't be zero or a negative number. ");

        }catch (Exception exception){
            System.out.println("Exception has occurred: " + exception.getMessage());
        }
    }
}
