
package org.elasticsearch.indices.analyze;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.char_filters.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.analysis.token_filters.*;
import org.elasticsearch.analysis.tokenizers.*;

public class AnalyzeRequest  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public AnalyzeRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  private String[] _attributes;
  public String[] getAttributes() { return this._attributes; }
  public AnalyzeRequest setAttributes(String[] val) { this._attributes = val; return this; }


  private Either<String, ICharFilter>[] _charFilter;
  public Either<String, ICharFilter>[] getCharFilter() { return this._charFilter; }
  public AnalyzeRequest setCharFilter(Either<String, ICharFilter>[] val) { this._charFilter = val; return this; }


  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public AnalyzeRequest setExplain(Boolean val) { this._explain = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public AnalyzeRequest setField(Field val) { this._field = val; return this; }


  private Either<String, ITokenFilter>[] _filter;
  public Either<String, ITokenFilter>[] getFilter() { return this._filter; }
  public AnalyzeRequest setFilter(Either<String, ITokenFilter>[] val) { this._filter = val; return this; }


  private String _normalizer;
  public String getNormalizer() { return this._normalizer; }
  public AnalyzeRequest setNormalizer(String val) { this._normalizer = val; return this; }


  private String[] _text;
  public String[] getText() { return this._text; }
  public AnalyzeRequest setText(String[] val) { this._text = val; return this; }


  private Either<String, ITokenizer> _tokenizer;
  public Either<String, ITokenizer> getTokenizer() { return this._tokenizer; }
  public AnalyzeRequest setTokenizer(Either<String, ITokenizer> val) { this._tokenizer = val; return this; }

}
