
package org.elasticsearch.ingest.put_pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.ingest.*;
import org.elasticsearch.common_options.time_unit.*;

public class PutPipelineRequest  {
  
  private String _description;
  public String getDescription() { return this._description; }
  public PutPipelineRequest setDescription(String val) { this._description = val; return this; }


  private Processor[] _onFailure;
  public Processor[] getOnFailure() { return this._onFailure; }
  public PutPipelineRequest setOnFailure(Processor[] val) { this._onFailure = val; return this; }


  private Processor[] _processors;
  public Processor[] getProcessors() { return this._processors; }
  public PutPipelineRequest setProcessors(Processor[] val) { this._processors = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public PutPipelineRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public PutPipelineRequest setTimeout(Time val) { this._timeout = val; return this; }

}
