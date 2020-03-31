
package org.elasticsearch.document.single.get;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class GetRequest  {
  
  private String _preference;
  public String getPreference() { return this._preference; }
  public GetRequest setPreference(String val) { this._preference = val; return this; }


  private Boolean _realtime;
  public Boolean getRealtime() { return this._realtime; }
  public GetRequest setRealtime(Boolean val) { this._realtime = val; return this; }


  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public GetRequest setRefresh(Boolean val) { this._refresh = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public GetRequest setRouting(Routing val) { this._routing = val; return this; }


  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public GetRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  private Field[] _sourceExcludes;
  public Field[] getSourceExcludes() { return this._sourceExcludes; }
  public GetRequest setSourceExcludes(Field[] val) { this._sourceExcludes = val; return this; }


  private Field[] _sourceIncludes;
  public Field[] getSourceIncludes() { return this._sourceIncludes; }
  public GetRequest setSourceIncludes(Field[] val) { this._sourceIncludes = val; return this; }


  private Field[] _storedFields;
  public Field[] getStoredFields() { return this._storedFields; }
  public GetRequest setStoredFields(Field[] val) { this._storedFields = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public GetRequest setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public GetRequest setVersionType(VersionType val) { this._versionType = val; return this; }

}
