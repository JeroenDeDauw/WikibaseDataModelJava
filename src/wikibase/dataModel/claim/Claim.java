package wikibase.dataModel.claim;

import wikibase.dataModel.snak.Snak;
import wikibase.dataModel.snak.SnakList;

public class Claim {
    private final Snak mainSnak;

    private SnakList qualifiers;

    public Claim(Snak mainSnak) {
        this.mainSnak = mainSnak;
    }

    public Claim(Snak mainSnak, SnakList qualifiers) {
        this.mainSnak = mainSnak;
        this.qualifiers = qualifiers;
    }

    public Snak getMainSnak() {
        return mainSnak;
    }

    public SnakList getQualifiers() {
        return qualifiers;
    }
}
