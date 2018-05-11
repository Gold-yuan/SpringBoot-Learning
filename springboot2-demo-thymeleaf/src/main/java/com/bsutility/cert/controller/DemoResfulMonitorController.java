package com.bsutility.cert.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * @author adminytf
 *
 */
@Api(description = "监控节点管理")
@RestController
@RequestMapping("/nodeMonitor")
public class DemoResfulMonitorController {
	/*
	private Logger log = LoggerFactory.getLogger(DemoResfulMonitorController.class);

	@Autowired
	private MongoDao dao;

	@ApiOperation(value = "添加监控节点", notes = "")
	@ApiImplicitParam(name = "nodeMonitor", value = "监控节点实体nodeMonitor", required = true, dataType = "NodeMonitor")
	@RequestMapping(value = "/node", method = RequestMethod.POST)
	public String addNodeMonitor(@RequestBody NodeMonitor nodeMonitor) {
		log.info("添加监控节点{}", nodeMonitor);
		try {
			dao.addNodeMonitor(nodeMonitor);
			log.info("添加监控节点成功");
		} catch (Exception e) {
			log.error("添加监控节点失败{}", e);
			return Resp.toErrorJson(e.getMessage());
		}
		return Resp.toSuccessJson("添加成功");
	}

	@ApiOperation(value = "更新监控节点", notes = "根据id更新监控节点信息")
	@ApiImplicitParam(name = "nodeMonitor", value = "监控节点实体nodeMonitor", required = true, dataType = "NodeMonitor")
	@RequestMapping(value = "/node", method = RequestMethod.PUT)
	public String updateNodeMonitor(@RequestBody NodeMonitor nodeMonitor) {
		log.info("修改监控节点{}", nodeMonitor);
		try {
			dao.addNodeMonitor(nodeMonitor);
			log.info("修改监控节点成功");
		} catch (Exception e) {
			log.error("修改监控节点失败{}", e);
			return Resp.toErrorJson(e.getMessage());
		}
		return Resp.toSuccessJson("添加成功");
	}

	@ApiOperation(value = "删除监控节点", notes = "根据id来删除监控节点")
	@ApiImplicitParam(name = "id", value = "监控节点ID", required = true, dataType = "String", paramType = "path")
	@RequestMapping(value = "/node/{id}", method = RequestMethod.DELETE)
	public String deleteNodeMonitor(@PathVariable String id) {
		log.info("删除监控节点{}", id);
		try {
			NodeMonitor nodeMonitor = new NodeMonitor();
			nodeMonitor.setId(id);
			dao.delNodeMonitor(nodeMonitor);
			log.info("删除监控节点成功");
			return Resp.toSuccessJson("删除成功");
		} catch (Exception e) {
			log.error("删除监控节点失败{}", e);
			return Resp.toErrorJson(e.getMessage());
		}
	}

	@ApiOperation(value = "查询监控节点列表", notes = "根据页码查询监控节点列表")

	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "页数1开始", required = true, dataType = "int", paramType = "path"),
			@ApiImplicitParam(name = "pageSize", value = "条数1开始", required = true, dataType = "int", paramType = "path"), })
	@RequestMapping(value = "/node/{page}/{pageSize}", method = RequestMethod.GET)
	public String getNodeMonitor(@PathVariable int page, @PathVariable int pageSize) {
		log.info("获取监控节点第{}页，{}条", page, pageSize);
		try {
			Page<NodeMonitor> findNodeMonitorByPage = dao.findNodeMonitorByPage(page, pageSize);
			return Resp.toSuccessJson(findNodeMonitorByPage);
		} catch (Exception e) {
			log.error("获取监控节点列表失败", e);
			return Resp.toErrorJson(e.getMessage());
		}
	}

	@ApiOperation(value = "查询监控节点列表", notes = "查询所有监控节点")
	@RequestMapping(value = "/node/all", method = RequestMethod.GET)
	public String getNodeMonitor() {
		log.info("获取监控节点列表");
		try {
			List<NodeMonitor> nodes = dao.findAllNodeMonitor();
			return Resp.toSuccessJson(nodes);
		} catch (Exception e) {
			log.error("获取监控节点列表失败", e);
			return Resp.toErrorJson(e.getMessage());
		}
	}
*/
}
