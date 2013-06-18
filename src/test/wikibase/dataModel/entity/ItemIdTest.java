package test.wikibase.dataModel.entity;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.entity.ItemId;

public class ItemIdTest {
    @Test
    public void assertCanConstruct() throws Exception {
        String serialization = "q42";

        ItemId id = new ItemId( serialization );

        Assert.assertEquals(id.getEntityType(), "item");
        Assert.assertEquals(id.getSerialization(), serialization);
    }
}
