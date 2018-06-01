package wei.com.example.interfaces;

import wei.com.example.beans.MethodInfo;
import wei.com.example.beans.ServerInfo;

public interface RestHandler {

    /**
     * 初始化服务器信息
     *
     * @param serverInfo
     */
    void init(ServerInfo serverInfo);

    /**
     * 调用rest请求, 返回接口
     *
     * @param methodInfo
     * @return
     */
    Object invokeRest(MethodInfo methodInfo);

}