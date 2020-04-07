
package org.elasticsearch.analysis.tokenizers;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.analysis.tokenizers.*;

public class NoriTokenizer  implements XContentable<NoriTokenizer> {
  
  static final ParseField DECOMPOUND_MODE = new ParseField("decompound_mode");
  private NoriDecompoundMode _decompoundMode;
  public NoriDecompoundMode getDecompoundMode() { return this._decompoundMode; }
  public NoriTokenizer setDecompoundMode(NoriDecompoundMode val) { this._decompoundMode = val; return this; }


  static final ParseField USER_DICTIONARY = new ParseField("user_dictionary");
  private String _userDictionary;
  public String getUserDictionary() { return this._userDictionary; }
  public NoriTokenizer setUserDictionary(String val) { this._userDictionary = val; return this; }


  static final ParseField USER_DICTIONARY_RULES = new ParseField("user_dictionary_rules");
  private List<String> _userDictionaryRules;
  public List<String> getUserDictionaryRules() { return this._userDictionaryRules; }
  public NoriTokenizer setUserDictionaryRules(List<String> val) { this._userDictionaryRules = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NoriTokenizer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NoriTokenizer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NoriTokenizer, Void> PARSER =
    new ConstructingObjectParser<>(NoriTokenizer.class.getName(), false, args -> new NoriTokenizer());

  static {
    PARSER.declareObject(NoriTokenizer::setDecompoundMode, (p, t) -> NoriDecompoundMode.PARSER.apply(p, null), DECOMPOUND_MODE);
    PARSER.declareString(NoriTokenizer::setUserDictionary, USER_DICTIONARY);
    PARSER.declareStringArray(NoriTokenizer::setUserDictionaryRules, USER_DICTIONARY_RULES);
  }

}
