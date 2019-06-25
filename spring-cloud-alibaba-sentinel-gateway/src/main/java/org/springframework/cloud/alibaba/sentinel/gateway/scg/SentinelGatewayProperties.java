/*
 * Copyright (C) 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.alibaba.sentinel.gateway.scg;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.cloud.alibaba.sentinel.gateway.ConfigConstants;
import org.springframework.cloud.alibaba.sentinel.gateway.FallbackProperties;

/**
 * @author <a href="mailto:fangjian0423@gmail.com">Jim</a>
 */
@ConfigurationProperties(prefix = ConfigConstants.GATEWAY_PREFIX)
public class SentinelGatewayProperties {

	@NestedConfigurationProperty
	private FallbackProperties fallback;

	public FallbackProperties getFallback() {
		return fallback;
	}

	public SentinelGatewayProperties setFallback(FallbackProperties fallback) {
		this.fallback = fallback;
		return this;
	}

}