package com.ClaseString;


public class CStringBuldier {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("0,1,2,3,4,5,6");
		sb.append("\n");
		sb.append("line 2");
		sb.append("\n");
		sb.append("line 3");
		sb.append("\n");
		sb.append("line 4");
		sb.append("\n");
		sb.append("line 5");
		sb.append("\n");
		sb.append("line 6");
		sb.append("\n");
		sb.append("line 7");
		sb.append("\n");
		sb.append("line 8");
		sb.append("\n");
		sb.append("line 9");
		sb.append("\n");
		sb.append("line 10");
		
		
		
		String[] lines = sb.toString().split("\n");
			
		for (String str : lines) {
			System.out.println("Content = " + str);
			// System.out.println("Length = " + s.length());
			String[] lineFile = str.split(",");
			for (String lin : lineFile) {
				System.out.println("Content = " + lin);
				// System.out.println("Length = " + s.length());
			}
		}
		
		

/*		String[] lines = sb.toString().split("\n");
		for (String str : lines) {
			System.out.println("Content = " + str);
			// System.out.println("Length = " + s.length());
			String[] lineFile = str.split(",");
			for (String lin : lineFile) {
				System.out.println("Content = " + lin);
				// System.out.println("Length = " + s.length());
			}
		}
		*/
		


	}

}
