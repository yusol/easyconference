package com.dadu.ec.model;


//@Entity
//@Table(name="MR_INSTANCE")
public class Mr_instance 
{
//	@Id
//	@Column(name="INST_ID")
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private String inst_id;
	
//	@Column(name="INST_PID")
	private String inst_pid;
	
//	@Column(name="INST_TYPE")
	private String inst_type;
	
//	@Column(name="INST_NM")
	private String inst_nm;
	
//	@Column(name="INST_IP")
	private String inst_ip;
	
//	@Column(name="INST_PORT")
	private String inst_port;
	
//	@Column(name="REG_TIME")
	private String reg_time;

	public String getInst_id() {
		return inst_id;
	}

	public void setInst_id(String inst_id) {
		this.inst_id = inst_id;
	}

	public String getInst_pid() {
		return inst_pid;
	}

	public void setInst_pid(String inst_pid) {
		this.inst_pid = inst_pid;
	}

	public String getInst_type() {
		return inst_type;
	}

	public void setInst_type(String inst_type) {
		this.inst_type = inst_type;
	}

	public String getInst_nm() {
		return inst_nm;
	}

	public void setInst_nm(String inst_nm) {
		this.inst_nm = inst_nm;
	}

	public String getInst_ip() {
		return inst_ip;
	}

	public void setInst_ip(String inst_ip) {
		this.inst_ip = inst_ip;
	}

	public String getInst_port() {
		return inst_port;
	}

	public void setInst_port(String inst_port) {
		this.inst_port = inst_port;
	}

	public String getReg_time() {
		return reg_time;
	}

	public void setReg_time(String reg_time) {
		this.reg_time = reg_time;
	}
	
	
}
