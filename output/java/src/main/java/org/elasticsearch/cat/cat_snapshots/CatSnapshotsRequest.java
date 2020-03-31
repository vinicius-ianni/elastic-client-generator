
package org.elasticsearch.cat.cat_snapshots;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class CatSnapshotsRequest  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public CatSnapshotsRequest setFormat(String val) { this._format = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatSnapshotsRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatSnapshotsRequest setHelp(Boolean val) { this._help = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public CatSnapshotsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatSnapshotsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatSnapshotsRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatSnapshotsRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
