package test.wikibase.dataModel.snak;

import org.junit.Test;
import wikibase.dataModel.entity.PropertyId;
import wikibase.dataModel.snak.PropertySomeValueSnak;

import static org.junit.Assert.assertEquals;

public class PropertySomeValueSnakTest {
    @Test
    public void assertCanConstruct() throws Exception {
        PropertyId id = new PropertyId("p42");

        PropertySomeValueSnak snak = new PropertySomeValueSnak( id );

        assertEquals(snak.getPropertyId(), id);
    }
}
