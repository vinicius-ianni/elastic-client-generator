
package org.elasticsearch.document.multiple.bulk;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.document.multiple.bulk.bulk_operation.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_options.time_unit.*;

public class BulkRequest  {
  
  private BulkOperation[] _operations;
  public BulkOperation[] getOperations() { return this._operations; }
  public BulkRequest setOperations(BulkOperation[] val) { this._operations = val; return this; }


  private String _pipeline;
  public String getPipeline() { return this._pipeline; }
  public BulkRequest setPipeline(String val) { this._pipeline = val; return this; }


  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public BulkRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public BulkRequest setRouting(Routing val) { this._routing = val; return this; }


  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public BulkRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  private Field[] _sourceExcludes;
  public Field[] getSourceExcludes() { return this._sourceExcludes; }
  public BulkRequest setSourceExcludes(Field[] val) { this._sourceExcludes = val; return this; }


  private Field[] _sourceIncludes;
  public Field[] getSourceIncludes() { return this._sourceIncludes; }
  public BulkRequest setSourceIncludes(Field[] val) { this._sourceIncludes = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public BulkRequest setTimeout(Time val) { this._timeout = val; return this; }


  private String _typeQueryString;
  public String getTypeQueryString() { return this._typeQueryString; }
  public BulkRequest setTypeQueryString(String val) { this._typeQueryString = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public BulkRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

}
