
package org.elasticsearch.aggregations.metric.top_hits;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.highlighting.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.search.search.source_filtering.*;

public class TopHitsAggregation  {
  
  private Field[] _docvalueFields;
  public Field[] getDocvalueFields() { return this._docvalueFields; }
  public TopHitsAggregation setDocvalueFields(Field[] val) { this._docvalueFields = val; return this; }


  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public TopHitsAggregation setExplain(Boolean val) { this._explain = val; return this; }


  private Integer _from;
  public Integer getFrom() { return this._from; }
  public TopHitsAggregation setFrom(Integer val) { this._from = val; return this; }


  private Highlight _highlight;
  public Highlight getHighlight() { return this._highlight; }
  public TopHitsAggregation setHighlight(Highlight val) { this._highlight = val; return this; }


  private Map<String, ScriptField> _scriptFields;
  public Map<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public TopHitsAggregation setScriptFields(Map<String, ScriptField> val) { this._scriptFields = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public TopHitsAggregation setSize(Integer val) { this._size = val; return this; }


  private Sort[] _sort;
  public Sort[] getSort() { return this._sort; }
  public TopHitsAggregation setSort(Sort[] val) { this._sort = val; return this; }


  private Either<Boolean, SourceFilter> _source;
  public Either<Boolean, SourceFilter> getSource() { return this._source; }
  public TopHitsAggregation setSource(Either<Boolean, SourceFilter> val) { this._source = val; return this; }


  private Field[] _storedFields;
  public Field[] getStoredFields() { return this._storedFields; }
  public TopHitsAggregation setStoredFields(Field[] val) { this._storedFields = val; return this; }


  private Boolean _trackScores;
  public Boolean getTrackScores() { return this._trackScores; }
  public TopHitsAggregation setTrackScores(Boolean val) { this._trackScores = val; return this; }


  private Boolean _version;
  public Boolean getVersion() { return this._version; }
  public TopHitsAggregation setVersion(Boolean val) { this._version = val; return this; }

}
