package com.bsutility.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import com.bsutility.CertManagementApplication;
import com.bsutility.cert.dao.MongoDao;
import com.bsutility.cert.pojo.Cert;

/**
 * @author adminytf
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CertManagementApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DaoTest {
	@Autowired
	private MongoDao dao;

	@Test
	public void testPage() {
		Page<Cert> certs = dao.findCertByPage(1);
		System.out.println(certs.getContent());
	}
	@Test
	public void getCert() {
		Cert cert = dao.findCertByCN("cn2");
		System.out.println(cert);
	}
	@Test
	public void addCert() {
		for(int i = 0; i < 100; i++) {
			List<String> certs = new ArrayList<String>();
			certs.add("127.0.0.1");
			certs.add("192.168.1.19");
			Cert cert = new Cert();
			cert.setCn("cn2"+Math.random()*100);
			cert.setIpAddr(certs);
			cert.setIsAdminCert(1);
			cert.setType("tls");
			dao.addCert(cert);
		}
	}
}
