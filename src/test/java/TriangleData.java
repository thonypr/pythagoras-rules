import java.math.BigDecimal;

public class TriangleData {
    String separator;
    String input;

    TriangleData(String separator, String a, String b, String c) {
        this.separator = separator;
        this.input = String.format("%s%s%s%s%s", a, separator, b, separator, c);
    }

    public Triangle convertToExpectedTriangle() {
        String[] split = this.input.split(this.separator);
        Triangle triangle = new Triangle();
        triangle.setFirstSide(new BigDecimal(split[0]));
        triangle.setSecondSide(new BigDecimal(split[1]));
        triangle.setThirdSide(new BigDecimal(split[2]));
        return triangle;
    }
}
