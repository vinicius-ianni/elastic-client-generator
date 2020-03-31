
package org.elasticsearch.document.multiple.reindex_on_server;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.document.multiple.reindex_on_server.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class ReindexOnServerRequest  {
  
  private Conflicts _conflicts;
  public Conflicts getConflicts() { return this._conflicts; }
  public ReindexOnServerRequest setConflicts(Conflicts val) { this._conflicts = val; return this; }


  private ReindexDestination _dest;
  public ReindexDestination getDest() { return this._dest; }
  public ReindexOnServerRequest setDest(ReindexDestination val) { this._dest = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public ReindexOnServerRequest setScript(Script val) { this._script = val; return this; }


  private Long _size;
  public Long getSize() { return this._size; }
  public ReindexOnServerRequest setSize(Long val) { this._size = val; return this; }


  private Long _maxDocs;
  public Long getMaxDocs() { return this._maxDocs; }
  public ReindexOnServerRequest setMaxDocs(Long val) { this._maxDocs = val; return this; }


  private ReindexSource _source;
  public ReindexSource getSource() { return this._source; }
  public ReindexOnServerRequest setSource(ReindexSource val) { this._source = val; return this; }


  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public ReindexOnServerRequest setRefresh(Boolean val) { this._refresh = val; return this; }


  private Long _requestsPerSecond;
  public Long getRequestsPerSecond() { return this._requestsPerSecond; }
  public ReindexOnServerRequest setRequestsPerSecond(Long val) { this._requestsPerSecond = val; return this; }


  private Time _scroll;
  public Time getScroll() { return this._scroll; }
  public ReindexOnServerRequest setScroll(Time val) { this._scroll = val; return this; }


  private Long _slices;
  public Long getSlices() { return this._slices; }
  public ReindexOnServerRequest setSlices(Long val) { this._slices = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ReindexOnServerRequest setTimeout(Time val) { this._timeout = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public ReindexOnServerRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public ReindexOnServerRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }

}
