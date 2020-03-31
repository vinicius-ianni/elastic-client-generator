
package org.elasticsearch.mapping.types.specialized.completion;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.mapping.types.specialized.completion.*;
import org.elasticsearch.internal.*;

public class CompletionProperty  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public CompletionProperty setAnalyzer(String val) { this._analyzer = val; return this; }


  private SuggestContext[] _contexts;
  public SuggestContext[] getContexts() { return this._contexts; }
  public CompletionProperty setContexts(SuggestContext[] val) { this._contexts = val; return this; }


  private Integer _maxInputLength;
  public Integer getMaxInputLength() { return this._maxInputLength; }
  public CompletionProperty setMaxInputLength(Integer val) { this._maxInputLength = val; return this; }


  private Boolean _preservePositionIncrements;
  public Boolean getPreservePositionIncrements() { return this._preservePositionIncrements; }
  public CompletionProperty setPreservePositionIncrements(Boolean val) { this._preservePositionIncrements = val; return this; }


  private Boolean _preserveSeparators;
  public Boolean getPreserveSeparators() { return this._preserveSeparators; }
  public CompletionProperty setPreserveSeparators(Boolean val) { this._preserveSeparators = val; return this; }


  private String _searchAnalyzer;
  public String getSearchAnalyzer() { return this._searchAnalyzer; }
  public CompletionProperty setSearchAnalyzer(String val) { this._searchAnalyzer = val; return this; }

}
