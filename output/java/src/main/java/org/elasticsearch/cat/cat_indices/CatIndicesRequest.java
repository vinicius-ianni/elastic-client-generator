
package org.elasticsearch.cat.cat_indices;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class CatIndicesRequest  {
  
  private Bytes _bytes;
  public Bytes getBytes() { return this._bytes; }
  public CatIndicesRequest setBytes(Bytes val) { this._bytes = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public CatIndicesRequest setFormat(String val) { this._format = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatIndicesRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Health _health;
  public Health getHealth() { return this._health; }
  public CatIndicesRequest setHealth(Health val) { this._health = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatIndicesRequest setHelp(Boolean val) { this._help = val; return this; }


  private Boolean _includeUnloadedSegments;
  public Boolean getIncludeUnloadedSegments() { return this._includeUnloadedSegments; }
  public CatIndicesRequest setIncludeUnloadedSegments(Boolean val) { this._includeUnloadedSegments = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatIndicesRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatIndicesRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Boolean _pri;
  public Boolean getPri() { return this._pri; }
  public CatIndicesRequest setPri(Boolean val) { this._pri = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatIndicesRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatIndicesRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
