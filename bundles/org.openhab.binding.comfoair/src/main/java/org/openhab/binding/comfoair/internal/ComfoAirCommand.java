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
package org.openhab.binding.comfoair.internal;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to encapsulate all data which is needed to send a cmd to comfoair
 *
 * @author Holger Hees - Initial Contribution
 * @author Hans Böhm - Refactoring
 */
public class ComfoAirCommand {

    private List<String> keys;
    private Integer requestCmd;
    private Integer replyCmd;
    private Integer[] requestData;
    private Integer requestValue;
    private Integer dataPosition;

    /**
     * @param key
     *            command key
     * @param requestCmd
     *            command as byte value
     * @param replyCmd
     *            reply command as byte value
     * @param requestData
     *            request byte values
     * @param requestValue
     *            request byte value
     * @param dataPosition
     *            request byte position
     */

    public ComfoAirCommand(String key, Integer requestCmd, Integer replyCmd, Integer[] requestData,
            Integer dataPosition, Integer requestValue) {
        this.keys = new ArrayList<String>();
        this.keys.add(key);
        this.requestCmd = requestCmd;
        this.requestData = requestData;
        this.requestValue = requestValue;
        this.dataPosition = dataPosition;
        this.replyCmd = replyCmd;
    }

    /**
     * @param key
     *            additional command key
     */
    public void addKey(String key) {
        keys.add(key);
    }

    /**
     * @return command keys
     */
    public List<String> getKeys() {
        return keys;
    }

    /**
     * @return command byte value
     */
    public Integer getRequestCmd() {
        return requestCmd;
    }

    /**
     * @return request data as byte values
     */
    public Integer[] getRequestData() {
        return requestData;
    }

    /**
     * @return acknowledge cmd byte value
     */
    public Integer getReplyCmd() {
        return replyCmd;
    }

    /**
     * @return request value as byte value
     */
    public Integer getRequestValue() {
        return requestValue;
    }

    /**
     * @return position of request byte
     */
    public Integer getDataPosition() {
        return dataPosition;
    }

    /**
     * set request command byte value
     */
    public void setRequestCmd(Integer newRequestCmd) {
        requestCmd = newRequestCmd;
    }

    /**
     * set reply command byte value
     */
    public void setReplyCmd(Integer newReplyCmd) {
        replyCmd = newReplyCmd;
    }

    /**
     * set request data byte values
     */
    public void setRequestData(Integer[] newRequestData) {
        requestData = newRequestData;
    }
}