package com.deloitte.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"dss", "production_date","seqno","is_last","aiu_count","page_count"})
public class Sip {
	
	private Dss dss;
	private String production_date;
	private	String seqno;
	private String is_last;
	private String aiu_count;
	private String page_count;
	
	@XmlElement
	public Dss getDss() {
		return dss;
	}
	public void setDss(Dss dss) {
		this.dss = dss;
	}
	
	@XmlElement
	public String getProduction_date() {
		return production_date;
	}
	public void setProduction_date(String production_date) {
		this.production_date = production_date;
	}
	
	@XmlElement
	public String getSeqno() {
		return seqno;
	}
	public void setSeqno(String seqno) {
		this.seqno = seqno;
	}
	
	@XmlElement
	public String getIs_last() {
		return is_last;
	}
	public void setIs_last(String is_last) {
		this.is_last = is_last;
	}
	
	@XmlElement
	public String getAiu_count() {
		return aiu_count;
	}
	public void setAiu_count(String aiu_count) {
		this.aiu_count = aiu_count;
	}
	
	@XmlElement
	public String getPage_count() {
		return page_count;
	}
	public void setPage_count(String page_count) {
		this.page_count = page_count;
	}

}
