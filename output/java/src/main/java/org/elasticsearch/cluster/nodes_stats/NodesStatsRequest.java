
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class NodesStatsRequest  {
  
  private Field[] _completionFields;
  public Field[] getCompletionFields() { return this._completionFields; }
  public NodesStatsRequest setCompletionFields(Field[] val) { this._completionFields = val; return this; }


  private Field[] _fielddataFields;
  public Field[] getFielddataFields() { return this._fielddataFields; }
  public NodesStatsRequest setFielddataFields(Field[] val) { this._fielddataFields = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public NodesStatsRequest setFields(Field[] val) { this._fields = val; return this; }


  private Boolean _groups;
  public Boolean getGroups() { return this._groups; }
  public NodesStatsRequest setGroups(Boolean val) { this._groups = val; return this; }


  private Boolean _includeSegmentFileSizes;
  public Boolean getIncludeSegmentFileSizes() { return this._includeSegmentFileSizes; }
  public NodesStatsRequest setIncludeSegmentFileSizes(Boolean val) { this._includeSegmentFileSizes = val; return this; }


  private Level _level;
  public Level getLevel() { return this._level; }
  public NodesStatsRequest setLevel(Level val) { this._level = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public NodesStatsRequest setTimeout(Time val) { this._timeout = val; return this; }


  private String[] _types;
  public String[] getTypes() { return this._types; }
  public NodesStatsRequest setTypes(String[] val) { this._types = val; return this; }

}
