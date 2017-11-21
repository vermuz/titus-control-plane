/*
 * Copyright 2017 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.netflix.titus.api.loadbalancer.model.sanitizer;

public interface LoadBalancerValidator {

    /**
     * Validates that a Job ID is capable of having a load balancer associated with it.
     * @param jobId
     * @throws Exception
     */
    void validateJobId(String jobId) throws Exception;

    /**
     * Validates that a load balancer can be associated with a Job.
     * @param loadBalancerId
     * @throws Exception
     */
    void validateLoadBalancer(String loadBalancerId) throws Exception;
}
