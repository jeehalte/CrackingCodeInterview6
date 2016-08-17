package com.sirius.chapter_one.questions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class QuestionOneTddTest {
	QuestionOne questionOne = new QuestionOne();

	@Test
	@Parameters({ "17", "23", "137", "132" })
	public void unique(final String s) {

		assertTrue(s + " has unique characters ", Boolean.valueOf(questionOne.hasUniqueCharacters(s)));
	}

	@Test
	@Parameters({ "44", "666", "177", "313" })
	public void notUnique(final String s) {

		assertFalse(s + " does not have unique characters ", Boolean.valueOf(questionOne.hasUniqueCharacters(s)));
	}
}
