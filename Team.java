package pojo;

import java.util.Set;

public class Team {
 private int tid;
 private String tname;
 private Set<Players> playes;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public Set<Players> getPlayes() {
	return playes;
}
public void setPlayes(Set<Players> playes) {
	this.playes = playes;
}
 
 
	
}
