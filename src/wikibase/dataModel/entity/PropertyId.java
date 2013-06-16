package wikibase.dataModel.entity;

import wikibase.dataModel.entity.EntityId;

public class PropertyId extends EntityId {
    public PropertyId(String idSerialization) {
        super("property", idSerialization);
    }
}
