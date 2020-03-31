
package org.elasticsearch.analysis.token_filters.compound_word;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CompoundWordTokenFilterBase  {
  
  private String _hyphenationPatternsPath;
  public String getHyphenationPatternsPath() { return this._hyphenationPatternsPath; }
  public CompoundWordTokenFilterBase setHyphenationPatternsPath(String val) { this._hyphenationPatternsPath = val; return this; }


  private Integer _maxSubwordSize;
  public Integer getMaxSubwordSize() { return this._maxSubwordSize; }
  public CompoundWordTokenFilterBase setMaxSubwordSize(Integer val) { this._maxSubwordSize = val; return this; }


  private Integer _minSubwordSize;
  public Integer getMinSubwordSize() { return this._minSubwordSize; }
  public CompoundWordTokenFilterBase setMinSubwordSize(Integer val) { this._minSubwordSize = val; return this; }


  private Integer _minWordSize;
  public Integer getMinWordSize() { return this._minWordSize; }
  public CompoundWordTokenFilterBase setMinWordSize(Integer val) { this._minWordSize = val; return this; }


  private Boolean _onlyLongestMatch;
  public Boolean getOnlyLongestMatch() { return this._onlyLongestMatch; }
  public CompoundWordTokenFilterBase setOnlyLongestMatch(Boolean val) { this._onlyLongestMatch = val; return this; }


  private String[] _wordList;
  public String[] getWordList() { return this._wordList; }
  public CompoundWordTokenFilterBase setWordList(String[] val) { this._wordList = val; return this; }


  private String _wordListPath;
  public String getWordListPath() { return this._wordListPath; }
  public CompoundWordTokenFilterBase setWordListPath(String val) { this._wordListPath = val; return this; }

}
