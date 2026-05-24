package org.pentaho.di.repository;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.metastore.api.IMetaStore;
import java.util.List;
public interface Repository {
    String getStepAttributeString(ObjectId id_step, String code) throws KettleException;
    long getStepAttributeInteger(ObjectId id_step, int nr, String code) throws KettleException;
    boolean getStepAttributeBoolean(ObjectId id_step, String code) throws KettleException;
    void saveStepAttribute(ObjectId id_transformation, ObjectId id_step, String code, String value) throws KettleException;
    void saveStepAttribute(ObjectId id_transformation, ObjectId id_step, String code, long value) throws KettleException;
    void saveStepAttribute(ObjectId id_transformation, ObjectId id_step, String code, boolean value) throws KettleException;
}
