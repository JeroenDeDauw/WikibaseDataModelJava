package test.wikibase.dataModel.entity;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.entity.EntityId;
import wikibase.dataModel.entity.Item;

public class EntityTest {
    @Test
    public void assertCanConstruct() throws Exception {
        EntityId id = new EntityId( "item", "q42" );

        Item item = new Item( id );

        Assert.assertEquals(item.getId(), id);
    }
}
