package test.wikibase.dataModel.entity;

import org.junit.Test;
import wikibase.dataModel.entity.ItemId;

import static org.junit.Assert.assertEquals;

public class ItemIdTest {
    @Test
    public void assertCanConstruct() throws Exception {
        String serialization = "q42";

        ItemId id = new ItemId( serialization );

        assertEquals(id.getEntityType(), "item");
        assertEquals(id.getSerialization(), serialization);
    }
}
