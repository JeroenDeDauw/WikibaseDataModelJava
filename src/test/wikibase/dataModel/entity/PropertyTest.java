package test.wikibase.dataModel.entity;

import org.junit.Test;
import wikibase.dataModel.entity.Property;
import wikibase.dataModel.entity.PropertyId;

import static org.junit.Assert.assertEquals;

public class PropertyTest extends EntityTest {
    @Test
    public void assertCanConstruct() throws Exception {
        PropertyId id = new PropertyId( "p42" );

        Property Property = new Property( id );

        assertEquals(Property.getId(), id);
    }
}
