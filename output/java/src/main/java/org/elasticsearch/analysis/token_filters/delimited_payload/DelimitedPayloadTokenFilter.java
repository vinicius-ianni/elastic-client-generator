
package org.elasticsearch.analysis.token_filters.delimited_payload;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.token_filters.delimited_payload.*;

public class DelimitedPayloadTokenFilter  {
  
  private String _delimiter;
  public String getDelimiter() { return this._delimiter; }
  public DelimitedPayloadTokenFilter setDelimiter(String val) { this._delimiter = val; return this; }


  private DelimitedPayloadEncoding _encoding;
  public DelimitedPayloadEncoding getEncoding() { return this._encoding; }
  public DelimitedPayloadTokenFilter setEncoding(DelimitedPayloadEncoding val) { this._encoding = val; return this; }

}
