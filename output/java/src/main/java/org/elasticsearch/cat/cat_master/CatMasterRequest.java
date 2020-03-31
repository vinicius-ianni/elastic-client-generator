
package org.elasticsearch.cat.cat_master;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class CatMasterRequest  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public CatMasterRequest setFormat(String val) { this._format = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatMasterRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatMasterRequest setHelp(Boolean val) { this._help = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatMasterRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatMasterRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatMasterRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatMasterRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
