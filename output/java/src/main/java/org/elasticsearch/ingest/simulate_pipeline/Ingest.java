
package org.elasticsearch.ingest.simulate_pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class Ingest  {
  
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public Ingest setTimestamp(Date val) { this._timestamp = val; return this; }

}
