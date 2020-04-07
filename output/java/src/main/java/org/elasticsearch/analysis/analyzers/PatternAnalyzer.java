
package org.elasticsearch.analysis.analyzers;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.analysis.*;

public class PatternAnalyzer  implements XContentable<PatternAnalyzer> {
  
  static final ParseField FLAGS = new ParseField("flags");
  private String _flags;
  public String getFlags() { return this._flags; }
  public PatternAnalyzer setFlags(String val) { this._flags = val; return this; }


  static final ParseField LOWERCASE = new ParseField("lowercase");
  private Boolean _lowercase;
  public Boolean getLowercase() { return this._lowercase; }
  public PatternAnalyzer setLowercase(Boolean val) { this._lowercase = val; return this; }


  static final ParseField PATTERN = new ParseField("pattern");
  private String _pattern;
  public String getPattern() { return this._pattern; }
  public PatternAnalyzer setPattern(String val) { this._pattern = val; return this; }


  static final ParseField STOPWORDS = new ParseField("stopwords");
  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public PatternAnalyzer setStopwords(StopWords val) { this._stopwords = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PatternAnalyzer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PatternAnalyzer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PatternAnalyzer, Void> PARSER =
    new ConstructingObjectParser<>(PatternAnalyzer.class.getName(), false, args -> new PatternAnalyzer());

  static {
    PARSER.declareString(PatternAnalyzer::setFlags, FLAGS);
    PARSER.declareBoolean(PatternAnalyzer::setLowercase, LOWERCASE);
    PARSER.declareString(PatternAnalyzer::setPattern, PATTERN);
    PARSER.declareObject(PatternAnalyzer::setStopwords, (p, t) -> StopWords.PARSER.apply(p, null), STOPWORDS);
  }

}
