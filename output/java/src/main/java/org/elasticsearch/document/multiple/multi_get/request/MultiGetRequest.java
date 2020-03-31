
package org.elasticsearch.document.multiple.multi_get.request;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.document.multiple.multi_get.request.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;

public class MultiGetRequest  {
  
  private Field[] _storedFields;
  public Field[] getStoredFields() { return this._storedFields; }
  public MultiGetRequest setStoredFields(Field[] val) { this._storedFields = val; return this; }


  private MultiGetOperation[] _docs;
  public MultiGetOperation[] getDocs() { return this._docs; }
  public MultiGetRequest setDocs(MultiGetOperation[] val) { this._docs = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public MultiGetRequest setPreference(String val) { this._preference = val; return this; }


  private Boolean _realtime;
  public Boolean getRealtime() { return this._realtime; }
  public MultiGetRequest setRealtime(Boolean val) { this._realtime = val; return this; }


  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public MultiGetRequest setRefresh(Boolean val) { this._refresh = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public MultiGetRequest setRouting(Routing val) { this._routing = val; return this; }


  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public MultiGetRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  private Field[] _sourceExcludes;
  public Field[] getSourceExcludes() { return this._sourceExcludes; }
  public MultiGetRequest setSourceExcludes(Field[] val) { this._sourceExcludes = val; return this; }


  private Field[] _sourceIncludes;
  public Field[] getSourceIncludes() { return this._sourceIncludes; }
  public MultiGetRequest setSourceIncludes(Field[] val) { this._sourceIncludes = val; return this; }

}
