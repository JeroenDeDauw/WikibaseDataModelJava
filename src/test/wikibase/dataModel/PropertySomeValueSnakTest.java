package test.wikibase.dataModel;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.PropertyId;
import wikibase.dataModel.PropertySomeValueSnak;

public class PropertySomeValueSnakTest {
    @Test
    public void assertCanConstruct() throws Exception {
        PropertyId id = new PropertyId("property", "p42");

        PropertySomeValueSnak snak = new PropertySomeValueSnak( id );

        Assert.assertEquals(snak.getPropertyId(), id);
    }
}
