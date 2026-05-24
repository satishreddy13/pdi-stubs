package org.pentaho.di.trans.step;
import org.pentaho.di.core.exception.KettleException;
public interface StepInterface {
    boolean processRow(StepMetaInterface smi, StepDataInterface sdi) throws KettleException;
    boolean init(StepMetaInterface smi, StepDataInterface sdi);
    void dispose(StepMetaInterface smi, StepDataInterface sdi);
    void setOutputDone();
    long getLinesRead();
    long getLinesWritten();
}
