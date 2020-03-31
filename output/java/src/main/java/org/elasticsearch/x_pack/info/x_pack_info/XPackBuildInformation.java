
package org.elasticsearch.x_pack.info.x_pack_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class XPackBuildInformation  {
  
  private Date _date;
  public Date getDate() { return this._date; }
  public XPackBuildInformation setDate(Date val) { this._date = val; return this; }


  private String _hash;
  public String getHash() { return this._hash; }
  public XPackBuildInformation setHash(String val) { this._hash = val; return this; }

}
