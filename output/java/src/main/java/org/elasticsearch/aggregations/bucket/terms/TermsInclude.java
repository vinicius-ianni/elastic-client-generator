
package org.elasticsearch.aggregations.bucket.terms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TermsInclude  {
  
  private Long _numPartitions;
  public Long getNumPartitions() { return this._numPartitions; }
  public TermsInclude setNumPartitions(Long val) { this._numPartitions = val; return this; }


  private Long _partition;
  public Long getPartition() { return this._partition; }
  public TermsInclude setPartition(Long val) { this._partition = val; return this; }


  private String _pattern;
  public String getPattern() { return this._pattern; }
  public TermsInclude setPattern(String val) { this._pattern = val; return this; }


  private String[] _values;
  public String[] getValues() { return this._values; }
  public TermsInclude setValues(String[] val) { this._values = val; return this; }

}
