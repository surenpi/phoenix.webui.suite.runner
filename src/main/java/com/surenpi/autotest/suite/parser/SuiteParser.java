/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.surenpi.autotest.suite.parser;

import java.io.InputStream;

import com.surenpi.autotest.suite.runner.Suite;

/**
 * 测试套件配置文件解析
 * @author <a href="http://surenpi.com">suren</a>
 * @since 1.1.0
 */
public interface SuiteParser
{
    /**
     * 从流中解析出一个测试套件类
     * @param suiteInputStream 测试套件类流
     * @return 测试套件类
     * @throws Exception 解析过程中发生错误要抛出异常
     */
    Suite parse(InputStream suiteInputStream) throws Exception;
}
