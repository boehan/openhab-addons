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

import org.eclipse.smarthome.core.library.types.DecimalType;
import org.eclipse.smarthome.core.types.State;
import org.openhab.binding.comfoair.internal.ComfoAirCommandType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to handle temperature values
 *
 * @author Holger Hees
 * @since 1.3.0
 */
public class DataTypeTemperature implements ComfoAirDataType {

    private Logger logger = LoggerFactory.getLogger(DataTypeTemperature.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public State convertToState(Integer[] data, ComfoAirCommandType commandType) {

        if (data == null || commandType == null) {
            logger.trace("\"DataTypeTemperature\" class \"convertToState\" method parameter: null");
            return null;
        } else {

            if (commandType.getGetReplyDataPos()[0] < data.length) {
                return new DecimalType((((double) data[commandType.getGetReplyDataPos()[0]]) / 2) - 20);
            } else {
                return null;
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] convertFromState(State value, ComfoAirCommandType commandType) {

        if (value == null || commandType == null) {
            logger.trace("\"DataTypeTemperature\" class \"convertFromState\" method parameter: null");
            return null;
        } else {

            Integer[] template = commandType.getChangeDataTemplate();

            template[commandType.getChangeDataPos()] = (int) (((DecimalType) value).doubleValue() + 20) * 2;

            return template;
        }
    }

}