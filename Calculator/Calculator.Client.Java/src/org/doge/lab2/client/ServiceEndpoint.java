package org.doge.lab2.client;

public class ServiceEndpoint {
    private final String protocol;
    private final String host;
    private final Integer port;
    private final String path;

    public ServiceEndpoint(String protocol, String host, Integer port, String path) {

        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return protocol + "://" + host + ":" + port.toString() + "/" + path;
    }
}
