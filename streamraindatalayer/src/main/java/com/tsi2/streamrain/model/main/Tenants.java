package com.tsi2.streamrain.model.main;
// Generated 04/10/2017 11:18:37 PM by Hibernate Tools 4.3.1



/**
 * Tenants generated by hbm2java
 */
public class Tenants  implements java.io.Serializable {


     private int id;
     private String name;
     private String portal;
     private String ip;
     private int port;
     private String user;
     private String password;

    public Tenants() {
    }

    public Tenants(int id, String name, String portal, String ip, int port, String user, String password) {
       this.id = id;
       this.name = name;
       this.portal = portal;
       this.ip = ip;
       this.port = port;
       this.user = user;
       this.password = password;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getIp() {
        return this.ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }
    public int getPort() {
        return this.port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

	public String getPortal() {
		return portal;
	}

	public void setPortal(String portal) {
		this.portal = portal;
	}

    
}


