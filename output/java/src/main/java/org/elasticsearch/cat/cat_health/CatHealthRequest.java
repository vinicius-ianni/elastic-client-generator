
package org.elasticsearch.cat.cat_health;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class CatHealthRequest  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public CatHealthRequest setFormat(String val) { this._format = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatHealthRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatHealthRequest setHelp(Boolean val) { this._help = val; return this; }


  private Boolean _includeTimestamp;
  public Boolean getIncludeTimestamp() { return this._includeTimestamp; }
  public CatHealthRequest setIncludeTimestamp(Boolean val) { this._includeTimestamp = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatHealthRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatHealthRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatHealthRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatHealthRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
