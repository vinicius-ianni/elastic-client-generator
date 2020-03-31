
package org.elasticsearch.cat.cat_segments;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class CatSegmentsRequest  {
  
  private Bytes _bytes;
  public Bytes getBytes() { return this._bytes; }
  public CatSegmentsRequest setBytes(Bytes val) { this._bytes = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public CatSegmentsRequest setFormat(String val) { this._format = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatSegmentsRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatSegmentsRequest setHelp(Boolean val) { this._help = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatSegmentsRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatSegmentsRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
