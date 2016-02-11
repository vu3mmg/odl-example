/*
 * Copyright © 2015 Mahesh Govind vu3mmg@gmail.com and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.simpledevice.impl;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpledeviceProvider implements BindingAwareProvider, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(SimpledeviceProvider.class);

    @Override
    public void onSessionInitiated(ProviderContext session) {
        LOG.info("SimpledeviceProvider Session Initiated");
    }

    @Override
    public void close() throws Exception {
        LOG.info("SimpledeviceProvider Closed");
    }

}
