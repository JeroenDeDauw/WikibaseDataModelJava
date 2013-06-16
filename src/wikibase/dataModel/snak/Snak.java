package wikibase.dataModel.snak;

import wikibase.dataModel.PropertyId;

public interface Snak {
    public PropertyId getPropertyId();

    public String getType();
}
