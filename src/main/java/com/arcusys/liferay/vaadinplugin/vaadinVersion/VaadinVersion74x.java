package com.arcusys.liferay.vaadinplugin.vaadinVersion;

/*
 * #%L
 * Liferay Vaadin Plugin
 * %%
 * Copyright (C) 2013 - 2014 Arcusys Ltd.
 * %%
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
 * #L%
 */

import java.util.Arrays;

import com.arcusys.liferay.vaadinplugin.util.VaadinFileInfo;

/**
 * Created by wilds on 02.19.15.
 */
public class VaadinVersion74x extends VaadinVersion {


    public VaadinVersion74x(){
        vaadinFileInfos = Arrays.asList(
                new VaadinFileInfo(VAADIN_SERVER_JAR, portalPath, 100, true),
                new VaadinFileInfo(VAADIN_CLIENT_JAR, vaadinClientJarsPath, 200, true),
                new VaadinFileInfo(VAADIN_THEMES_JAR, portalPath, 300),
                new VaadinFileInfo(VAADIN_SASS_COMPILER_JAR, portalPath, 400, libDir),
                new VaadinFileInfo(VAADIN_SHARED_JAR, portalPath, 500, true),
                new VaadinFileInfo(VAADIN_PUSH_JAR, portalPath, 600),
                new VaadinFileInfo(VAADIN_CLIENT_COMPILER_JAR, vaadinClientJarsPath, 700, true),
                new VaadinFileInfo(VAADIN_CLIENT_COMPILER_DEPS_JAR, vaadinClientJarsPath, 800, libDir, true),
                new VaadinFileInfo(GUAVA_JAR, vaadinClientJarsPath, 900, libDir, true),
                new VaadinFileInfo(STREAM_HTML_PARSER_JSILVER_JAR, vaadinClientJarsPath, 1000, libDir, true),
                new VaadinFileInfo(SAC_JAR, vaadinClientJarsPath, 1200, libDir, true),
                new VaadinFileInfo(FLUTE_JAR, vaadinClientJarsPath, 1300, libDir, true),
                new VaadinFileInfo(JSOUP_JAR, portalPath, 1400, libDir, true),
                new VaadinFileInfo(VALIDATON_API, portalPath, 1500, libDir, true),
                new VaadinFileInfo(VALIDATON_API_SOURCES, portalPath, 1600, libDir, true),
                new VaadinFileInfo(SERIALIZER_JAR, vaadinClientJarsPath, 1700, libDir, true),
                new VaadinFileInfo(ANT_JAR, vaadinClientJarsPath, 1800, libDir, true),
                new VaadinFileInfo(ASM_JAR, vaadinClientJarsPath, 1800, libDir, true)
        );
    }
}
