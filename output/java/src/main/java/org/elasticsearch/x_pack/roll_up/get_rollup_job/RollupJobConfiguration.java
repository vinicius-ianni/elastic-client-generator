
package org.elasticsearch.x_pack.roll_up.get_rollup_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.roll_up.rollup_configuration.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_options.time_unit.*;

public class RollupJobConfiguration  {
  
  private String _cron;
  public String getCron() { return this._cron; }
  public RollupJobConfiguration setCron(String val) { this._cron = val; return this; }


  private RollupGroupings _groups;
  public RollupGroupings getGroups() { return this._groups; }
  public RollupJobConfiguration setGroups(RollupGroupings val) { this._groups = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public RollupJobConfiguration setId(String val) { this._id = val; return this; }


  private String _indexPattern;
  public String getIndexPattern() { return this._indexPattern; }
  public RollupJobConfiguration setIndexPattern(String val) { this._indexPattern = val; return this; }


  private RollupFieldMetric[] _metrics;
  public RollupFieldMetric[] getMetrics() { return this._metrics; }
  public RollupJobConfiguration setMetrics(RollupFieldMetric[] val) { this._metrics = val; return this; }


  private Long _pageSize;
  public Long getPageSize() { return this._pageSize; }
  public RollupJobConfiguration setPageSize(Long val) { this._pageSize = val; return this; }


  private IndexName _rollupIndex;
  public IndexName getRollupIndex() { return this._rollupIndex; }
  public RollupJobConfiguration setRollupIndex(IndexName val) { this._rollupIndex = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public RollupJobConfiguration setTimeout(Time val) { this._timeout = val; return this; }

}
