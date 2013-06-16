package test.wikibase.dataModel.entity;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.entity.PropertyId;

public class PropertyIdTest {
    @Test
    public void assertCanConstruct() throws Exception {
        String serialization = "p42";

        PropertyId id = new PropertyId(serialization);

        Assert.assertEquals(id.getEntityType(), "property");
        Assert.assertEquals(id.getSerialization(), serialization);
    }
}
