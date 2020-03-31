
package org.elasticsearch.search.search.source_filtering;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class SourceFilter  {
  
  private Field[] _excludes;
  public Field[] getExcludes() { return this._excludes; }
  public SourceFilter setExcludes(Field[] val) { this._excludes = val; return this; }


  private Field[] _includes;
  public Field[] getIncludes() { return this._includes; }
  public SourceFilter setIncludes(Field[] val) { this._includes = val; return this; }

}
