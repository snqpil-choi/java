package com.uni.section2.superkeyword;

import java.util.Date;

public class ComputerDTO extends ProductDTO{

	private String cpu; // cpu
	private int hdd; // hdd(Hard Disk Drive)
	private int ram; // ram
	private String operationSystem;      //운영체제
	
	public ComputerDTO() {
		System.out.println("CompterDTO 기본생성자가 호출됨");
	}

	
	public ComputerDTO(String cpu, int hdd, int ram, String operationSystem) {
		super();
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		
		System.out.println("ComputerDTO 매개변수있는 생성자가 호출됨");
	}
	
	//부모필드도 모두 초기화하는 생성자
	public ComputerDTO(String code, String brand, String name, int price, Date manufacturingDate,
			String cpu, int hdd, int ram, String operationSystem) {
		
		// 부모의 모든 필드를 초기화하는 생성자로 ProductDTO 클래스를 가진 필드를 초기화할 값 전달
		super(code, brand, name, price, manufacturingDate);
		//this(cpu, hdd, ram, operationSystem) 에러남 (super나 this 하나만 쓸수있다)
		
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		
		System.out.println("ComputerDTO 부모필드도 모두 초기화 하는 생성자 호출됨");
		
		}


	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public int getHdd() {
		return hdd;
	}


	public void setHdd(int hdd) {
		this.hdd = hdd;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public String getOperationSystem() {
		return operationSystem;
	}


	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}


	@Override
	public String getInformation() {
		// TODO Auto-generated method stub
//		   return "ComputerDTO ["
//           + "code=" + super.getCode()
//           + ", brand=" + super.getBrand()
//           + ", name=" + super.getName()
//           + ", price=" + super.getPrice()
//           + ", manufacturingDate=" + super.getManufacturingDate()
//           + ", cpu=" + this.cpu
//           + ", hdd=" + this.hdd
//           + ", ram=" + this.ram
//           + ", operationSystem=" + this.operationSystem
//           + "]";
		
		/* super.getInformation() : 정상적으로 부모의 메소드 호출
	     * this.getInformation()  : 재귀호출 일어나며 stackOverflow 발생 // 계속 현재 getInformation 가 호출되기때문
	     * getInformation()       : this.이 자동 추가되어 재귀 호출 일어남
	     * 
	     * 따라서 이런 경우 super.을 명시적으로 사용해야 한다.
	     *  */		
		
		return super.getInformation()
				+ "ComputerDTO ["
		        + "cpu=" + this.cpu
		        + ", hdd=" + this.hdd
		        + ", ram=" + this.ram
		        + ", operationSystem=" + this.operationSystem
		        + "]";
	}
	
	
}
