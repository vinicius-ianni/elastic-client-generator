
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class DataDescription  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public DataDescription setFormat(String val) { this._format = val; return this; }


  private Field _timeField;
  public Field getTimeField() { return this._timeField; }
  public DataDescription setTimeField(Field val) { this._timeField = val; return this; }


  private String _timeFormat;
  public String getTimeFormat() { return this._timeFormat; }
  public DataDescription setTimeFormat(String val) { this._timeFormat = val; return this; }

}
