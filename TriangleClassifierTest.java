import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void classifyTriangle() {
        assertEquals("tam giác đều", TriangleClassifier.classifyTriangle(2, 2, 2));
    }
    @Test
    public void testIsoscelesTriangle() {
        assertEquals("tam giác cân", TriangleClassifier.classifyTriangle(2, 2, 3));
    }
    @Test
    public void testNormalTriangle() {
        assertEquals("tam giác thường", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testNotTriangle1() {
        assertEquals("không phải là tam giác", TriangleClassifier.classifyTriangle(8, 2, 3));
    }
    @Test
    public void testNotTriangle2() {
        assertEquals("không phải là tam giác", TriangleClassifier.classifyTriangle(-1, 2, 1));
    }

    @Test
    public void testNotTriangle3() {
        assertEquals("không phải là tam giác", TriangleClassifier.classifyTriangle(0, 1, 1));
    }
}