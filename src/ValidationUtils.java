public class ValidationUtils {

    public static String ValidationString(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            return value;
        }
    }

    public static int ValidationInt(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            return Math.abs(value);
        }
    }
    public static double ValidationDouble(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            return Math.abs(value);
        }

    }
}
