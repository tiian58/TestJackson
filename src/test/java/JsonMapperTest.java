import Util.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class JsonMapperTest {

    private JsonParser jsonParser = new JsonParser();
    private Worker worker;
    private String jsonWorker =  "{"
            + "\"firstName\": \"Richard\","
            + "\"lastName\": \"Starks\","
            + "\"age\": 35,"
            + "\"salary\": 50000"
            + "}";

    @Before
    public void setUp() {
        worker = jsonParser.fromJson( jsonWorker,Worker.class);
    }

    @Test
    public void studentBasicMappertest() {
        assertEquals(worker.getAge(), 35);
        assertEquals(worker.getFirstName(),"Richard");
        assertEquals(worker.getSalary(),50000);
        assertEquals(worker.getLastName(),"Starks");

    }

}
