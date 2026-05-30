package org.pentaho.di.core.row;

import java.util.ArrayList;
import java.util.List;

import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.exception.KettleStepException;

public class RowMeta implements RowMetaInterface {

    private List<ValueMetaInterface> valueMetas = new ArrayList<>();

    @Override
    public void addValueMeta(ValueMetaInterface v) throws KettleStepException {
        valueMetas.add(v);
    }

    @Override
    public int size() {
        return valueMetas.size();
    }

    @Override
    public RowMetaInterface clone() {
        RowMeta clone = new RowMeta();
        clone.valueMetas.addAll(this.valueMetas);
        return clone;
    }

    @Override
    public int indexOfValue(String fieldName) {
        for (int i = 0; i < valueMetas.size(); i++) {
            if (fieldName != null && fieldName.equals(valueMetas.get(i).getName())) return i;
        }
        return -1;
    }

    @Override
    public String getString(Object[] row, int index) throws KettleException {
        if (row == null || index < 0 || index >= row.length) return null;
        Object val = row[index];
        return val == null ? null : val.toString();
    }

    @Override
    public String[] getFieldNames() {
        String[] names = new String[valueMetas.size()];
        for (int i = 0; i < valueMetas.size(); i++) {
            names[i] = valueMetas.get(i).getName();
        }
        return names;
    }
}
