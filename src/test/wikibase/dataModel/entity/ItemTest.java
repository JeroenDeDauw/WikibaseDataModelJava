package test.wikibase.dataModel.entity;

import org.junit.Test;
import wikibase.dataModel.entity.Item;
import wikibase.dataModel.entity.ItemId;

import static org.junit.Assert.assertEquals;

public class ItemTest extends EntityTest {
    @Test
    public void assertCanConstruct() throws Exception {
        ItemId id = new ItemId( "q42" );

        Item item = new Item( id );

        assertEquals(item.getId(), id);
    }
}
