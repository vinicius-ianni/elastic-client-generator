
package org.elasticsearch.x_pack.roll_up.rollup_configuration;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.roll_up.rollup_configuration.*;

public class RollupGroupings  {
  
  private DateHistogramRollupGrouping _dateHistogram;
  public DateHistogramRollupGrouping getDateHistogram() { return this._dateHistogram; }
  public RollupGroupings setDateHistogram(DateHistogramRollupGrouping val) { this._dateHistogram = val; return this; }


  private HistogramRollupGrouping _histogram;
  public HistogramRollupGrouping getHistogram() { return this._histogram; }
  public RollupGroupings setHistogram(HistogramRollupGrouping val) { this._histogram = val; return this; }


  private TermsRollupGrouping _terms;
  public TermsRollupGrouping getTerms() { return this._terms; }
  public RollupGroupings setTerms(TermsRollupGrouping val) { this._terms = val; return this; }

}
