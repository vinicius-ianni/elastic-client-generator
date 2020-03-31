
package org.elasticsearch.search.suggesters.phrase_suggester;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.suggesters.phrase_suggester.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model.*;

public class PhraseSuggester  {
  
  private PhraseSuggestCollate _collate;
  public PhraseSuggestCollate getCollate() { return this._collate; }
  public PhraseSuggester setCollate(PhraseSuggestCollate val) { this._collate = val; return this; }


  private Double _confidence;
  public Double getConfidence() { return this._confidence; }
  public PhraseSuggester setConfidence(Double val) { this._confidence = val; return this; }


  private DirectGenerator[] _directGenerator;
  public DirectGenerator[] getDirectGenerator() { return this._directGenerator; }
  public PhraseSuggester setDirectGenerator(DirectGenerator[] val) { this._directGenerator = val; return this; }


  private Boolean _forceUnigrams;
  public Boolean getForceUnigrams() { return this._forceUnigrams; }
  public PhraseSuggester setForceUnigrams(Boolean val) { this._forceUnigrams = val; return this; }


  private Integer _gramSize;
  public Integer getGramSize() { return this._gramSize; }
  public PhraseSuggester setGramSize(Integer val) { this._gramSize = val; return this; }


  private PhraseSuggestHighlight _highlight;
  public PhraseSuggestHighlight getHighlight() { return this._highlight; }
  public PhraseSuggester setHighlight(PhraseSuggestHighlight val) { this._highlight = val; return this; }


  private Double _maxErrors;
  public Double getMaxErrors() { return this._maxErrors; }
  public PhraseSuggester setMaxErrors(Double val) { this._maxErrors = val; return this; }


  private Double _realWordErrorLikelihood;
  public Double getRealWordErrorLikelihood() { return this._realWordErrorLikelihood; }
  public PhraseSuggester setRealWordErrorLikelihood(Double val) { this._realWordErrorLikelihood = val; return this; }


  private String _separator;
  public String getSeparator() { return this._separator; }
  public PhraseSuggester setSeparator(String val) { this._separator = val; return this; }


  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public PhraseSuggester setShardSize(Integer val) { this._shardSize = val; return this; }


  private SmoothingModelContainer _smoothing;
  public SmoothingModelContainer getSmoothing() { return this._smoothing; }
  public PhraseSuggester setSmoothing(SmoothingModelContainer val) { this._smoothing = val; return this; }


  private String _text;
  public String getText() { return this._text; }
  public PhraseSuggester setText(String val) { this._text = val; return this; }


  private Integer _tokenLimit;
  public Integer getTokenLimit() { return this._tokenLimit; }
  public PhraseSuggester setTokenLimit(Integer val) { this._tokenLimit = val; return this; }

}
