
package org.elasticsearch.cat.cat_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CatTasksRequest  {
  
  private String[] _actions;
  public String[] getActions() { return this._actions; }
  public CatTasksRequest setActions(String[] val) { this._actions = val; return this; }


  private Boolean _detailed;
  public Boolean getDetailed() { return this._detailed; }
  public CatTasksRequest setDetailed(Boolean val) { this._detailed = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public CatTasksRequest setFormat(String val) { this._format = val; return this; }


  private String[] _headers;
  public String[] getHeaders() { return this._headers; }
  public CatTasksRequest setHeaders(String[] val) { this._headers = val; return this; }


  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatTasksRequest setHelp(Boolean val) { this._help = val; return this; }


  private String[] _nodeId;
  public String[] getNodeId() { return this._nodeId; }
  public CatTasksRequest setNodeId(String[] val) { this._nodeId = val; return this; }


  private Long _parentTask;
  public Long getParentTask() { return this._parentTask; }
  public CatTasksRequest setParentTask(Long val) { this._parentTask = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatTasksRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatTasksRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
