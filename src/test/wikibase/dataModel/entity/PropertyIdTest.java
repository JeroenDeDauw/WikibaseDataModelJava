package test.wikibase.dataModel.entity;

import org.junit.Test;
import wikibase.dataModel.entity.PropertyId;

import static org.junit.Assert.assertEquals;

public class PropertyIdTest {
    @Test
    public void assertCanConstruct() throws Exception {
        String serialization = "P42";

        PropertyId id = new PropertyId(serialization);

        assertEquals(id.getEntityType(), "property");
        assertEquals(id.getSerialization(), serialization);
    }

    @Test(expected=IllegalArgumentException.class)
    public void assertCannotConstructWithInvalidId() throws Exception {
        String serialization = "42";
        PropertyId id = new PropertyId(serialization);
    }
}
