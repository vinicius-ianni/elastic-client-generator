
package org.elasticsearch.analysis.plugins.icu;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.plugins.icu.collation.*;

public class IcuCollationTokenFilter  {
  
  private IcuCollationAlternate _alternate;
  public IcuCollationAlternate getAlternate() { return this._alternate; }
  public IcuCollationTokenFilter setAlternate(IcuCollationAlternate val) { this._alternate = val; return this; }


  private IcuCollationCaseFirst _caseFirst;
  public IcuCollationCaseFirst getCaseFirst() { return this._caseFirst; }
  public IcuCollationTokenFilter setCaseFirst(IcuCollationCaseFirst val) { this._caseFirst = val; return this; }


  private Boolean _caseLevel;
  public Boolean getCaseLevel() { return this._caseLevel; }
  public IcuCollationTokenFilter setCaseLevel(Boolean val) { this._caseLevel = val; return this; }


  private String _country;
  public String getCountry() { return this._country; }
  public IcuCollationTokenFilter setCountry(String val) { this._country = val; return this; }


  private IcuCollationDecomposition _decomposition;
  public IcuCollationDecomposition getDecomposition() { return this._decomposition; }
  public IcuCollationTokenFilter setDecomposition(IcuCollationDecomposition val) { this._decomposition = val; return this; }


  private Boolean _hiraganaQuaternaryMode;
  public Boolean getHiraganaQuaternaryMode() { return this._hiraganaQuaternaryMode; }
  public IcuCollationTokenFilter setHiraganaQuaternaryMode(Boolean val) { this._hiraganaQuaternaryMode = val; return this; }


  private String _language;
  public String getLanguage() { return this._language; }
  public IcuCollationTokenFilter setLanguage(String val) { this._language = val; return this; }


  private Boolean _numeric;
  public Boolean getNumeric() { return this._numeric; }
  public IcuCollationTokenFilter setNumeric(Boolean val) { this._numeric = val; return this; }


  private IcuCollationStrength _strength;
  public IcuCollationStrength getStrength() { return this._strength; }
  public IcuCollationTokenFilter setStrength(IcuCollationStrength val) { this._strength = val; return this; }


  private String _variableTop;
  public String getVariableTop() { return this._variableTop; }
  public IcuCollationTokenFilter setVariableTop(String val) { this._variableTop = val; return this; }


  private String _variant;
  public String getVariant() { return this._variant; }
  public IcuCollationTokenFilter setVariant(String val) { this._variant = val; return this; }

}
