
package org.elasticsearch.modules.snapshot_and_restore.repositories;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class SnapshotRepository  {
  
  private String _type;
  public String getType() { return this._type; }
  public SnapshotRepository setType(String val) { this._type = val; return this; }

}
