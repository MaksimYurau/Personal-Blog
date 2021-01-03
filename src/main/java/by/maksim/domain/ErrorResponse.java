package by.maksim.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "Error Response Model")
public class ErrorResponse implements Serializable {

    private static final Long serialVersionUID = 1L;

    @ApiModelProperty(notes = "Error Code", name = "code", value = "200")
    private int id;

    @ApiModelProperty(notes = "Status", name = "status", value = "SUCCESS")
    private String status;

    @ApiModelProperty(notes = "Message", name = "message", value = "Invalid field")
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
