package priv.thinkam.motan;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {
	public static void main(String[] args) throws InterruptedException {
		new ClassPathXmlApplicationContext("classpath:motan_server.xml");
		MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
		System.out.println("server start...");
		Thread.sleep(Long.MAX_VALUE);
	}
}
