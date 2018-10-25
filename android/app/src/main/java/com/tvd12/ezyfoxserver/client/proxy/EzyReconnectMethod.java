package com.tvd12.ezyfoxserver.client.proxy;

import com.tvd12.ezyfoxserver.client.EzyClient;
import com.tvd12.ezyfoxserver.client.EzyMethodNames;

/**
 * Created by tavandung12 on 10/25/18.
 */

public class EzyReconnectMethod extends EzyMethodProxy {
    @Override
    public void validate() {
    }

    @Override
    public Object invoke() {
        EzyClient client = getClient();
        boolean answer = client.reconnect();
        return answer;
    }

    @Override
    public String getName() {
        return EzyMethodNames.METHOD_RECONNECT;
    }
}
