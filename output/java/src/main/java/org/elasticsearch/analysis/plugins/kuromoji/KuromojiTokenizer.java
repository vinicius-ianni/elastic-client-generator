
package org.elasticsearch.analysis.plugins.kuromoji;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.analysis.plugins.kuromoji.*;
import org.elasticsearch.internal.*;

public class KuromojiTokenizer  implements XContentable<KuromojiTokenizer> {
  
  static final ParseField DISCARD_PUNCTUATION = new ParseField("discard_punctuation");
  private Boolean _discardPunctuation;
  public Boolean getDiscardPunctuation() { return this._discardPunctuation; }
  public KuromojiTokenizer setDiscardPunctuation(Boolean val) { this._discardPunctuation = val; return this; }


  static final ParseField MODE = new ParseField("mode");
  private KuromojiTokenizationMode _mode;
  public KuromojiTokenizationMode getMode() { return this._mode; }
  public KuromojiTokenizer setMode(KuromojiTokenizationMode val) { this._mode = val; return this; }


  static final ParseField NBEST_COST = new ParseField("nbest_cost");
  private Integer _nbestCost;
  public Integer getNbestCost() { return this._nbestCost; }
  public KuromojiTokenizer setNbestCost(Integer val) { this._nbestCost = val; return this; }


  static final ParseField NBEST_EXAMPLES = new ParseField("nbest_examples");
  private String _nbestExamples;
  public String getNbestExamples() { return this._nbestExamples; }
  public KuromojiTokenizer setNbestExamples(String val) { this._nbestExamples = val; return this; }


  static final ParseField USER_DICTIONARY = new ParseField("user_dictionary");
  private String _userDictionary;
  public String getUserDictionary() { return this._userDictionary; }
  public KuromojiTokenizer setUserDictionary(String val) { this._userDictionary = val; return this; }


  static final ParseField USER_DICTIONARY_RULES = new ParseField("user_dictionary_rules");
  private List<String> _userDictionaryRules;
  public List<String> getUserDictionaryRules() { return this._userDictionaryRules; }
  public KuromojiTokenizer setUserDictionaryRules(List<String> val) { this._userDictionaryRules = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(DISCARD_PUNCTUATION.getPreferredName(), _discardPunctuation);
    if (_mode != null) {
      builder.field(MODE.getPreferredName());
      _mode.toXContent(builder, params);
    }
    builder.field(NBEST_COST.getPreferredName(), _nbestCost);
    builder.field(NBEST_EXAMPLES.getPreferredName(), _nbestExamples);
    builder.field(USER_DICTIONARY.getPreferredName(), _userDictionary);
    if (_userDictionaryRules != null) {
      builder.array(USER_DICTIONARY_RULES.getPreferredName(), _userDictionaryRules);
    }
    return builder;
  }

  @Override
  public KuromojiTokenizer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KuromojiTokenizer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KuromojiTokenizer, Void> PARSER =
    new ConstructingObjectParser<>(KuromojiTokenizer.class.getName(), false, args -> new KuromojiTokenizer());

  static {
    PARSER.declareBoolean(KuromojiTokenizer::setDiscardPunctuation, DISCARD_PUNCTUATION);
    PARSER.declareObject(KuromojiTokenizer::setMode, (p, t) -> KuromojiTokenizationMode.PARSER.apply(p), MODE);
    PARSER.declareInt(KuromojiTokenizer::setNbestCost, NBEST_COST);
    PARSER.declareString(KuromojiTokenizer::setNbestExamples, NBEST_EXAMPLES);
    PARSER.declareString(KuromojiTokenizer::setUserDictionary, USER_DICTIONARY);
    PARSER.declareStringArray(KuromojiTokenizer::setUserDictionaryRules, USER_DICTIONARY_RULES);
  }

}
