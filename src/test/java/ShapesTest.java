import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {

    @Test
    void toCalculateAreaOfaRectangleWithPositiveDimensions() {
        Shapes rectangleObj = new Rectangle(2, 4);
        int expectedarea = 8;
        int calculatedarea = rectangleObj.area();
        assertEquals(expectedarea, calculatedarea);
    }

    @Test
    void toCalculateAreaOfaRectangleWithNegativeDimensions() {
        Rectangle rectangleObj = new Rectangle(-2, -4);
        int expectedarea = 8;
        int calculatedarea = rectangleObj.area();
        assertEquals(expectedarea, calculatedarea);
    }

}
