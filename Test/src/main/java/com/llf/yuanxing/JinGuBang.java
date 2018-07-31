package com.llf.yuanxing;

import java.io.Serializable;

public class JinGuBang implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2034509391562159652L;
	private float height = 100;
	private float weight = 10;

	// �䳤����
	public void grow() {
		this.height *= 2;
		this.weight *= 2;
	}

	// ��̱���
	public void shrink() {
		this.height /= 2;
		this.weight /= 2;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
