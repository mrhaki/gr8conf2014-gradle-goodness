package com.mrhaki.gr8conf

import org.gradle.api.*

class Book {
	List<Project> chapters = []
 	String title

	void title(String title) {
		this.title = title
	}

	void chapter(Project project) {
		chapters << project
	}
}