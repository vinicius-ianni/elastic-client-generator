
package org.elasticsearch.indices.analyze;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ExplainAnalyzeToken  {
  
  private String _bytes;
  public String getBytes() { return this._bytes; }
  public ExplainAnalyzeToken setBytes(String val) { this._bytes = val; return this; }


  private Long _endOffset;
  public Long getEndOffset() { return this._endOffset; }
  public ExplainAnalyzeToken setEndOffset(Long val) { this._endOffset = val; return this; }


  private Boolean _keyword;
  public Boolean getKeyword() { return this._keyword; }
  public ExplainAnalyzeToken setKeyword(Boolean val) { this._keyword = val; return this; }


  private Long _position;
  public Long getPosition() { return this._position; }
  public ExplainAnalyzeToken setPosition(Long val) { this._position = val; return this; }


  private Long _positionLength;
  public Long getPositionLength() { return this._positionLength; }
  public ExplainAnalyzeToken setPositionLength(Long val) { this._positionLength = val; return this; }


  private Long _startOffset;
  public Long getStartOffset() { return this._startOffset; }
  public ExplainAnalyzeToken setStartOffset(Long val) { this._startOffset = val; return this; }


  private Long _termFrequency;
  public Long getTermFrequency() { return this._termFrequency; }
  public ExplainAnalyzeToken setTermFrequency(Long val) { this._termFrequency = val; return this; }


  private String _token;
  public String getToken() { return this._token; }
  public ExplainAnalyzeToken setToken(String val) { this._token = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public ExplainAnalyzeToken setType(String val) { this._type = val; return this; }

}
