/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.comfoair.internal.datatypes;

import org.eclipse.smarthome.core.types.State;
import org.openhab.binding.comfoair.internal.ComfoAirCommandType;

/**
 * Abstract class to convert binary hex values into openHAB states and vice
 * versa
 *
 * @author Holger Hees
 * @author Hans Böhm
 */
public interface ComfoAirDataType {

    /**
     * Generate a openHAB State object based on response data.
     *
     * @param response
     * @param commandType
     * @return converted State object
     */
    State convertToState(Integer[] response, ComfoAirCommandType commandType);

    /**
     * Generate byte array based on a openHAB State.
     *
     * @param value
     * @param commandType
     * @return converted byte array
     */
    Integer[] convertFromState(State value, ComfoAirCommandType commandType);

}