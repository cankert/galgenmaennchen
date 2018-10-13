import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GalgenmaennchenTest {
    Galgenmaennchen classToTest = new Galgenmaennchen("TEST");
    @Test
    void rateBuchstabeShouldReturnString() {
        assertEquals("T--T", classToTest.RateBuchstabe('T'), "Should be T --- ");
    }
}