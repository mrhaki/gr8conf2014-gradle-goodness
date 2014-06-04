package gr8conf

class SampleAppSpec extends spock.lang.Specification {

	def "simple feature spec"() {
		expect:
		'Gr8Conf is great' == 'Gr8Conf is gr8'
	}
}