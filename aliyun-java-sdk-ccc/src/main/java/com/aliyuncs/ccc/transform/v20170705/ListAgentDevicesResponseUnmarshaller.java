/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListAgentDevicesResponse;
import com.aliyuncs.ccc.model.v20170705.ListAgentDevicesResponse.AgentDevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentDevicesResponseUnmarshaller {

	public static ListAgentDevicesResponse unmarshall(ListAgentDevicesResponse listAgentDevicesResponse, UnmarshallerContext context) {
		
		listAgentDevicesResponse.setRequestId(context.stringValue("ListAgentDevicesResponse.RequestId"));
		listAgentDevicesResponse.setSuccess(context.booleanValue("ListAgentDevicesResponse.Success"));
		listAgentDevicesResponse.setCode(context.stringValue("ListAgentDevicesResponse.Code"));
		listAgentDevicesResponse.setMessage(context.stringValue("ListAgentDevicesResponse.Message"));
		listAgentDevicesResponse.setHttpStatusCode(context.integerValue("ListAgentDevicesResponse.HttpStatusCode"));

		List<AgentDevice> agentDeviceList = new ArrayList<AgentDevice>();
		for (int i = 0; i < context.lengthValue("ListAgentDevicesResponse.AgentDeviceList.Length"); i++) {
			AgentDevice agentDevice = new AgentDevice();
			agentDevice.setInstanceId(context.stringValue("ListAgentDevicesResponse.AgentDeviceList["+ i +"].InstanceId"));
			agentDevice.setRamId(context.longValue("ListAgentDevicesResponse.AgentDeviceList["+ i +"].RamId"));
			agentDevice.setLoginTime(context.longValue("ListAgentDevicesResponse.AgentDeviceList["+ i +"].LoginTime"));
			agentDevice.setClientIp(context.stringValue("ListAgentDevicesResponse.AgentDeviceList["+ i +"].ClientIp"));
			agentDevice.setClientPort(context.stringValue("ListAgentDevicesResponse.AgentDeviceList["+ i +"].ClientPort"));
			agentDevice.setBrowserVersion(context.stringValue("ListAgentDevicesResponse.AgentDeviceList["+ i +"].BrowserVersion"));
			agentDevice.setIsLogin(context.integerValue("ListAgentDevicesResponse.AgentDeviceList["+ i +"].IsLogin"));
			agentDevice.setRemark(context.stringValue("ListAgentDevicesResponse.AgentDeviceList["+ i +"].Remark"));

			agentDeviceList.add(agentDevice);
		}
		listAgentDevicesResponse.setAgentDeviceList(agentDeviceList);
	 
	 	return listAgentDevicesResponse;
	}
}