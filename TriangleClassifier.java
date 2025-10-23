public class TriangleClassifier {

    public static String classifyTriangle(int a, int b, int c) {
        if (!isValidTriangle(a, b, c)) {
            return "không phải là tam giác";
        }

        if (isEquilateral(a, b, c)) {
            return "tam giác đều";
        }

        if (isIsosceles(a, b, c)) {
            return "tam giác cân";
        }

        return "tam giác thường";
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;
    }

    private static boolean isIsosceles(int a, int b, int c) {
        return a == b || a == c || b == c;
    }
}
