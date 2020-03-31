
package org.elasticsearch.x_pack.ilm;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ilm.*;

public class Phases  {
  
  private Phase _cold;
  public Phase getCold() { return this._cold; }
  public Phases setCold(Phase val) { this._cold = val; return this; }


  private Phase _delete;
  public Phase getDelete() { return this._delete; }
  public Phases setDelete(Phase val) { this._delete = val; return this; }


  private Phase _hot;
  public Phase getHot() { return this._hot; }
  public Phases setHot(Phase val) { this._hot = val; return this; }


  private Phase _warm;
  public Phase getWarm() { return this._warm; }
  public Phases setWarm(Phase val) { this._warm = val; return this; }

}
