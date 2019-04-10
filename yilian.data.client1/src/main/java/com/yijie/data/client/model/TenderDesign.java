package com.yijie.data.client.model;

/**
 * @描述 标书相应附件
 * @author Lucifer
 *
 */
public class TenderDesign {
	
	//自增ID
	private Integer id;
	
	//对应标书id
	private String tender_id;
	
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

	public String getTender_id() {
		return tender_id;
	}

	public void setTender_id(String tender_id) {
		this.tender_id = tender_id;
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
		return "TenderDesign [id=" + id + ", tender_id=" + tender_id + ", filename=" + filename + ", design=" + design
				+ "]";
	}

	public TenderDesign() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TenderDesign(Integer id, String tender_id, String filename, String design) {
		super();
		this.id = id;
		this.tender_id = tender_id;
		this.filename = filename;
		this.design = design;
	}

}
