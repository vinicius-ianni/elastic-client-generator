
package org.elasticsearch.analysis.plugins.kuromoji;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class KuromojiStemmerTokenFilter  {
  
  private Integer _minimumLength;
  public Integer getMinimumLength() { return this._minimumLength; }
  public KuromojiStemmerTokenFilter setMinimumLength(Integer val) { this._minimumLength = val; return this; }

}
