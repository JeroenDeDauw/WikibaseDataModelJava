package test.wikibase.dataModel.snak;

import org.junit.Test;
import wikibase.dataModel.entity.PropertyId;
import wikibase.dataModel.snak.PropertyNoValueSnak;

import static org.junit.Assert.assertEquals;

public class PropertyNoValueSnakTest {
    @Test
    public void assertCanConstruct() throws Exception {
        PropertyId id = new PropertyId("p42");

        PropertyNoValueSnak snak = new PropertyNoValueSnak( id );

        assertEquals(snak.getPropertyId(), id);
    }
}
