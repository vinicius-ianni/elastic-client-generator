
package org.elasticsearch.cat.cat_thread_pool;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common.*;

public class CatThreadPoolRequest  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public CatThreadPoolRequest setFormat(String val) { this._format = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatThreadPoolRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatThreadPoolRequest setHelp(Boolean val) { this._help = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatThreadPoolRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatThreadPoolRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Size _size;
  public Size getSize() { return this._size; }
  public CatThreadPoolRequest setSize(Size val) { this._size = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatThreadPoolRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatThreadPoolRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
