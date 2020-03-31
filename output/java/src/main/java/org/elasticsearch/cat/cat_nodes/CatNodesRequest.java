
package org.elasticsearch.cat.cat_nodes;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class CatNodesRequest  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public CatNodesRequest setFormat(String val) { this._format = val; return this; }


  private Boolean _fullId;
  public Boolean getFullId() { return this._fullId; }
  public CatNodesRequest setFullId(Boolean val) { this._fullId = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatNodesRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatNodesRequest setHelp(Boolean val) { this._help = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatNodesRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatNodesRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatNodesRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatNodesRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
