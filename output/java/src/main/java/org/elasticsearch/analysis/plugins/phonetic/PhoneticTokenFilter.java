
package org.elasticsearch.analysis.plugins.phonetic;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.plugins.phonetic.*;
import org.elasticsearch.internal.*;

public class PhoneticTokenFilter  {
  
  private PhoneticEncoder _encoder;
  public PhoneticEncoder getEncoder() { return this._encoder; }
  public PhoneticTokenFilter setEncoder(PhoneticEncoder val) { this._encoder = val; return this; }


  private PhoneticLanguage[] _languageset;
  public PhoneticLanguage[] getLanguageset() { return this._languageset; }
  public PhoneticTokenFilter setLanguageset(PhoneticLanguage[] val) { this._languageset = val; return this; }


  private Integer _maxCodeLen;
  public Integer getMaxCodeLen() { return this._maxCodeLen; }
  public PhoneticTokenFilter setMaxCodeLen(Integer val) { this._maxCodeLen = val; return this; }


  private PhoneticNameType _nameType;
  public PhoneticNameType getNameType() { return this._nameType; }
  public PhoneticTokenFilter setNameType(PhoneticNameType val) { this._nameType = val; return this; }


  private Boolean _replace;
  public Boolean getReplace() { return this._replace; }
  public PhoneticTokenFilter setReplace(Boolean val) { this._replace = val; return this; }


  private PhoneticRuleType _ruleType;
  public PhoneticRuleType getRuleType() { return this._ruleType; }
  public PhoneticTokenFilter setRuleType(PhoneticRuleType val) { this._ruleType = val; return this; }

}
