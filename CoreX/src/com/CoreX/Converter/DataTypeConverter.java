package com.CoreX.Converter;

/**
 * <h5>This class contains conversion of data types</h5><br>
 * <h5>Eg: Int -> String, Float -> Double</h5>
 */
public class DataTypeConverter {
	
	/**
	 * 
	 * @param number
	 * @return integer value of the string
	 */
	public Convert Convert(String number, Class<?> From, Class<?> To) {
		
		Convert convert = new Convert();
		
		
		if(From==String.class) {
			if(To==Integer.class) {
				convert.setIntegerdata(Integer.parseInt(number));
				return convert;
			}
			if(To==Double.class) {
				convert.setDoubledata(Double.parseDouble(number));
				return convert;
			}
			if(To==Float.class) {
				convert.setFloatdata(Float.parseFloat(number));
				return convert;
			}
			if(To==Long.class) {
				convert.setLongdata(Long.parseLong(number));
				return convert;
			}
		}
		return convert;
		
		
	}

}
