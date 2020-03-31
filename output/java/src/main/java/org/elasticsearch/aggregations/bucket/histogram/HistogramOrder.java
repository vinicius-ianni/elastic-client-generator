
package org.elasticsearch.aggregations.bucket.histogram;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.bucket.histogram.*;
import org.elasticsearch.search.search.sort.*;

public class HistogramOrder  {
  
  private HistogramOrder _countAscending;
  public HistogramOrder getCountAscending() { return this._countAscending; }
  public HistogramOrder setCountAscending(HistogramOrder val) { this._countAscending = val; return this; }


  private HistogramOrder _countDescending;
  public HistogramOrder getCountDescending() { return this._countDescending; }
  public HistogramOrder setCountDescending(HistogramOrder val) { this._countDescending = val; return this; }


  private String _key;
  public String getKey() { return this._key; }
  public HistogramOrder setKey(String val) { this._key = val; return this; }


  private HistogramOrder _keyAscending;
  public HistogramOrder getKeyAscending() { return this._keyAscending; }
  public HistogramOrder setKeyAscending(HistogramOrder val) { this._keyAscending = val; return this; }


  private HistogramOrder _keyDescending;
  public HistogramOrder getKeyDescending() { return this._keyDescending; }
  public HistogramOrder setKeyDescending(HistogramOrder val) { this._keyDescending = val; return this; }


  private SortOrder _order;
  public SortOrder getOrder() { return this._order; }
  public HistogramOrder setOrder(SortOrder val) { this._order = val; return this; }

}
