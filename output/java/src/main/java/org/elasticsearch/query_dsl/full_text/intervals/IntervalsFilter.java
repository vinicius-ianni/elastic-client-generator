
package org.elasticsearch.query_dsl.full_text.intervals;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.full_text.intervals.*;
import org.elasticsearch.common_options.scripting.*;

public class IntervalsFilter  {
  
  private IntervalsContainer _after;
  public IntervalsContainer getAfter() { return this._after; }
  public IntervalsFilter setAfter(IntervalsContainer val) { this._after = val; return this; }


  private IntervalsContainer _before;
  public IntervalsContainer getBefore() { return this._before; }
  public IntervalsFilter setBefore(IntervalsContainer val) { this._before = val; return this; }


  private IntervalsContainer _containedBy;
  public IntervalsContainer getContainedBy() { return this._containedBy; }
  public IntervalsFilter setContainedBy(IntervalsContainer val) { this._containedBy = val; return this; }


  private IntervalsContainer _containing;
  public IntervalsContainer getContaining() { return this._containing; }
  public IntervalsFilter setContaining(IntervalsContainer val) { this._containing = val; return this; }


  private IntervalsContainer _notContainedBy;
  public IntervalsContainer getNotContainedBy() { return this._notContainedBy; }
  public IntervalsFilter setNotContainedBy(IntervalsContainer val) { this._notContainedBy = val; return this; }


  private IntervalsContainer _notContaining;
  public IntervalsContainer getNotContaining() { return this._notContaining; }
  public IntervalsFilter setNotContaining(IntervalsContainer val) { this._notContaining = val; return this; }


  private IntervalsContainer _notOverlapping;
  public IntervalsContainer getNotOverlapping() { return this._notOverlapping; }
  public IntervalsFilter setNotOverlapping(IntervalsContainer val) { this._notOverlapping = val; return this; }


  private IntervalsContainer _overlapping;
  public IntervalsContainer getOverlapping() { return this._overlapping; }
  public IntervalsFilter setOverlapping(IntervalsContainer val) { this._overlapping = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public IntervalsFilter setScript(Script val) { this._script = val; return this; }

}
