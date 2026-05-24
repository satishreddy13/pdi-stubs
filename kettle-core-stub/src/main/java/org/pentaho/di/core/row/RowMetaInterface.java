package org.pentaho.di.core.row;
import org.pentaho.di.core.exception.KettleStepException;
public interface RowMetaInterface {
    void addValueMeta(ValueMetaInterface v) throws KettleStepException;
    int size();
    RowMetaInterface clone();
}
