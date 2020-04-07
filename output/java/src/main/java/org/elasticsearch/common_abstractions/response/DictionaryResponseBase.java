
package org.elasticsearch.common_abstractions.response;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DictionaryResponseBase<TKey, TValue>  implements XContentable<DictionaryResponseBase> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DictionaryResponseBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DictionaryResponseBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DictionaryResponseBase, Void> PARSER =
    new ConstructingObjectParser<>(DictionaryResponseBase.class.getName(), false, args -> new DictionaryResponseBase());

  static {
    
  }

}
