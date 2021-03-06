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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DetachNetworkOptimizationSagsRequest extends RpcAcsRequest<DetachNetworkOptimizationSagsResponse> {
	
	public DetachNetworkOptimizationSagsRequest() {
		super("Smartag", "2018-03-13", "DetachNetworkOptimizationSags", "smartag");
	}

	private Long resourceOwnerId;

	private String networkOptId;

	private List<String> smartAGIdss;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getNetworkOptId() {
		return this.networkOptId;
	}

	public void setNetworkOptId(String networkOptId) {
		this.networkOptId = networkOptId;
		if(networkOptId != null){
			putQueryParameter("NetworkOptId", networkOptId);
		}
	}

	public List<String> getSmartAGIdss() {
		return this.smartAGIdss;
	}

	public void setSmartAGIdss(List<String> smartAGIdss) {
		this.smartAGIdss = smartAGIdss;	
		if (smartAGIdss != null) {
			for (int i = 0; i < smartAGIdss.size(); i++) {
				putQueryParameter("SmartAGIds." + (i + 1) , smartAGIdss.get(i));
			}
		}	
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<DetachNetworkOptimizationSagsResponse> getResponseClass() {
		return DetachNetworkOptimizationSagsResponse.class;
	}

}
