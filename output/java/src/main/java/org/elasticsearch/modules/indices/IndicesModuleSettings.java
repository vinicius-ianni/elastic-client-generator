
package org.elasticsearch.modules.indices;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.modules.indices.circuit_breaker.*;
import org.elasticsearch.modules.indices.fielddata.*;
import org.elasticsearch.modules.indices.recovery.*;

public class IndicesModuleSettings  implements XContentable<IndicesModuleSettings> {
  
  static final ParseField CIRCUIT_BREAKER_SETTINGS = new ParseField("circuit_breaker_settings");
  private CircuitBreakerSettings _circuitBreakerSettings;
  public CircuitBreakerSettings getCircuitBreakerSettings() { return this._circuitBreakerSettings; }
  public IndicesModuleSettings setCircuitBreakerSettings(CircuitBreakerSettings val) { this._circuitBreakerSettings = val; return this; }


  static final ParseField FIELDDATA_SETTINGS = new ParseField("fielddata_settings");
  private FielddataSettings _fielddataSettings;
  public FielddataSettings getFielddataSettings() { return this._fielddataSettings; }
  public IndicesModuleSettings setFielddataSettings(FielddataSettings val) { this._fielddataSettings = val; return this; }


  static final ParseField QEUERIES_CACHE_SIZE = new ParseField("qeueries_cache_size");
  private String _qeueriesCacheSize;
  public String getQeueriesCacheSize() { return this._qeueriesCacheSize; }
  public IndicesModuleSettings setQeueriesCacheSize(String val) { this._qeueriesCacheSize = val; return this; }


  static final ParseField RECOVERY_SETTINGS = new ParseField("recovery_settings");
  private IndicesRecoverySettings _recoverySettings;
  public IndicesRecoverySettings getRecoverySettings() { return this._recoverySettings; }
  public IndicesModuleSettings setRecoverySettings(IndicesRecoverySettings val) { this._recoverySettings = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IndicesModuleSettings fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IndicesModuleSettings.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IndicesModuleSettings, Void> PARSER =
    new ConstructingObjectParser<>(IndicesModuleSettings.class.getName(), false, args -> new IndicesModuleSettings());

  static {
    PARSER.declareObject(IndicesModuleSettings::setCircuitBreakerSettings, (p, t) -> CircuitBreakerSettings.PARSER.apply(p, null), CIRCUIT_BREAKER_SETTINGS);
    PARSER.declareObject(IndicesModuleSettings::setFielddataSettings, (p, t) -> FielddataSettings.PARSER.apply(p, null), FIELDDATA_SETTINGS);
    PARSER.declareString(IndicesModuleSettings::setQeueriesCacheSize, QEUERIES_CACHE_SIZE);
    PARSER.declareObject(IndicesModuleSettings::setRecoverySettings, (p, t) -> IndicesRecoverySettings.PARSER.apply(p, null), RECOVERY_SETTINGS);
  }

}
