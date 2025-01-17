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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.16 at 11:52:41 AM AEST 
//


package org.apromore.portal.model;

public class PluginInfoResult {
    protected PluginParameters mandatoryParameters;
    protected PluginParameters optionalParameters;
    protected PluginInfo pluginInfo;

    /**
     * Gets the value of the mandatoryParameters property.
     * 
     * @return
     *     possible object is
     *     {@link PluginParameters }
     *     
     */
    public PluginParameters getMandatoryParameters() {
        return mandatoryParameters;
    }

    /**
     * Sets the value of the mandatoryParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginParameters }
     *     
     */
    public void setMandatoryParameters(PluginParameters value) {
        this.mandatoryParameters = value;
    }

    /**
     * Gets the value of the optionalParameters property.
     * 
     * @return
     *     possible object is
     *     {@link PluginParameters }
     *     
     */
    public PluginParameters getOptionalParameters() {
        return optionalParameters;
    }

    /**
     * Sets the value of the optionalParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginParameters }
     *     
     */
    public void setOptionalParameters(PluginParameters value) {
        this.optionalParameters = value;
    }

    /**
     * Gets the value of the pluginInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PluginInfo }
     *     
     */
    public PluginInfo getPluginInfo() {
        return pluginInfo;
    }

    /**
     * Sets the value of the pluginInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginInfo }
     *     
     */
    public void setPluginInfo(PluginInfo value) {
        this.pluginInfo = value;
    }

}
