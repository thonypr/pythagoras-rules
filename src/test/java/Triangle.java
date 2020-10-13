import java.math.BigDecimal;

public class Triangle {
    String id;
    BigDecimal firstSide, secondSide, thirdSide;

    public BigDecimal getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(BigDecimal firstSide) {
        this.firstSide = firstSide;
    }

    public BigDecimal getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(BigDecimal secondSide) {
        this.secondSide = secondSide;
    }

    public BigDecimal getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(BigDecimal thirdSide) {
        this.thirdSide = thirdSide;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
