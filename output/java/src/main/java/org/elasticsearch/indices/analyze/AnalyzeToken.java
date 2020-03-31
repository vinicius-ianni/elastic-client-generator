
package org.elasticsearch.indices.analyze;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class AnalyzeToken  {
  
  private Long _endOffset;
  public Long getEndOffset() { return this._endOffset; }
  public AnalyzeToken setEndOffset(Long val) { this._endOffset = val; return this; }


  private Long _position;
  public Long getPosition() { return this._position; }
  public AnalyzeToken setPosition(Long val) { this._position = val; return this; }


  private Long _positionLength;
  public Long getPositionLength() { return this._positionLength; }
  public AnalyzeToken setPositionLength(Long val) { this._positionLength = val; return this; }


  private Long _startOffset;
  public Long getStartOffset() { return this._startOffset; }
  public AnalyzeToken setStartOffset(Long val) { this._startOffset = val; return this; }


  private String _token;
  public String getToken() { return this._token; }
  public AnalyzeToken setToken(String val) { this._token = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public AnalyzeToken setType(String val) { this._type = val; return this; }

}
