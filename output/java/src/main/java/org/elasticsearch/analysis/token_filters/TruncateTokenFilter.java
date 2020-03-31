
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TruncateTokenFilter  {
  
  private Integer _length;
  public Integer getLength() { return this._length; }
  public TruncateTokenFilter setLength(Integer val) { this._length = val; return this; }

}
