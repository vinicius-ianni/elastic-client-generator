
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CategoryDefinition  {
  
  private Long _categoryId;
  public Long getCategoryId() { return this._categoryId; }
  public CategoryDefinition setCategoryId(Long val) { this._categoryId = val; return this; }


  private String[] _examples;
  public String[] getExamples() { return this._examples; }
  public CategoryDefinition setExamples(String[] val) { this._examples = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public CategoryDefinition setJobId(String val) { this._jobId = val; return this; }


  private Long _maxMatchingLength;
  public Long getMaxMatchingLength() { return this._maxMatchingLength; }
  public CategoryDefinition setMaxMatchingLength(Long val) { this._maxMatchingLength = val; return this; }


  private String _regex;
  public String getRegex() { return this._regex; }
  public CategoryDefinition setRegex(String val) { this._regex = val; return this; }


  private String _terms;
  public String getTerms() { return this._terms; }
  public CategoryDefinition setTerms(String val) { this._terms = val; return this; }

}
