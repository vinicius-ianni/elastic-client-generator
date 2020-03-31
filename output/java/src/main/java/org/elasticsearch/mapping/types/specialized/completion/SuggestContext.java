
package org.elasticsearch.mapping.types.specialized.completion;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class SuggestContext  {
  
  private String _name;
  public String getName() { return this._name; }
  public SuggestContext setName(String val) { this._name = val; return this; }


  private Field _path;
  public Field getPath() { return this._path; }
  public SuggestContext setPath(Field val) { this._path = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public SuggestContext setType(String val) { this._type = val; return this; }

}
