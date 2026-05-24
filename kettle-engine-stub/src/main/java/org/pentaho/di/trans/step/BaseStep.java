package org.pentaho.di.trans.step;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.logging.LogChannelInterface;
import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.core.variables.VariableSpace;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;
public abstract class BaseStep implements StepInterface, VariableSpace {
    protected boolean first = true;
    protected LogChannelInterface log;
    private StepMeta stepMeta;
    private StepDataInterface data;
    private int copyNr;
    private TransMeta transMeta;
    private Trans trans;
    private long linesRead = 0;
    private long linesWritten = 0;
    private RowMetaInterface inputRowMeta;
    private boolean outputDone = false;
    public BaseStep(StepMeta stepMeta, StepDataInterface stepDataInterface,
                    int copyNr, TransMeta transMeta, Trans trans) {
        this.stepMeta = stepMeta;
        this.data = stepDataInterface;
        this.copyNr = copyNr;
        this.transMeta = transMeta;
        this.trans = trans;
        this.log = new org.pentaho.di.core.logging.StubLogChannel();
    }
    public Object[] getRow() throws KettleException { return null; }
    public void putRow(RowMetaInterface rowMeta, Object[] row) throws KettleException { linesWritten++; }
    public void setOutputDone() { this.outputDone = true; }
    public RowMetaInterface getInputRowMeta() { return inputRowMeta; }
    public void setInputRowMeta(RowMetaInterface rowMeta) { this.inputRowMeta = rowMeta; }
    public long getLinesRead() { return linesRead; }
    public long getLinesWritten() { return linesWritten; }
    public boolean checkFeedback(long lines) { return lines > 0 && lines % 5000 == 0; }
    public Trans getTrans() { return trans; }
    public int getCopyNr() { return copyNr; }
    public String getStepname() { return stepMeta != null ? stepMeta.getName() : ""; }
    public void logBasic(String message, Object... args) { if (log != null) log.logBasic(message, args); }
    public void logError(String message, Object... args) { if (log != null) log.logError(message, args); }
    @Override
    public boolean init(StepMetaInterface smi, StepDataInterface sdi) { return true; }
    @Override
    public void dispose(StepMetaInterface smi, StepDataInterface sdi) {}
    // VariableSpace stub implementation
    @Override
    public String environmentSubstitute(String aString) { return aString; }
}
