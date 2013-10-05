package test.wikibase.dataModel.entity;

import org.junit.Test;
import wikibase.dataModel.entity.ItemId;

import static org.junit.Assert.assertEquals;

public class ItemIdTest {
    @Test
    public void assertCanConstruct() throws Exception {
        String serialization = "Q42";

        ItemId id = new ItemId(serialization);

        assertEquals(id.getEntityType(), "item");
        assertEquals(id.getSerialization(), serialization);
    }

    @Test(expected=IllegalArgumentException.class)
    public void assertCannotConstructWithInvalidId() throws Exception {
        String serialization = "42";
        ItemId id = new ItemId(serialization);
    }

    // TODO: find out how data providers can be used
    public String[][] invalidIdProvider() {
        return new String[][]{
            { "42" },
            { "0" },
            { "42q" },
            { "p42" },
            { "q0" },
            { "" },
            { "q4.2" },
            { "q42q" },
        };
    }
}
