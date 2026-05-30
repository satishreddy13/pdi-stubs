package org.pentaho.di.core.row;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.exception.KettleStepException;
public interface RowMetaInterface {
    void addValueMeta(ValueMetaInterface v) throws KettleStepException;
    int size();
    RowMetaInterface clone();
    int indexOfValue(String fieldName);
    String getString(Object[] row, int index) throws KettleException;
    String[] getFieldNames();
}
