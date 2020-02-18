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

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Class to encapsulate all data which is needed to send a cmd to comfoair
 *
 * @author Holger Hees - Initial Contribution
 * @author Hans Böhm - Refactoring
 */
@NonNullByDefault
public class ComfoAirCommand {

    private List<String> keys;
    private @Nullable Integer requestCmd;
    private @Nullable Integer replyCmd;
    private int[] requestData;
    private @Nullable Integer requestValue;
    private @Nullable Integer dataPosition;

    /**
     * @param key
     *            command key
     * @param requestCmd
     *            command as byte value
     * @param replyCmd
     *            reply command as byte value
     * @param data
     *            request byte values
     * @param requestValue
     *            request byte value
     * @param dataPosition
     *            request byte position
     */

    public ComfoAirCommand(String key, @Nullable Integer requestCmd, @Nullable Integer replyCmd, int[] data,
            @Nullable Integer dataPosition, @Nullable Integer requestValue) {
        this.keys = new ArrayList<String>();
        this.keys.add(key);
        this.requestCmd = requestCmd;
        this.requestData = data;
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
    public @Nullable Integer getRequestCmd() {
        return requestCmd;
    }

    /**
     * @return request data as byte values
     */
    public int[] getRequestData() {
        return requestData;
    }

    /**
     * @return acknowledge cmd byte value
     */
    public @Nullable Integer getReplyCmd() {
        return replyCmd;
    }

    /**
     * @return request value as byte value
     */
    public @Nullable Integer getRequestValue() {
        return requestValue;
    }

    /**
     * @return position of request byte
     */
    public @Nullable Integer getDataPosition() {
        return dataPosition;
    }

    /**
     * set request command byte value
     */
    public void setRequestCmd(@Nullable Integer newRequestCmd) {
        requestCmd = newRequestCmd;
    }

    /**
     * set reply command byte value
     */
    public void setReplyCmd(@Nullable Integer newReplyCmd) {
        replyCmd = newReplyCmd;
    }

    /**
     * set request data byte values
     */
    public void setRequestData(int[] newRequestData) {
        requestData = newRequestData;
    }
}
