
package org.elasticsearch.cluster.task_management.list_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.task_id.*;
import org.elasticsearch.cluster.task_management.list_tasks.*;

public class TaskExecutingNode  {
  
  private Map<String, String> _attributes;
  public Map<String, String> getAttributes() { return this._attributes; }
  public TaskExecutingNode setAttributes(Map<String, String> val) { this._attributes = val; return this; }


  private String _host;
  public String getHost() { return this._host; }
  public TaskExecutingNode setHost(String val) { this._host = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public TaskExecutingNode setIp(String val) { this._ip = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public TaskExecutingNode setName(String val) { this._name = val; return this; }


  private String[] _roles;
  public String[] getRoles() { return this._roles; }
  public TaskExecutingNode setRoles(String[] val) { this._roles = val; return this; }


  private Map<TaskId, TaskState> _tasks;
  public Map<TaskId, TaskState> getTasks() { return this._tasks; }
  public TaskExecutingNode setTasks(Map<TaskId, TaskState> val) { this._tasks = val; return this; }


  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public TaskExecutingNode setTransportAddress(String val) { this._transportAddress = val; return this; }

}
