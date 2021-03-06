/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;


public interface UniqueIdService {
    /**
     * Get the Id based on the passed in context
     * @param context The Analytics context to use when looking up the id
     * @return the Id of Analytics context
     */
    public Id getUniqueId(AnalyticsContext context);
}
