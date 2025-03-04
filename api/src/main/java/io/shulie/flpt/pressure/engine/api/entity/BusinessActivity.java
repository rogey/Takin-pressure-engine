/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.shulie.flpt.pressure.engine.api.entity;

/**
 * 业务活动信息  数据绑定了业务活动对应的tps信息
 *
 * @author lipeng
 * @date 2021-07-29 3:32 下午
 */
public class BusinessActivity {

    //业务活动名称，即元素名称
    private String elementTestName;

    //目标TPS
    private String throughputPercent;

    public String getThroughputPercent() {
        return throughputPercent;
    }

    public void setThroughputPercent(String throughputPercent) {
        this.throughputPercent = throughputPercent;
    }

    public String getElementTestName() {
        return elementTestName;
    }

    public void setElementTestName(String elementTestName) {
        this.elementTestName = elementTestName;
    }

    public BusinessActivity(String elementTestName, String throughputPercent) {
        this.elementTestName = elementTestName;
        this.throughputPercent = throughputPercent;
    }

    public static BusinessActivity build(String elementTestName, String throughputPercent) {
        return new BusinessActivity(elementTestName, throughputPercent);
    }
}