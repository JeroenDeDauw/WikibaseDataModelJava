package test.wikibase.dataModel.entity;

import org.junit.Test;
import wikibase.dataModel.entity.PropertyId;

import static org.junit.Assert.assertEquals;

public class PropertyIdTest {
    @Test
    public void assertCanConstruct() throws Exception {
        String serialization = "p42";

        PropertyId id = new PropertyId(serialization);

        assertEquals(id.getEntityType(), "property");
        assertEquals(id.getSerialization(), serialization);
    }
}
