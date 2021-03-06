/**
 * @type_stability stable
 */
class GetResponse<TDocument> extends ResponseBase {
  _index: string;
  fields?: Dictionary<string, LazyDocument>;
  found: boolean;
  _id: string;
  _primary_term: long;
  _routing: string;
  _seq_no: long;
  /** @prop_serializer SourceFormatter`1 */
  _source: TDocument;
  _type: string;
  _version: long;
}
