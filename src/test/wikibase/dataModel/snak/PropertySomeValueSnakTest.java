package test.wikibase.dataModel.snak;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.PropertyId;
import wikibase.dataModel.snak.PropertySomeValueSnak;

public class PropertySomeValueSnakTest {
    @Test
    public void assertCanConstruct() throws Exception {
        PropertyId id = new PropertyId("p42");

        PropertySomeValueSnak snak = new PropertySomeValueSnak( id );

        Assert.assertEquals(snak.getPropertyId(), id);
    }
}
