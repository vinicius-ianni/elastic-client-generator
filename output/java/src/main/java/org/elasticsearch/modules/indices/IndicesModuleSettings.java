
package org.elasticsearch.modules.indices;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.indices.circuit_breaker.*;
import org.elasticsearch.modules.indices.fielddata.*;
import org.elasticsearch.modules.indices.recovery.*;

public class IndicesModuleSettings  {
  
  private CircuitBreakerSettings _circuitBreakerSettings;
  public CircuitBreakerSettings getCircuitBreakerSettings() { return this._circuitBreakerSettings; }
  public IndicesModuleSettings setCircuitBreakerSettings(CircuitBreakerSettings val) { this._circuitBreakerSettings = val; return this; }


  private FielddataSettings _fielddataSettings;
  public FielddataSettings getFielddataSettings() { return this._fielddataSettings; }
  public IndicesModuleSettings setFielddataSettings(FielddataSettings val) { this._fielddataSettings = val; return this; }


  private String _qeueriesCacheSize;
  public String getQeueriesCacheSize() { return this._qeueriesCacheSize; }
  public IndicesModuleSettings setQeueriesCacheSize(String val) { this._qeueriesCacheSize = val; return this; }


  private IndicesRecoverySettings _recoverySettings;
  public IndicesRecoverySettings getRecoverySettings() { return this._recoverySettings; }
  public IndicesModuleSettings setRecoverySettings(IndicesRecoverySettings val) { this._recoverySettings = val; return this; }

}
