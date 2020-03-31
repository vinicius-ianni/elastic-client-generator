
package org.elasticsearch.cat.cat_templates;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class CatTemplatesRequest  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public CatTemplatesRequest setFormat(String val) { this._format = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatTemplatesRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatTemplatesRequest setHelp(Boolean val) { this._help = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatTemplatesRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatTemplatesRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatTemplatesRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatTemplatesRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
