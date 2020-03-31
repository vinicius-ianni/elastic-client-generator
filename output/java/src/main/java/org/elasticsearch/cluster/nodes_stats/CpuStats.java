
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CpuStats  {
  
  private Integer _percent;
  public Integer getPercent() { return this._percent; }
  public CpuStats setPercent(Integer val) { this._percent = val; return this; }


  private String _sys;
  public String getSys() { return this._sys; }
  public CpuStats setSys(String val) { this._sys = val; return this; }


  private Long _sysInMillis;
  public Long getSysInMillis() { return this._sysInMillis; }
  public CpuStats setSysInMillis(Long val) { this._sysInMillis = val; return this; }


  private String _total;
  public String getTotal() { return this._total; }
  public CpuStats setTotal(String val) { this._total = val; return this; }


  private Long _totalInMillis;
  public Long getTotalInMillis() { return this._totalInMillis; }
  public CpuStats setTotalInMillis(Long val) { this._totalInMillis = val; return this; }


  private String _user;
  public String getUser() { return this._user; }
  public CpuStats setUser(String val) { this._user = val; return this; }


  private Long _userInMillis;
  public Long getUserInMillis() { return this._userInMillis; }
  public CpuStats setUserInMillis(Long val) { this._userInMillis = val; return this; }

}
