
package org.elasticsearch.x_pack.slm;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.slm.*;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class SnapshotLifecyclePolicy  {
  
  private SnapshotLifecycleConfig _config;
  public SnapshotLifecycleConfig getConfig() { return this._config; }
  public SnapshotLifecyclePolicy setConfig(SnapshotLifecycleConfig val) { this._config = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public SnapshotLifecyclePolicy setName(String val) { this._name = val; return this; }


  private String _repository;
  public String getRepository() { return this._repository; }
  public SnapshotLifecyclePolicy setRepository(String val) { this._repository = val; return this; }


  private CronExpression _schedule;
  public CronExpression getSchedule() { return this._schedule; }
  public SnapshotLifecyclePolicy setSchedule(CronExpression val) { this._schedule = val; return this; }

}
