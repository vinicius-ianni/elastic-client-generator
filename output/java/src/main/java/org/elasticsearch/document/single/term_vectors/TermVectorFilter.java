
package org.elasticsearch.document.single.term_vectors;

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

public class TermVectorFilter  implements XContentable<TermVectorFilter> {
  
  static final ParseField MAX_DOC_FREQ = new ParseField("max_doc_freq");
  private Integer _maxDocFreq;
  public Integer getMaxDocFreq() { return this._maxDocFreq; }
  public TermVectorFilter setMaxDocFreq(Integer val) { this._maxDocFreq = val; return this; }


  static final ParseField MAX_NUM_TERMS = new ParseField("max_num_terms");
  private Integer _maxNumTerms;
  public Integer getMaxNumTerms() { return this._maxNumTerms; }
  public TermVectorFilter setMaxNumTerms(Integer val) { this._maxNumTerms = val; return this; }


  static final ParseField MAX_TERM_FREQ = new ParseField("max_term_freq");
  private Integer _maxTermFreq;
  public Integer getMaxTermFreq() { return this._maxTermFreq; }
  public TermVectorFilter setMaxTermFreq(Integer val) { this._maxTermFreq = val; return this; }


  static final ParseField MAX_WORD_LENGTH = new ParseField("max_word_length");
  private Integer _maxWordLength;
  public Integer getMaxWordLength() { return this._maxWordLength; }
  public TermVectorFilter setMaxWordLength(Integer val) { this._maxWordLength = val; return this; }


  static final ParseField MIN_DOC_FREQ = new ParseField("min_doc_freq");
  private Integer _minDocFreq;
  public Integer getMinDocFreq() { return this._minDocFreq; }
  public TermVectorFilter setMinDocFreq(Integer val) { this._minDocFreq = val; return this; }


  static final ParseField MIN_TERM_FREQ = new ParseField("min_term_freq");
  private Integer _minTermFreq;
  public Integer getMinTermFreq() { return this._minTermFreq; }
  public TermVectorFilter setMinTermFreq(Integer val) { this._minTermFreq = val; return this; }


  static final ParseField MIN_WORD_LENGTH = new ParseField("min_word_length");
  private Integer _minWordLength;
  public Integer getMinWordLength() { return this._minWordLength; }
  public TermVectorFilter setMinWordLength(Integer val) { this._minWordLength = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TermVectorFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TermVectorFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TermVectorFilter, Void> PARSER =
    new ConstructingObjectParser<>(TermVectorFilter.class.getName(), false, args -> new TermVectorFilter());

  static {
    PARSER.declareInteger(TermVectorFilter::setMaxDocFreq, MAX_DOC_FREQ);
    PARSER.declareInteger(TermVectorFilter::setMaxNumTerms, MAX_NUM_TERMS);
    PARSER.declareInteger(TermVectorFilter::setMaxTermFreq, MAX_TERM_FREQ);
    PARSER.declareInteger(TermVectorFilter::setMaxWordLength, MAX_WORD_LENGTH);
    PARSER.declareInteger(TermVectorFilter::setMinDocFreq, MIN_DOC_FREQ);
    PARSER.declareInteger(TermVectorFilter::setMinTermFreq, MIN_TERM_FREQ);
    PARSER.declareInteger(TermVectorFilter::setMinWordLength, MIN_WORD_LENGTH);
  }

}
