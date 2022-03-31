/*-
 * #%L
 * This file is part of "Apromore Core".
 * %%
 * Copyright (C) 2018 - 2022 Apromore Pty Ltd.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

package com.processconfiguration.common;

import java.io.File;

public class Constants {

    /**
     * Test data directory.
     *
     * Initialized from the <code>tests.dir</code> system property.
     */
    public static final File testsDirectory = new File("src/test/resources");

    /**
     * A <a href="{@docRoot}/../tests/data/Test1.bpmn20.xml">test document</a> used in the test suite.
     *
     * <div align="center"><img src="{@docRoot}/svg/Test1.signavio.svg"/></div>
     */
    public static final File test1File = new File(new File(testsDirectory, "data"), "Test1.bpmn20.xml");

}