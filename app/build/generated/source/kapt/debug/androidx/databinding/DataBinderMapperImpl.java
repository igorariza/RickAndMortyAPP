package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.ml.android.challenge.DataBinderMapperImpl());
  }
}
