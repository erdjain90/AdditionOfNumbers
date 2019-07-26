package com.deloitte.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder={"holding", "id","pdi_schema","production_date","base_retention_date","producer","entity","priority","application"})
public class Dss {

	private String holding;
	private String id;
	private String pdi_schema;
	private String production_date;
	private String base_retention_date;
	private String producer;
	private String entity;
	private String priority;
	private String application;
	
	@XmlElement
	public String getPdi_schema() {
		return pdi_schema;
	}
	public void setPdi_schema(String pdi_schema) {
		this.pdi_schema = pdi_schema;
	}
	
	@XmlElement
	public String getProduction_date() {
		return production_date;
	}
	public void setProduction_date(String production_date) {
		this.production_date = production_date;
	}
	
	@XmlElement
	public String getBase_retention_date() {
		return base_retention_date;
	}
	public void setBase_retention_date(String base_retention_date) {
		this.base_retention_date = base_retention_date;
	}
	
	@XmlElement
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	@XmlElement
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	
	@XmlElement
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	@XmlElement
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	@XmlElement
	public String getHolding() {
		return holding;
	}
	public void setHolding(String holding) {
		this.holding = holding;
	}
	
	@XmlElement
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
