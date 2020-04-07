
package org.elasticsearch.indices.analyze;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.analysis.char_filters.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.analysis.token_filters.*;
import org.elasticsearch.analysis.tokenizers.*;

public class AnalyzeRequest  implements XContentable<AnalyzeRequest> {
  
  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public AnalyzeRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  static final ParseField ATTRIBUTES = new ParseField("attributes");
  private List<String> _attributes;
  public List<String> getAttributes() { return this._attributes; }
  public AnalyzeRequest setAttributes(List<String> val) { this._attributes = val; return this; }


  static final ParseField CHAR_FILTER = new ParseField("char_filter");
  private List<Either<String, ICharFilter>> _charFilter;
  public List<Either<String, ICharFilter>> getCharFilter() { return this._charFilter; }
  public AnalyzeRequest setCharFilter(List<Either<String, ICharFilter>> val) { this._charFilter = val; return this; }


  static final ParseField EXPLAIN = new ParseField("explain");
  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public AnalyzeRequest setExplain(Boolean val) { this._explain = val; return this; }


  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public AnalyzeRequest setField(Field val) { this._field = val; return this; }


  static final ParseField FILTER = new ParseField("filter");
  private List<Either<String, ITokenFilter>> _filter;
  public List<Either<String, ITokenFilter>> getFilter() { return this._filter; }
  public AnalyzeRequest setFilter(List<Either<String, ITokenFilter>> val) { this._filter = val; return this; }


  static final ParseField NORMALIZER = new ParseField("normalizer");
  private String _normalizer;
  public String getNormalizer() { return this._normalizer; }
  public AnalyzeRequest setNormalizer(String val) { this._normalizer = val; return this; }


  static final ParseField TEXT = new ParseField("text");
  private List<String> _text;
  public List<String> getText() { return this._text; }
  public AnalyzeRequest setText(List<String> val) { this._text = val; return this; }


  static final ParseField TOKENIZER = new ParseField("tokenizer");
  private Either<String, ITokenizer> _tokenizer;
  public Either<String, ITokenizer> getTokenizer() { return this._tokenizer; }
  public AnalyzeRequest setTokenizer(Either<String, ITokenizer> val) { this._tokenizer = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AnalyzeRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AnalyzeRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AnalyzeRequest, Void> PARSER =
    new ConstructingObjectParser<>(AnalyzeRequest.class.getName(), false, args -> new AnalyzeRequest());

  static {
    PARSER.declareString(AnalyzeRequest::setAnalyzer, ANALYZER);
    PARSER.declareStringArray(AnalyzeRequest::setAttributes, ATTRIBUTES);
    PARSER.declareObjectArray(AnalyzeRequest::setCharFilter, (p, t) -> null, CHAR_FILTER);
    PARSER.declareBoolean(AnalyzeRequest::setExplain, EXPLAIN);
    PARSER.declareField(AnalyzeRequest::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareObjectArray(AnalyzeRequest::setFilter, (p, t) -> null, FILTER);
    PARSER.declareString(AnalyzeRequest::setNormalizer, NORMALIZER);
    PARSER.declareStringArray(AnalyzeRequest::setText, TEXT);
    PARSER.declareObject(AnalyzeRequest::setTokenizer, (p, t) -> null, TOKENIZER);
  }

}
