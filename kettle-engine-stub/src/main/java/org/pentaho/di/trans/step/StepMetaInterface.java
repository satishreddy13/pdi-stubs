package org.pentaho.di.trans.step;
import org.pentaho.di.core.CheckResultInterface;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.exception.KettleStepException;
import org.pentaho.di.core.exception.KettleXMLException;
import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.core.variables.VariableSpace;
import org.pentaho.di.repository.ObjectId;
import org.pentaho.di.repository.Repository;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.metastore.api.IMetaStore;
import org.w3c.dom.Node;
import java.util.List;
public interface StepMetaInterface {
    void setDefault();
    Object clone();
    void getFields(RowMetaInterface rowMeta, String origin, RowMetaInterface[] info,
        StepMeta nextStep, VariableSpace space, Repository repository, IMetaStore metaStore)
        throws KettleStepException;
    String getXML() throws KettleException;
    void loadXML(Node stepnode, List<DatabaseMeta> databases, IMetaStore metaStore) throws KettleXMLException;
    void readRep(Repository rep, IMetaStore metaStore, ObjectId id_step, List<DatabaseMeta> databases) throws KettleException;
    void saveRep(Repository rep, IMetaStore metaStore, ObjectId id_transformation, ObjectId id_step) throws KettleException;
    void check(List<CheckResultInterface> remarks, TransMeta transMeta, StepMeta stepMeta,
        RowMetaInterface prev, String[] input, String[] output, RowMetaInterface info,
        VariableSpace space, Repository repository, IMetaStore metaStore);
    StepInterface getStep(StepMeta stepMeta, StepDataInterface stepDataInterface, int copyNr,
        TransMeta transMeta, Trans trans);
    StepDataInterface getStepData();
    boolean hasChanged();
    void setChanged(boolean changed);
    void setChanged();
}
