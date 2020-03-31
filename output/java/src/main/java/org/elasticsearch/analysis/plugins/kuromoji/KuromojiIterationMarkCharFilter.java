
package org.elasticsearch.analysis.plugins.kuromoji;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class KuromojiIterationMarkCharFilter  {
  
  private Boolean _normalizeKana;
  public Boolean getNormalizeKana() { return this._normalizeKana; }
  public KuromojiIterationMarkCharFilter setNormalizeKana(Boolean val) { this._normalizeKana = val; return this; }


  private Boolean _normalizeKanji;
  public Boolean getNormalizeKanji() { return this._normalizeKanji; }
  public KuromojiIterationMarkCharFilter setNormalizeKanji(Boolean val) { this._normalizeKanji = val; return this; }

}
