
package org.elasticsearch.analysis.token_filters.word_delimiter_graph;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class WordDelimiterGraphTokenFilter  {
  
  private Boolean _adjustOffsets;
  public Boolean getAdjustOffsets() { return this._adjustOffsets; }
  public WordDelimiterGraphTokenFilter setAdjustOffsets(Boolean val) { this._adjustOffsets = val; return this; }


  private Boolean _catenateAll;
  public Boolean getCatenateAll() { return this._catenateAll; }
  public WordDelimiterGraphTokenFilter setCatenateAll(Boolean val) { this._catenateAll = val; return this; }


  private Boolean _catenateNumbers;
  public Boolean getCatenateNumbers() { return this._catenateNumbers; }
  public WordDelimiterGraphTokenFilter setCatenateNumbers(Boolean val) { this._catenateNumbers = val; return this; }


  private Boolean _catenateWords;
  public Boolean getCatenateWords() { return this._catenateWords; }
  public WordDelimiterGraphTokenFilter setCatenateWords(Boolean val) { this._catenateWords = val; return this; }


  private Boolean _generateNumberParts;
  public Boolean getGenerateNumberParts() { return this._generateNumberParts; }
  public WordDelimiterGraphTokenFilter setGenerateNumberParts(Boolean val) { this._generateNumberParts = val; return this; }


  private Boolean _generateWordParts;
  public Boolean getGenerateWordParts() { return this._generateWordParts; }
  public WordDelimiterGraphTokenFilter setGenerateWordParts(Boolean val) { this._generateWordParts = val; return this; }


  private Boolean _preserveOriginal;
  public Boolean getPreserveOriginal() { return this._preserveOriginal; }
  public WordDelimiterGraphTokenFilter setPreserveOriginal(Boolean val) { this._preserveOriginal = val; return this; }


  private String[] _protectedWords;
  public String[] getProtectedWords() { return this._protectedWords; }
  public WordDelimiterGraphTokenFilter setProtectedWords(String[] val) { this._protectedWords = val; return this; }


  private String _protectedWordsPath;
  public String getProtectedWordsPath() { return this._protectedWordsPath; }
  public WordDelimiterGraphTokenFilter setProtectedWordsPath(String val) { this._protectedWordsPath = val; return this; }


  private Boolean _splitOnCaseChange;
  public Boolean getSplitOnCaseChange() { return this._splitOnCaseChange; }
  public WordDelimiterGraphTokenFilter setSplitOnCaseChange(Boolean val) { this._splitOnCaseChange = val; return this; }


  private Boolean _splitOnNumerics;
  public Boolean getSplitOnNumerics() { return this._splitOnNumerics; }
  public WordDelimiterGraphTokenFilter setSplitOnNumerics(Boolean val) { this._splitOnNumerics = val; return this; }


  private Boolean _stemEnglishPossessive;
  public Boolean getStemEnglishPossessive() { return this._stemEnglishPossessive; }
  public WordDelimiterGraphTokenFilter setStemEnglishPossessive(Boolean val) { this._stemEnglishPossessive = val; return this; }


  private String[] _typeTable;
  public String[] getTypeTable() { return this._typeTable; }
  public WordDelimiterGraphTokenFilter setTypeTable(String[] val) { this._typeTable = val; return this; }


  private String _typeTablePath;
  public String getTypeTablePath() { return this._typeTablePath; }
  public WordDelimiterGraphTokenFilter setTypeTablePath(String val) { this._typeTablePath = val; return this; }

}
