
package org.elasticsearch.x_pack.graph.explore.request;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.graph.explore.request.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class GraphExploreControls  {
  
  private SampleDiversity _sampleDiversity;
  public SampleDiversity getSampleDiversity() { return this._sampleDiversity; }
  public GraphExploreControls setSampleDiversity(SampleDiversity val) { this._sampleDiversity = val; return this; }


  private Integer _sampleSize;
  public Integer getSampleSize() { return this._sampleSize; }
  public GraphExploreControls setSampleSize(Integer val) { this._sampleSize = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public GraphExploreControls setTimeout(Time val) { this._timeout = val; return this; }


  private Boolean _useSignificance;
  public Boolean getUseSignificance() { return this._useSignificance; }
  public GraphExploreControls setUseSignificance(Boolean val) { this._useSignificance = val; return this; }

}
