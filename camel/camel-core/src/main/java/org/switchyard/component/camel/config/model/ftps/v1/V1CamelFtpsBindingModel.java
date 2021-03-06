/*
 * JBoss, Home of Professional Open Source Copyright 2009, Red Hat Middleware
 * LLC, and individual contributors by the @authors tag. See the copyright.txt
 * in the distribution for a full listing of individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This software is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA, or see the FSF
 * site: http://www.fsf.org.
 */
package org.switchyard.component.camel.config.model.ftps.v1;

import org.switchyard.component.camel.config.model.QueryString;
import org.switchyard.component.camel.config.model.ftp.v1.V1CamelFtpBindingModel;
import org.switchyard.component.camel.config.model.ftps.CamelFtpsBindingModel;
import org.switchyard.config.Configuration;
import org.switchyard.config.model.Descriptor;

/**
 * Implementation of ftps configuration binding.
 * 
 * @author Lukasz Dywicki
 */
public class V1CamelFtpsBindingModel extends V1CamelFtpBindingModel implements
    CamelFtpsBindingModel {

    /**
     * Ftps endpoint prefix.
     */
    public static final String FTPS = "ftps";

    private static final String SECURITY_PROTOCOL = "securityProtocol";
    private static final String IMPLICT = "isImplicit";
    private static final String EXEC_PBSZ = "execPbsz";
    private static final String EXEC_PROT = "execProt";
    private static final String DISABLE_SECURE_DATA_CHANNEL_DEFAULTS = "disableSecureDataChannelDefaults";

    /**
     * Create a CamelFtpBindingModel from the specified configuration and descriptor.
     * 
     * @param config The switchyard configuration instance.
     * @param descriptor The switchyard descriptor instance.
     */
    public V1CamelFtpsBindingModel(Configuration config, Descriptor descriptor) {
        super(config, descriptor);
    }

    /**
     * Default constuctor. Creates CamelFtpBindingModel.
     */
    public V1CamelFtpsBindingModel() {
        super(FTPS);
    }

    @Override
    protected String getEndpointProtocol() {
        return FTPS;
    }

    @Override
    public String getSecurityProtocol() {
        return getConfig(SECURITY_PROTOCOL);
    }

    @Override
    public V1CamelFtpBindingModel setSecurityProtocol(String protocol) {
        return setConfig(SECURITY_PROTOCOL, protocol);
    }

    @Override
    public Boolean isImplict() {
        return getBooleanConfig(IMPLICT);
    }

    @Override
    public V1CamelFtpBindingModel setImplict(Boolean implict) {
        return setConfig(IMPLICT, String.valueOf(implict));
    }

    @Override
    public Long getExecPbsz() {
        return getLongConfig(EXEC_PBSZ);
    }

    @Override
    public V1CamelFtpBindingModel setExecPbsz(Long pbsz) {
        return setConfig(EXEC_PBSZ, String.valueOf(pbsz));
    }

    @Override
    public String getExecProt() {
        return getConfig(EXEC_PROT);
    }

    @Override
    public V1CamelFtpBindingModel setExecProt(String prot) {
        return setConfig(EXEC_PROT, prot);
    }

    @Override
    public Boolean isDisableSecureDataChannelDefaults() {
        return getBooleanConfig(DISABLE_SECURE_DATA_CHANNEL_DEFAULTS);
    }

    @Override
    public V1CamelFtpBindingModel setDisableSecureDataChannelDefaults(Boolean disableDefaults) {
        return setConfig(DISABLE_SECURE_DATA_CHANNEL_DEFAULTS, String.valueOf(disableDefaults));
    }

    @Override
    protected void enrichQueryString(QueryString queryString) {
        // nothing to do here..
    }

}
