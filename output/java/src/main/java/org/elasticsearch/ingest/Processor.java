
package org.elasticsearch.ingest;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.ingest.*;

public class Processor  {
  
  private String _name;
  public String getName() { return this._name; }
  public Processor setName(String val) { this._name = val; return this; }


  private Processor[] _onFailure;
  public Processor[] getOnFailure() { return this._onFailure; }
  public Processor setOnFailure(Processor[] val) { this._onFailure = val; return this; }


  private String _if;
  public String getIf() { return this._if; }
  public Processor setIf(String val) { this._if = val; return this; }


  private String _tag;
  public String getTag() { return this._tag; }
  public Processor setTag(String val) { this._tag = val; return this; }


  private Boolean _ignoreFailure;
  public Boolean getIgnoreFailure() { return this._ignoreFailure; }
  public Processor setIgnoreFailure(Boolean val) { this._ignoreFailure = val; return this; }

}
