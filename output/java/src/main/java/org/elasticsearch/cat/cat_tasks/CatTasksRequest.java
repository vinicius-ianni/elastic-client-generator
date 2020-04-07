
package org.elasticsearch.cat.cat_tasks;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class CatTasksRequest  implements XContentable<CatTasksRequest> {
  
  static final ParseField ACTIONS = new ParseField("actions");
  private List<String> _actions;
  public List<String> getActions() { return this._actions; }
  public CatTasksRequest setActions(List<String> val) { this._actions = val; return this; }


  static final ParseField DETAILED = new ParseField("detailed");
  private Boolean _detailed;
  public Boolean getDetailed() { return this._detailed; }
  public CatTasksRequest setDetailed(Boolean val) { this._detailed = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatTasksRequest setFormat(String val) { this._format = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatTasksRequest setHeaders(List<String> val) { this._headers = val; return this; }


  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatTasksRequest setHelp(Boolean val) { this._help = val; return this; }


  static final ParseField NODE_ID = new ParseField("node_id");
  private List<String> _nodeId;
  public List<String> getNodeId() { return this._nodeId; }
  public CatTasksRequest setNodeId(List<String> val) { this._nodeId = val; return this; }


  static final ParseField PARENT_TASK = new ParseField("parent_task");
  private Long _parentTask;
  public Long getParentTask() { return this._parentTask; }
  public CatTasksRequest setParentTask(Long val) { this._parentTask = val; return this; }


  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatTasksRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatTasksRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatTasksRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatTasksRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatTasksRequest, Void> PARSER =
    new ConstructingObjectParser<>(CatTasksRequest.class.getName(), false, args -> new CatTasksRequest());

  static {
    PARSER.declareStringArray(CatTasksRequest::setActions, ACTIONS);
    PARSER.declareBoolean(CatTasksRequest::setDetailed, DETAILED);
    PARSER.declareString(CatTasksRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatTasksRequest::setHeaders, HEADERS);
    PARSER.declareBoolean(CatTasksRequest::setHelp, HELP);
    PARSER.declareStringArray(CatTasksRequest::setNodeId, NODE_ID);
    PARSER.declareLong(CatTasksRequest::setParentTask, PARENT_TASK);
    PARSER.declareStringArray(CatTasksRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatTasksRequest::setVerbose, VERBOSE);
  }

}
