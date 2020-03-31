
package org.elasticsearch.cat.cat_shards;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class CatShardsRequest  {
  
  private Bytes _bytes;
  public Bytes getBytes() { return this._bytes; }
  public CatShardsRequest setBytes(Bytes val) { this._bytes = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public CatShardsRequest setFormat(String val) { this._format = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatShardsRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatShardsRequest setHelp(Boolean val) { this._help = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatShardsRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatShardsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatShardsRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatShardsRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
