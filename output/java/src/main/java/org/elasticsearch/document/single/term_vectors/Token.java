
package org.elasticsearch.document.single.term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class Token  {
  
  private Integer _endOffset;
  public Integer getEndOffset() { return this._endOffset; }
  public Token setEndOffset(Integer val) { this._endOffset = val; return this; }


  private String _payload;
  public String getPayload() { return this._payload; }
  public Token setPayload(String val) { this._payload = val; return this; }


  private Integer _position;
  public Integer getPosition() { return this._position; }
  public Token setPosition(Integer val) { this._position = val; return this; }


  private Integer _startOffset;
  public Integer getStartOffset() { return this._startOffset; }
  public Token setStartOffset(Integer val) { this._startOffset = val; return this; }

}
