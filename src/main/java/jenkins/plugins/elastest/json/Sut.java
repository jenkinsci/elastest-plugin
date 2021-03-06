package jenkins.plugins.elastest.json;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Francisco R Díaz
 * @since 0.0.1
 */
public class Sut implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Long id;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("parameters")
    private Map<String, String> parameters;

    public Sut() {
    }

    public Sut(Long id) {
        super();
        this.id = id;
    }

    public Sut(Long id, Map<String, String> parameters) {
        super();
        this.id = id;
        this.parameters = parameters;
    }

    public Sut(Long id, String ip) {
        super();
        this.id = id;
        this.ip = ip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return String.format("Sut [id=%s, ip=%s]", id, ip);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((ip == null) ? 0 : ip.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sut other = (Sut) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (ip == null) {
            if (other.ip != null)
                return false;
        } else if (!ip.equals(other.ip))
            return false;
        return true;
    }

}
