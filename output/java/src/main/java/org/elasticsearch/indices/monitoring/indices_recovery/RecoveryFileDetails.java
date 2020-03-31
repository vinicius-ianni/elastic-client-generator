
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RecoveryFileDetails  {
  
  private Long _length;
  public Long getLength() { return this._length; }
  public RecoveryFileDetails setLength(Long val) { this._length = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public RecoveryFileDetails setName(String val) { this._name = val; return this; }


  private Long _recovered;
  public Long getRecovered() { return this._recovered; }
  public RecoveryFileDetails setRecovered(Long val) { this._recovered = val; return this; }

}
