
package by.man.bot.entity.space;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Space {

    @SerializedName("iss_position")
    @Expose
    private IssPosition issPosition;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;

    public IssPosition getIssPosition() {
        return issPosition;
    }

    public void setIssPosition(IssPosition issPosition) {
        this.issPosition = issPosition;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("issPosition", issPosition).append("message", message).append("timestamp", timestamp).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(message).append(issPosition).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Space) == false) {
            return false;
        }
        Space rhs = ((Space) other);
        return new EqualsBuilder().append(message, rhs.message).append(issPosition, rhs.issPosition).append(timestamp, rhs.timestamp).isEquals();
    }

}
