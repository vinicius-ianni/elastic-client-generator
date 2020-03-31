
package org.elasticsearch.document.multiple.reindex_rethrottle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.task_id.*;
import org.elasticsearch.document.multiple.reindex_rethrottle.*;

public class ReindexNode  {
  
  private Map<String, String> _attributes;
  public Map<String, String> getAttributes() { return this._attributes; }
  public ReindexNode setAttributes(Map<String, String> val) { this._attributes = val; return this; }


  private String _host;
  public String getHost() { return this._host; }
  public ReindexNode setHost(String val) { this._host = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public ReindexNode setIp(String val) { this._ip = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public ReindexNode setName(String val) { this._name = val; return this; }


  private String[] _roles;
  public String[] getRoles() { return this._roles; }
  public ReindexNode setRoles(String[] val) { this._roles = val; return this; }


  private Map<TaskId, ReindexTask> _tasks;
  public Map<TaskId, ReindexTask> getTasks() { return this._tasks; }
  public ReindexNode setTasks(Map<TaskId, ReindexTask> val) { this._tasks = val; return this; }


  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public ReindexNode setTransportAddress(String val) { this._transportAddress = val; return this; }

}
