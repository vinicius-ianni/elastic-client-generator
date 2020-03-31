
package org.elasticsearch.query_dsl.full_text.intervals;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.full_text.intervals.*;

public class IntervalsContainer  {
  
  private IntervalsAllOf _allOf;
  public IntervalsAllOf getAllOf() { return this._allOf; }
  public IntervalsContainer setAllOf(IntervalsAllOf val) { this._allOf = val; return this; }


  private IntervalsAnyOf _anyOf;
  public IntervalsAnyOf getAnyOf() { return this._anyOf; }
  public IntervalsContainer setAnyOf(IntervalsAnyOf val) { this._anyOf = val; return this; }


  private IntervalsMatch _match;
  public IntervalsMatch getMatch() { return this._match; }
  public IntervalsContainer setMatch(IntervalsMatch val) { this._match = val; return this; }


  private IntervalsPrefix _prefix;
  public IntervalsPrefix getPrefix() { return this._prefix; }
  public IntervalsContainer setPrefix(IntervalsPrefix val) { this._prefix = val; return this; }


  private IntervalsWildcard _wildcard;
  public IntervalsWildcard getWildcard() { return this._wildcard; }
  public IntervalsContainer setWildcard(IntervalsWildcard val) { this._wildcard = val; return this; }

}
