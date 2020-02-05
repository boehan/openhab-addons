package org.openhab.binding.comfoair.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;

@NonNullByDefault
public class ComfoAirException extends Exception {

    private static final long serialVersionUID = 7112194484958698077L;

    public ComfoAirException(String message) {
        super(message);
    }

    public ComfoAirException(String message, Throwable cause) {
        super(message, cause);
    }

    public ComfoAirException(Throwable cause) {
        super(cause);
    }
}
