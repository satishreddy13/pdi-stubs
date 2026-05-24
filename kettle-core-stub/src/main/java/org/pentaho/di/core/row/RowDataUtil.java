package org.pentaho.di.core.row;
public class RowDataUtil {
    public static Object[] addValueData(Object[] dataRow, int index, Object value) {
        Object[] newRow = resizeArray(dataRow, index + 1);
        newRow[index] = value;
        return newRow;
    }
    public static Object[] resizeArray(Object[] dataRow, int newSize) {
        Object[] newRow = new Object[newSize];
        if (dataRow != null) System.arraycopy(dataRow, 0, newRow, 0, Math.min(dataRow.length, newSize));
        return newRow;
    }
}
