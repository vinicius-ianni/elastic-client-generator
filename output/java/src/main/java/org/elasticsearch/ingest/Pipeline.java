
package org.elasticsearch.ingest;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.ingest.*;

public class Pipeline  {
  
  private String _description;
  public String getDescription() { return this._description; }
  public Pipeline setDescription(String val) { this._description = val; return this; }


  private Processor[] _onFailure;
  public Processor[] getOnFailure() { return this._onFailure; }
  public Pipeline setOnFailure(Processor[] val) { this._onFailure = val; return this; }


  private Processor[] _processors;
  public Processor[] getProcessors() { return this._processors; }
  public Pipeline setProcessors(Processor[] val) { this._processors = val; return this; }

}
