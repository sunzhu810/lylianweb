package com.yijie.yilian.client.model;

/**
 * @描述 标书相应附件
 * @author Lucifer
 *
 */
public class TenderDesign {
	
	//自增ID
	private Integer id;
	
	//对应标书UUID
	private String tender_uuid;
	
	//附件对应文件名
	private String filename;
	
	//附件路径
	private String design;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String gettender_uuid() {
		return tender_uuid;
	}

	public void settender_uuid(String tender_uuid) {
		this.tender_uuid = tender_uuid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	@Override
	public String toString() {
		return "TenderDesign [id=" + id + ", tender_uuid=" + tender_uuid + ", filename=" + filename + ", design=" + design
				+ "]";
	}

	public TenderDesign() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TenderDesign(Integer id, String tender_uuid, String filename, String design) {
		super();
		this.id = id;
		this.tender_uuid = tender_uuid;
		this.filename = filename;
		this.design = design;
	}

}
