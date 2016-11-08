/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.test.showcase.body;

import org.junit.Assume;
import org.junit.Test;

import com.liferay.faces.test.showcase.miscellaneous.MiscellaneousTester;


/**
 * @author  Kyle Stiemann
 * @author  Philip White
 */
public class BodyGeneralTester extends MiscellaneousTester {

	@Test
	public void runBodyGeneralTest() throws Exception {

		// Skip the test if it's not the JSF showcase. other showcases should
		// include their own test for this use case.
		Assume.assumeTrue(TEST_CONTEXT_URL.contains("jsf"));
		runMiscellaneousGeneralTest("h", "body");
	}
}
