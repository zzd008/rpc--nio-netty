package cn.jxust_10_callback;

public interface FetcherCallback {
	void onData(Data data) throws Exception;

	void onError(Throwable cause);

}
