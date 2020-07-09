import de.telran.service.ConfigService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConfigServiceTest {

    ConfigService service;

    @Before
    public void setUp() throws Exception {
        service = new ConfigService();
    }

    @Test
    public void testGetPathSeparator() {
        String pathSeparator = service.getPathSeparator();
        assertEquals(";", pathSeparator);
    }

    @Test
    public void testGetPathToSavedImages() {
        String pathToSave = service.getPathToSavedImages();
        assertNotNull(pathToSave);
    }

}
