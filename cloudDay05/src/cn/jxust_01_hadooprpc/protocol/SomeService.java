package cn.jxust_01_hadooprpc.protocol;

public interface SomeService {
	public long versionID = Long.MAX_VALUE;

	public String heartBeat(String name);
}
