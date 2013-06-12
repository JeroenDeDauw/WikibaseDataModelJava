package test.wikibase.dataModel;

import junit.framework.Assert;
import org.junit.Test;
import wikibase.dataModel.EntityId;

public class EntityIdTest {
    @Test
    public void assertCanConstruct() throws Exception {
        EntityId id = new EntityId( "item", 42 );
    }
}
