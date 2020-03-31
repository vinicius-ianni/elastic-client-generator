
package org.elasticsearch.document.single.delete;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;

public class DeleteRequest  {
  
  private Long _ifPrimaryTerm;
  public Long getIfPrimaryTerm() { return this._ifPrimaryTerm; }
  public DeleteRequest setIfPrimaryTerm(Long val) { this._ifPrimaryTerm = val; return this; }


  private Long _ifSequenceNumber;
  public Long getIfSequenceNumber() { return this._ifSequenceNumber; }
  public DeleteRequest setIfSequenceNumber(Long val) { this._ifSequenceNumber = val; return this; }


  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DeleteRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public DeleteRequest setRouting(Routing val) { this._routing = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteRequest setTimeout(Time val) { this._timeout = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public DeleteRequest setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public DeleteRequest setVersionType(VersionType val) { this._versionType = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public DeleteRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

}
