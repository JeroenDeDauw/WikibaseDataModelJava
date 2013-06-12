package test.wikibase.dataModel;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.PropertyId;

public class PropertyIdTest {
    @Test
    public void assertCanConstruct() throws Exception {
        String entityType = "property";
        String serialization = "p42";

        PropertyId id = new PropertyId(entityType, serialization);

        Assert.assertEquals(id.getEntityType(), entityType);
        Assert.assertEquals(id.getSerialization(), serialization);
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertCannotConstructWithNonPropertyEntityType() throws Exception {
        String entityType = "item";
        String serialization = "q42";

        new PropertyId(entityType, serialization);
    }
}
