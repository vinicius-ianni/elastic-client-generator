
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common.*;

public class IndicesStatsRequest  {
  
  private Field[] _completionFields;
  public Field[] getCompletionFields() { return this._completionFields; }
  public IndicesStatsRequest setCompletionFields(Field[] val) { this._completionFields = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public IndicesStatsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Field[] _fielddataFields;
  public Field[] getFielddataFields() { return this._fielddataFields; }
  public IndicesStatsRequest setFielddataFields(Field[] val) { this._fielddataFields = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public IndicesStatsRequest setFields(Field[] val) { this._fields = val; return this; }


  private Boolean _forbidClosedIndices;
  public Boolean getForbidClosedIndices() { return this._forbidClosedIndices; }
  public IndicesStatsRequest setForbidClosedIndices(Boolean val) { this._forbidClosedIndices = val; return this; }


  private String[] _groups;
  public String[] getGroups() { return this._groups; }
  public IndicesStatsRequest setGroups(String[] val) { this._groups = val; return this; }


  private Boolean _includeSegmentFileSizes;
  public Boolean getIncludeSegmentFileSizes() { return this._includeSegmentFileSizes; }
  public IndicesStatsRequest setIncludeSegmentFileSizes(Boolean val) { this._includeSegmentFileSizes = val; return this; }


  private Boolean _includeUnloadedSegments;
  public Boolean getIncludeUnloadedSegments() { return this._includeUnloadedSegments; }
  public IndicesStatsRequest setIncludeUnloadedSegments(Boolean val) { this._includeUnloadedSegments = val; return this; }


  private Level _level;
  public Level getLevel() { return this._level; }
  public IndicesStatsRequest setLevel(Level val) { this._level = val; return this; }

}
