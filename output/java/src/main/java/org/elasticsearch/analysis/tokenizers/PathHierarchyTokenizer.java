
package org.elasticsearch.analysis.tokenizers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class PathHierarchyTokenizer  {
  
  private Integer _bufferSize;
  public Integer getBufferSize() { return this._bufferSize; }
  public PathHierarchyTokenizer setBufferSize(Integer val) { this._bufferSize = val; return this; }


  private String _delimiter;
  public String getDelimiter() { return this._delimiter; }
  public PathHierarchyTokenizer setDelimiter(String val) { this._delimiter = val; return this; }


  private String _replacement;
  public String getReplacement() { return this._replacement; }
  public PathHierarchyTokenizer setReplacement(String val) { this._replacement = val; return this; }


  private Boolean _reverse;
  public Boolean getReverse() { return this._reverse; }
  public PathHierarchyTokenizer setReverse(Boolean val) { this._reverse = val; return this; }


  private Integer _skip;
  public Integer getSkip() { return this._skip; }
  public PathHierarchyTokenizer setSkip(Integer val) { this._skip = val; return this; }

}
