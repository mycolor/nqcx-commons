/*
 * Copyright 2014 nqcx.org All right reserved. This software is the
 * confidential and proprietary information of nqcx.org ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with nqcx.org.
 */

package org.nqcx.commons.lang;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * @author naqichuan 2014年8月14日 上午10:58:37
 */
public abstract class EntityBase {

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
