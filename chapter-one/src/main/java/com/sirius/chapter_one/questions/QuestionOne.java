package com.sirius.chapter_one.questions;

public class QuestionOne {

	public boolean hasUniqueCharacters(final String uniqueString) {
		char[] charactersToCheck = new char[uniqueString.length()];
		int i = 0;
		
		for (final char c : uniqueString.toCharArray()) {
			charactersToCheck[i] = c;
			int uniqueCount = 0;
			
			for (int index = 0; index < charactersToCheck.length; index++) {
				if (c == uniqueString.charAt(index)) {
					uniqueCount++;
				}
				
				if (uniqueCount > 1) {
					return false;
				}
			}
			
			i++;
		}
		
		return true;
	}

}
