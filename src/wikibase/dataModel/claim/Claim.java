package wikibase.dataModel.claim;

import wikibase.dataModel.snak.PropertyNoValueSnak;
import wikibase.dataModel.snak.Snak;

public class Claim {
    private final Snak mainSnak;

    public Claim(Snak mainSnak) {
        this.mainSnak = mainSnak;
    }

    public Snak getMainSnak() {
        return mainSnak;
    }
}
