/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2016Äê3ÔÂ21ÈÕ
 * @version 1.0.0
 */
public class Chat implements MessageListener {

	
	public void init() {
		
	}
	
	public void sendMsg(String msg) throws NamingException, JMSException {
		InitialContext ctx = new InitialContext();
		TopicConnectionFactory factory = (TopicConnectionFactory)ctx.lookup("TopicFactory");
		TopicConnection conn = factory.createTopicConnection();
		TopicSession pubSession = conn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TopicSession subSession = conn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		
		Topic topic = (Topic)ctx.lookup("Topic");
		
		TopicPublisher publisher = pubSession.createPublisher(topic);
		TopicSubscriber subscriber = subSession.createSubscriber(topic, null, true);
		
		
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public void onMessage(Message message) {
		
	}

}
