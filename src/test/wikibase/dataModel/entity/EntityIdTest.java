package test.wikibase.dataModel.entity;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.entity.EntityId;

public class EntityIdTest {
    @Test
    public void assertCanConstruct() throws Exception {
        String entityType = "item";
        String serialization = "q42";

        EntityId id = new EntityId( entityType, serialization );

        Assert.assertEquals(id.getEntityType(), entityType);
        Assert.assertEquals(id.getSerialization(), serialization);
    }
}
