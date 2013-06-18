package wikibase.dataModel.entity;

abstract public class Entity {
    protected EntityId id;

    public Entity(EntityId id) {
        this.id = id;
    }

    public EntityId getId() {
        return id;
    }
}
