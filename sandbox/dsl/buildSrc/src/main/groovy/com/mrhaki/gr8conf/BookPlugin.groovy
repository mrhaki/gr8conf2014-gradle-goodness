package com.mrhaki.gr8conf

import org.gradle.api.*
import org.gradle.api.tasks.*

class BookPlugin implements Plugin<Project> {
	void apply(Project project) {
		apply plugin: 'base'

		def book  = project.extensions.create('book', Book)

		afterEvaluate {
			tasks.create(name: 'aggregate') {
				onlyIf { !book.chapters.empty }

				doFirst {
					copy {
						from 'src/html'
						into "$buildDir/aggregate"
					}

					book.chapters.each { chapterProject ->
						copy {
							from chapterProject.file('src/html')
							into "$buildDir/aggregate/$chapterProject.name"
						}
					}
				}
			}
		}
	}
}