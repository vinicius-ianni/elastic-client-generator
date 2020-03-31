
package org.elasticsearch.search.suggesters.completion_suggester;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.fuzziness.*;
import org.elasticsearch.internal.*;

public class SuggestFuzziness  {
  
  private Fuzziness _fuzziness;
  public Fuzziness getFuzziness() { return this._fuzziness; }
  public SuggestFuzziness setFuzziness(Fuzziness val) { this._fuzziness = val; return this; }


  private Integer _minLength;
  public Integer getMinLength() { return this._minLength; }
  public SuggestFuzziness setMinLength(Integer val) { this._minLength = val; return this; }


  private Integer _prefixLength;
  public Integer getPrefixLength() { return this._prefixLength; }
  public SuggestFuzziness setPrefixLength(Integer val) { this._prefixLength = val; return this; }


  private Boolean _transpositions;
  public Boolean getTranspositions() { return this._transpositions; }
  public SuggestFuzziness setTranspositions(Boolean val) { this._transpositions = val; return this; }


  private Boolean _unicodeAware;
  public Boolean getUnicodeAware() { return this._unicodeAware; }
  public SuggestFuzziness setUnicodeAware(Boolean val) { this._unicodeAware = val; return this; }

}
