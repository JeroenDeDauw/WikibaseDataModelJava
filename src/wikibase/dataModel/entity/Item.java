package wikibase.dataModel.entity;

import wikibase.dataModel.entity.Entity;
import wikibase.dataModel.entity.EntityId;

public class Item extends Entity {
    public Item(EntityId id) {
        this.id = id;
    }
}
