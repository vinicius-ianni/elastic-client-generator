
package org.elasticsearch.mapping.types.specialized.field_alias;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class FieldAliasProperty  {
  
  private Field _path;
  public Field getPath() { return this._path; }
  public FieldAliasProperty setPath(Field val) { this._path = val; return this; }

}
