
package org.elasticsearch.modules.indices.fielddata;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.indices.fielddata.*;

public class Fielddata  {
  
  private FielddataFilter _filter;
  public FielddataFilter getFilter() { return this._filter; }
  public Fielddata setFilter(FielddataFilter val) { this._filter = val; return this; }


  private FielddataLoading _loading;
  public FielddataLoading getLoading() { return this._loading; }
  public Fielddata setLoading(FielddataLoading val) { this._loading = val; return this; }

}
