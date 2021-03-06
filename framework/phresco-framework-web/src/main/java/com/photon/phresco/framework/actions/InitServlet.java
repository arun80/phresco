/*
 * ###
 * Framework Web Archive
 * 
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
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
 * ###
 */
package com.photon.phresco.framework.actions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.photon.phresco.exception.PhrescoException;
import com.photon.phresco.framework.PhrescoFrameworkFactory;

public class InitServlet extends HttpServlet {
	
    private static final long serialVersionUID = 1L;

    public void init() throws ServletException {
    	try {
    		PhrescoFrameworkFactory.getServiceManager();
    	} catch (PhrescoException e) {
			throw new ServletException(e);
		}
    }
}