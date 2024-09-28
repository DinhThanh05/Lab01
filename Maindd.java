import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String complex1 = scanner.nextLine();
        String complex2 = scanner.nextLine();
        double[] num1 = parseComplexNumber(complex1);
        double[] num2 = parseComplexNumber(complex2);
        double sumReal = num1[0] + num2[0];
        double sumImaginary = num1[1] + num2[1];
        double diffReal = num1[0] - num2[0];
        double diffImaginary = num1[1] - num2[1];
        double productReal = num1[0] * num2[0] - num1[1] * num2[1];
        double productImaginary = num1[0] * num2[1] + num1[1] * num2[0];
        double denominator = num2[0] * num2[0] + num2[1] * num2[1];
        double quotientReal = (num1[0] * num2[0] + num1[1] * num2[1]) / denominator;
        double quotientImaginary = (num1[1] * num2[0] - num1[0] * num2[1]) / denominator;
        System.out.println("Tổng: " + sumReal + " + " + sumImaginary + "i");
        System.out.println("Chênh lệch: " + diffReal + " + " + diffImaginary + "i");
        System.out.println("Tích: " + productReal + " + " + productImaginary + "i");
        if (denominator != 0) {
            System.out.println("Thương: " + quotientReal + " + " + quotientImaginary + "i");
        } else {
            System.out.println("Không thể chia cho số kép thứ hai.");
        }
        scanner.close();
    }
    private static double[] parseComplexNumber(String complex) {
        complex = complex.replace("i", ""); 
        String[] parts = complex.split("\\+|(?=-)"); 
        double real = Double.parseDouble(parts[0]);
        double imaginary = parts.length > 1 ? Double.parseDouble(parts[1]) : 0;
        return new double[]{real, imaginary};
    }
}
