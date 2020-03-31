
package org.elasticsearch.modules.snapshot_and_restore.repositories.verify_repository;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CompactNodeInfo  {
  
  private String _name;
  public String getName() { return this._name; }
  public CompactNodeInfo setName(String val) { this._name = val; return this; }

}
