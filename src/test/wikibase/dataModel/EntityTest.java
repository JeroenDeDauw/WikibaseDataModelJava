package test.wikibase.dataModel;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.EntityId;
import wikibase.dataModel.Item;

public class EntityTest {
    @Test
    public void assertCanConstruct() throws Exception {
        EntityId id = new EntityId( "item", "q42" );

        Item item = new Item( id );

        Assert.assertEquals(item.getId(), id);
    }
}
