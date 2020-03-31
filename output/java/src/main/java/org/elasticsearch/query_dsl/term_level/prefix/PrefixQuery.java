
package org.elasticsearch.query_dsl.term_level.prefix;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.multi_term_query_rewrite.*;

public class PrefixQuery  {
  
  private MultiTermQueryRewrite _rewrite;
  public MultiTermQueryRewrite getRewrite() { return this._rewrite; }
  public PrefixQuery setRewrite(MultiTermQueryRewrite val) { this._rewrite = val; return this; }

}
