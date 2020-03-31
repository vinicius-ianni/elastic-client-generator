
package org.elasticsearch.x_pack.machine_learning.preview_datafeed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class PreviewDatafeedResponse<TDocument>  {
  
  private TDocument[] _data;
  public TDocument[] getData() { return this._data; }
  public PreviewDatafeedResponse<TDocument> setData(TDocument[] val) { this._data = val; return this; }

}
