package wei.com.example.interfaces;

public interface ProxyCreator {
    /**
     * 创建代理类
     *
     * @param type ..
     * @return ..
     */
    Object createProxy(Class<?> type);
}

