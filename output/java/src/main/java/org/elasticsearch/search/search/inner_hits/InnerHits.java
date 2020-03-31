
package org.elasticsearch.search.search.inner_hits;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.collapsing.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.highlighting.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.search.search.source_filtering.*;

public class InnerHits  {
  
  private FieldCollapse _collapse;
  public FieldCollapse getCollapse() { return this._collapse; }
  public InnerHits setCollapse(FieldCollapse val) { this._collapse = val; return this; }


  private Field[] _docvalueFields;
  public Field[] getDocvalueFields() { return this._docvalueFields; }
  public InnerHits setDocvalueFields(Field[] val) { this._docvalueFields = val; return this; }


  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public InnerHits setExplain(Boolean val) { this._explain = val; return this; }


  private Integer _from;
  public Integer getFrom() { return this._from; }
  public InnerHits setFrom(Integer val) { this._from = val; return this; }


  private Highlight _highlight;
  public Highlight getHighlight() { return this._highlight; }
  public InnerHits setHighlight(Highlight val) { this._highlight = val; return this; }


  private Boolean _ignoreUnmapped;
  public Boolean getIgnoreUnmapped() { return this._ignoreUnmapped; }
  public InnerHits setIgnoreUnmapped(Boolean val) { this._ignoreUnmapped = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public InnerHits setName(String val) { this._name = val; return this; }


  private Map<String, ScriptField> _scriptFields;
  public Map<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public InnerHits setScriptFields(Map<String, ScriptField> val) { this._scriptFields = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public InnerHits setSize(Integer val) { this._size = val; return this; }


  private Sort[] _sort;
  public Sort[] getSort() { return this._sort; }
  public InnerHits setSort(Sort[] val) { this._sort = val; return this; }


  private Either<Boolean, SourceFilter> _source;
  public Either<Boolean, SourceFilter> getSource() { return this._source; }
  public InnerHits setSource(Either<Boolean, SourceFilter> val) { this._source = val; return this; }


  private Boolean _version;
  public Boolean getVersion() { return this._version; }
  public InnerHits setVersion(Boolean val) { this._version = val; return this; }

}
