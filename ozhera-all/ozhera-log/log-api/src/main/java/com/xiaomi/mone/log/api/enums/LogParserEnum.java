/*
 * Copyright 2020 Xiaomi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.xiaomi.mone.log.api.enums;

import lombok.Getter;

/**
 * @author wtt
 * @version 1.0
 * @description
 * @date 2021/12/29 15:36
 */
@Getter
public enum LogParserEnum {

    SEPARATOR_PARSE(2, "Separator"),
    CUSTOM_PARSE(5, "Custom scripts");

    private final Integer code;
    private final String name;

    LogParserEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }


}
