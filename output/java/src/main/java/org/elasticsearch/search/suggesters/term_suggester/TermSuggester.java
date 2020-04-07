
package org.elasticsearch.search.suggesters.term_suggester;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.search.suggesters.term_suggester.*;
import org.elasticsearch.common.*;

public class TermSuggester  implements XContentable<TermSuggester> {
  
  static final ParseField LOWERCASE_TERMS = new ParseField("lowercase_terms");
  private Boolean _lowercaseTerms;
  public Boolean getLowercaseTerms() { return this._lowercaseTerms; }
  public TermSuggester setLowercaseTerms(Boolean val) { this._lowercaseTerms = val; return this; }


  static final ParseField MAX_EDITS = new ParseField("max_edits");
  private Integer _maxEdits;
  public Integer getMaxEdits() { return this._maxEdits; }
  public TermSuggester setMaxEdits(Integer val) { this._maxEdits = val; return this; }


  static final ParseField MAX_INSPECTIONS = new ParseField("max_inspections");
  private Integer _maxInspections;
  public Integer getMaxInspections() { return this._maxInspections; }
  public TermSuggester setMaxInspections(Integer val) { this._maxInspections = val; return this; }


  static final ParseField MAX_TERM_FREQ = new ParseField("max_term_freq");
  private Float _maxTermFreq;
  public Float getMaxTermFreq() { return this._maxTermFreq; }
  public TermSuggester setMaxTermFreq(Float val) { this._maxTermFreq = val; return this; }


  static final ParseField MIN_DOC_FREQ = new ParseField("min_doc_freq");
  private Float _minDocFreq;
  public Float getMinDocFreq() { return this._minDocFreq; }
  public TermSuggester setMinDocFreq(Float val) { this._minDocFreq = val; return this; }


  static final ParseField MIN_WORD_LENGTH = new ParseField("min_word_length");
  private Integer _minWordLength;
  public Integer getMinWordLength() { return this._minWordLength; }
  public TermSuggester setMinWordLength(Integer val) { this._minWordLength = val; return this; }


  static final ParseField PREFIX_LENGTH = new ParseField("prefix_length");
  private Integer _prefixLength;
  public Integer getPrefixLength() { return this._prefixLength; }
  public TermSuggester setPrefixLength(Integer val) { this._prefixLength = val; return this; }


  static final ParseField SHARD_SIZE = new ParseField("shard_size");
  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public TermSuggester setShardSize(Integer val) { this._shardSize = val; return this; }


  static final ParseField SORT = new ParseField("sort");
  private SuggestSort _sort;
  public SuggestSort getSort() { return this._sort; }
  public TermSuggester setSort(SuggestSort val) { this._sort = val; return this; }


  static final ParseField STRING_DISTANCE = new ParseField("string_distance");
  private StringDistance _stringDistance;
  public StringDistance getStringDistance() { return this._stringDistance; }
  public TermSuggester setStringDistance(StringDistance val) { this._stringDistance = val; return this; }


  static final ParseField SUGGEST_MODE = new ParseField("suggest_mode");
  private SuggestMode _suggestMode;
  public SuggestMode getSuggestMode() { return this._suggestMode; }
  public TermSuggester setSuggestMode(SuggestMode val) { this._suggestMode = val; return this; }


  static final ParseField TEXT = new ParseField("text");
  private String _text;
  public String getText() { return this._text; }
  public TermSuggester setText(String val) { this._text = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TermSuggester fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TermSuggester.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TermSuggester, Void> PARSER =
    new ConstructingObjectParser<>(TermSuggester.class.getName(), false, args -> new TermSuggester());

  static {
    PARSER.declareBoolean(TermSuggester::setLowercaseTerms, LOWERCASE_TERMS);
    PARSER.declareInteger(TermSuggester::setMaxEdits, MAX_EDITS);
    PARSER.declareInteger(TermSuggester::setMaxInspections, MAX_INSPECTIONS);
    PARSER.declareFloat(TermSuggester::setMaxTermFreq, MAX_TERM_FREQ);
    PARSER.declareFloat(TermSuggester::setMinDocFreq, MIN_DOC_FREQ);
    PARSER.declareInteger(TermSuggester::setMinWordLength, MIN_WORD_LENGTH);
    PARSER.declareInteger(TermSuggester::setPrefixLength, PREFIX_LENGTH);
    PARSER.declareInteger(TermSuggester::setShardSize, SHARD_SIZE);
    PARSER.declareObject(TermSuggester::setSort, (p, t) -> SuggestSort.PARSER.apply(p, null), SORT);
    PARSER.declareObject(TermSuggester::setStringDistance, (p, t) -> StringDistance.PARSER.apply(p, null), STRING_DISTANCE);
    PARSER.declareObject(TermSuggester::setSuggestMode, (p, t) -> SuggestMode.PARSER.apply(p, null), SUGGEST_MODE);
    PARSER.declareString(TermSuggester::setText, TEXT);
  }

}
