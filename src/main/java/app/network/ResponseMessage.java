package app.network;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseMessage {

    SOMETHING_WRONG("Something wrong!"),
    NO_DATA("No data."),
    DELETED("Deleted.");

    private final String resMsg;
}
