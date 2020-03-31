
package org.elasticsearch.analysis.plugins.icu;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.plugins.icu.transform.*;

public class IcuTransformTokenFilter  {
  
  private IcuTransformDirection _dir;
  public IcuTransformDirection getDir() { return this._dir; }
  public IcuTransformTokenFilter setDir(IcuTransformDirection val) { this._dir = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public IcuTransformTokenFilter setId(String val) { this._id = val; return this; }

}
