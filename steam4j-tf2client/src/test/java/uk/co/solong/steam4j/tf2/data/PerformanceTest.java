package uk.co.solong.steam4j.tf2.data;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import uk.co.solong.steam4j.tf2.data.items.TF2Backpack;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PerformanceTest {

    @Test @Ignore
    public void testConstructionPerformance() throws JsonProcessingException, IOException {
        ObjectMapper m = new ObjectMapper();
        JsonNode n = m.readTree(getClass().getResourceAsStream("/4027.json"));
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            new TF2Backpack(n, 4027L);
        }
        Long end = System.currentTimeMillis();
        System.out.println(10000f/(end-start)+"objects per ms");
        System.out.println((end-start)/10000f+"ms per object");
    }
    
   

   

}
