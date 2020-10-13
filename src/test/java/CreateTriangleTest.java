import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

public class CreateTriangleTest {

    TriangleData triangleExpected = new TriangleData(";", "3", "4", "5");

    @Test
    public void canCreateTriangleWithCorrectData() throws IOException {
        TriangleAPIController c = new TriangleAPIController();
        Triangle actualTriangle = c.createTriangle(triangleExpected);
        assertThat(actualTriangle).isNotNull();
        assertThat(actualTriangle).usingRecursiveComparison().isEqualTo(triangleExpected);
    }
}
