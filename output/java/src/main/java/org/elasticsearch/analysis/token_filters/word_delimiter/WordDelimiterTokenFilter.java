
package org.elasticsearch.analysis.token_filters.word_delimiter;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class WordDelimiterTokenFilter  {
  
  private Boolean _catenateAll;
  public Boolean getCatenateAll() { return this._catenateAll; }
  public WordDelimiterTokenFilter setCatenateAll(Boolean val) { this._catenateAll = val; return this; }


  private Boolean _catenateNumbers;
  public Boolean getCatenateNumbers() { return this._catenateNumbers; }
  public WordDelimiterTokenFilter setCatenateNumbers(Boolean val) { this._catenateNumbers = val; return this; }


  private Boolean _catenateWords;
  public Boolean getCatenateWords() { return this._catenateWords; }
  public WordDelimiterTokenFilter setCatenateWords(Boolean val) { this._catenateWords = val; return this; }


  private Boolean _generateNumberParts;
  public Boolean getGenerateNumberParts() { return this._generateNumberParts; }
  public WordDelimiterTokenFilter setGenerateNumberParts(Boolean val) { this._generateNumberParts = val; return this; }


  private Boolean _generateWordParts;
  public Boolean getGenerateWordParts() { return this._generateWordParts; }
  public WordDelimiterTokenFilter setGenerateWordParts(Boolean val) { this._generateWordParts = val; return this; }


  private Boolean _preserveOriginal;
  public Boolean getPreserveOriginal() { return this._preserveOriginal; }
  public WordDelimiterTokenFilter setPreserveOriginal(Boolean val) { this._preserveOriginal = val; return this; }


  private String[] _protectedWords;
  public String[] getProtectedWords() { return this._protectedWords; }
  public WordDelimiterTokenFilter setProtectedWords(String[] val) { this._protectedWords = val; return this; }


  private String _protectedWordsPath;
  public String getProtectedWordsPath() { return this._protectedWordsPath; }
  public WordDelimiterTokenFilter setProtectedWordsPath(String val) { this._protectedWordsPath = val; return this; }


  private Boolean _splitOnCaseChange;
  public Boolean getSplitOnCaseChange() { return this._splitOnCaseChange; }
  public WordDelimiterTokenFilter setSplitOnCaseChange(Boolean val) { this._splitOnCaseChange = val; return this; }


  private Boolean _splitOnNumerics;
  public Boolean getSplitOnNumerics() { return this._splitOnNumerics; }
  public WordDelimiterTokenFilter setSplitOnNumerics(Boolean val) { this._splitOnNumerics = val; return this; }


  private Boolean _stemEnglishPossessive;
  public Boolean getStemEnglishPossessive() { return this._stemEnglishPossessive; }
  public WordDelimiterTokenFilter setStemEnglishPossessive(Boolean val) { this._stemEnglishPossessive = val; return this; }


  private String[] _typeTable;
  public String[] getTypeTable() { return this._typeTable; }
  public WordDelimiterTokenFilter setTypeTable(String[] val) { this._typeTable = val; return this; }


  private String _typeTablePath;
  public String getTypeTablePath() { return this._typeTablePath; }
  public WordDelimiterTokenFilter setTypeTablePath(String val) { this._typeTablePath = val; return this; }

}
