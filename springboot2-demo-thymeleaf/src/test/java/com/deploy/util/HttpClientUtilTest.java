package com.deploy.util;

import java.io.IOException;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.junit.Test;

import com.bsutility.util.HttpClientUtil;

/**
 * @author adminytf
 *
 */
public class HttpClientUtilTest {

	@Test
	public void stopContainer() throws IOException {
		String stop = "http://9.186.56.157:8888/containers/e5284f7372fa655ea416620c29343b345cdd1713c216872cda9e5025eedb632c/stop";
		HttpClientUtil client = HttpClientUtil.getInstance();
		String result = client.sendHttpPost(stop);
		System.out.println(result);
	}

	@Test
	public void startContainer() throws IOException {
		String start = "http://9.186.56.157:8888/containers/e5284f7372fa655ea416620c29343b345cdd1713c216872cda9e5025eedb632c/start";
		HttpClientUtil client = HttpClientUtil.getInstance();
		String result = client.sendHttpPost(start);
		System.out.println(result);
	}

	@Test
	public void listContainer() throws IOException {
		String list = "http://9.186.56.157:8888/containers/json";
		HttpClientUtil client = HttpClientUtil.getInstance();
		String result = client.sendHttpGet(list);
		System.out.println(result);
	}
	@Test
	public void listImage() throws IOException {
		String list = "http://9.186.56.157:8888/images/json";
		HttpClientUtil client = HttpClientUtil.getInstance();
		String result = client.sendHttpGet(list);
		System.out.println(result);
	}
	@Test
	public void addImage() throws IOException {
//		String list = "http://9.186.56.157:8888/images/create?fromImage=hyperledger/fabric-peer:x86_64-1.1.0-rc1";
//		String list = "http://9.186.56.157:8888/images/create?fromImage=hyperledger/fabric-peer:x86_64-1.1.0";
//		String list = "http://9.186.56.157:8888/images/create?fromImage=hyperledger/fabric-peer:x86_64-1.0.6";
		String list = "http://9.186.56.157:8888/images/create?fromImage=hyperl";
		HttpClientUtil client = HttpClientUtil.getInstance();
		String result = client.sendHttpPost(list);
		System.out.println(result);
	}
	@Test
	public void removeImage() throws IOException {
		String list = "http://9.186.56.157:8888/images/portainer/portainer:develop";
//		String list = "http://9.186.56.157:8888/images/sha256:6830dscd7b9b5bd991f8f289ae9258fa7ff56164364e7bc9e69325273a8b4d3e8";
		HttpClientUtil client = HttpClientUtil.getInstance();
		String result = client.sendHttpDelete(list);
		System.out.println(result);
	}
	
	@Test
	public void logContainer() throws IOException {
		long until = System.currentTimeMillis();
//		long since = System.currentTimeMillis() - 1000 * 60 * 60 * 24 * 30 * 12 * 100; 
		long since = System.currentTimeMillis() - 1000 * 60 * 60 * 24; 
		String url = "http://9.186.56.157:8888/containers/5222faae18f56f71a8aaea224b9286286601a66bb8fe0a6d1daf544182d8db53/logs?"
				+ "stderr=%s&stdout=%s&timestamps=%s&follow=%s&tail=%s&since=%s&until=%s";
		String log = new StringFormattedMessage(url,"1","1",until+"","false","all",since+"",until+"").toString();
		System.out.println(log);
		log = "http://9.186.56.157:8888/containers/6ec3ddb5306fef3639ca87c7fd8c25037bfe600e471a106e7a7eddf9f9db737d/logs?stderr=1&stdout=1&tail=2&timestamps=0";
		log = "http://9.186.56.157:8888/containers/6ec3ddb5306fef3639ca87c7fd8c25037bfe600e471a106e7a7eddf9f9db737d/logs?stderr=1&stdout=1&since="+since+"&until="+until;
		
		HttpClientUtil client = HttpClientUtil.getInstance();
		String result = client.sendHttpGet(log);
		System.out.println(result);
	}

	@Test
	public void getMyContainerList() throws IOException {
		String url = "http://localhost:8080/node-management/monitor/getNodeContainerList?nodeIp=9.186.56.157";
		HttpClientUtil client = HttpClientUtil.getInstance();
		String data = client.sendHttpGet(url);
		System.out.println(data);
	}
}
