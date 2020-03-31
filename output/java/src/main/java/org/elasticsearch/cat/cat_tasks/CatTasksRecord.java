
package org.elasticsearch.cat.cat_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatTasksRecord  {
  
  private String _action;
  public String getAction() { return this._action; }
  public CatTasksRecord setAction(String val) { this._action = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public CatTasksRecord setIp(String val) { this._ip = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public CatTasksRecord setNode(String val) { this._node = val; return this; }


  private String _parentTaskId;
  public String getParentTaskId() { return this._parentTaskId; }
  public CatTasksRecord setParentTaskId(String val) { this._parentTaskId = val; return this; }


  private String _runningTime;
  public String getRunningTime() { return this._runningTime; }
  public CatTasksRecord setRunningTime(String val) { this._runningTime = val; return this; }


  private String _startTime;
  public String getStartTime() { return this._startTime; }
  public CatTasksRecord setStartTime(String val) { this._startTime = val; return this; }


  private String _taskId;
  public String getTaskId() { return this._taskId; }
  public CatTasksRecord setTaskId(String val) { this._taskId = val; return this; }


  private String _timestamp;
  public String getTimestamp() { return this._timestamp; }
  public CatTasksRecord setTimestamp(String val) { this._timestamp = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public CatTasksRecord setType(String val) { this._type = val; return this; }

}
