
package org.elasticsearch.x_pack.roll_up.rollup_configuration;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class TermsRollupGrouping  {
  
  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public TermsRollupGrouping setFields(Field[] val) { this._fields = val; return this; }

}
