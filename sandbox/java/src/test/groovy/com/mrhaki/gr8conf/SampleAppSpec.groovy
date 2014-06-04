package com.mrhaki.gr8conf

class SampleAppSpec extends spock.lang.Specification {
	def "first spec"() {
		expect:
		'Gr8Conf is Gr8' == 'Gr8Conf is Great'
	}
}