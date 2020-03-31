
package org.elasticsearch.x_pack.machine_learning.post_job_data;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class PostJobDataRequest  {
  
  private Date _resetEnd;
  public Date getResetEnd() { return this._resetEnd; }
  public PostJobDataRequest setResetEnd(Date val) { this._resetEnd = val; return this; }


  private Date _resetStart;
  public Date getResetStart() { return this._resetStart; }
  public PostJobDataRequest setResetStart(Date val) { this._resetStart = val; return this; }


  private Object[] _data;
  public Object[] getData() { return this._data; }
  public PostJobDataRequest setData(Object[] val) { this._data = val; return this; }

}
