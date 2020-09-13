package PojoFiles.Schools;

public class MailServer {

    private String host;
    private Integer port;
    private String username;
    private String password;
    private boolean enabled;
    private boolean smtpAuth;
    private boolean startTlsRequired;
    private boolean startTlsEnabled;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isSmtpAuth() {
        return smtpAuth;
    }

    public void setSmtpAuth(boolean smtpAuth) {
        this.smtpAuth = smtpAuth;
    }

    public boolean isStartTlsRequired() {
        return startTlsRequired;
    }

    public void setStartTlsRequired(boolean startTlsRequired) {
        this.startTlsRequired = startTlsRequired;
    }

    public boolean isStartTlsEnabled() {
        return startTlsEnabled;
    }

    public void setStartTlsEnabled(boolean startTlsEnabled) {
        this.startTlsEnabled = startTlsEnabled;
    }
}
