package com.wn.utils;

import java.util.Random;

/**
 * 用于生成6位或8位的随机数
 * @author WeiNing
 * @since 2021-10-28
 **/

public class RandomCount {

	/**
	 * 生成4位随机数
	 **/
	public static Integer random4(){
		int min = 1000;
		int max = 9999;
		Random rand= new Random();
		int tmp = Math.abs(rand.nextInt());
		return tmp % (max - min + 1) + min;
	}

	/**
	 * 生成6位随机数
	 **/
	public static Integer random6(){
		int min = 100000;
		int max = 999999;
		Random rand= new Random();
		int tmp = Math.abs(rand.nextInt());
		return tmp % (max - min + 1) + min;
	}

	/**
	 * 生成8位随机数
	 **/
	public static Integer random8(){
		int min = 10000000;
		int max = 99999999;
		Random rand= new Random();
		int tmp = Math.abs(rand.nextInt());
		return tmp % (max - min + 1) + min;
	}

	/**
	 * 自定义范围随机数
	 * @param min 最小值
	 * @param max 最大值
	 **/
	public static Integer random(int min, int max){
		Random rand= new Random();
		int tmp = Math.abs(rand.nextInt());
		return tmp % (max - min + 1) + min;
	}

	/**
	 * 随机生成四位字母数字组合验证码
	 * @return
	 */
	public static String randomCode(){
		String[] str = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String code = "";
		for (int i = 0; i < 4; i++) {
			code += str[code()];
		}
		return code;
	}
	private static Integer code(){
		int min = 0;
		int max = 35;
		Random rand= new Random();
		int tmp = Math.abs(rand.nextInt());
		return tmp % (max - min + 1) + min;
	}
}
