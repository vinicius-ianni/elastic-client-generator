
package org.elasticsearch.analysis.plugins.kuromoji;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class KuromojiReadingFormTokenFilter  {
  
  private Boolean _useRomaji;
  public Boolean getUseRomaji() { return this._useRomaji; }
  public KuromojiReadingFormTokenFilter setUseRomaji(Boolean val) { this._useRomaji = val; return this; }

}
