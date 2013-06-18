package test.wikibase.dataModel.entity;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.entity.Item;
import wikibase.dataModel.entity.ItemId;

public class EntityTest {
    @Test
    public void assertCanConstruct() throws Exception {
        ItemId id = new ItemId( "q42" );

        Item item = new Item( id );

        Assert.assertEquals(item.getId(), id);
    }
}
