package wikibase.dataModel.snak;

import wikibase.dataModel.entity.PropertyId;

public interface Snak {
    public PropertyId getPropertyId();

    public String getType();
}
