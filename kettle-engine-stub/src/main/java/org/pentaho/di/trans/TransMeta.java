package org.pentaho.di.trans;

import org.pentaho.di.core.row.RowMeta;
import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.StepMeta;

public class TransMeta {
    private String name = "";
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    /** Returns the fields produced by the steps feeding into the given step. */
    public RowMetaInterface getPrevStepFields(StepMeta stepMeta) {
        return new RowMeta(); // stub: real PDI resolves the live field list
    }
}
