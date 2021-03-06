/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.media.spi.microservice;

import com.sitewhere.media.configuration.StreamingMediaTenantConfiguration;
import com.sitewhere.spi.microservice.multitenant.IMicroserviceTenantEngine;

/**
 * Extends {@link IMicroserviceTenantEngine} with features specific to streaming
 * media.
 */
public interface IStreamingMediaTenantEngine extends IMicroserviceTenantEngine<StreamingMediaTenantConfiguration> {
}